package FactoriSingletonParser;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.DefaultHandler;
import org.xml.sax.helpers.XMLReaderFactory;

public class FactorySingletonPatternPars {
	public static void main(String[] args) {

		ParseSingleton.factoryParse("DOM").construct();

		ParseSingleton.factoryParse("SAX").construct();

		ParseSingleton.factoryParse("StAX").construct();
	}
}

interface Pars {

	void construct();

}

class ParseSingleton {

	public static ParseSingleton instance;

	private ParseSingleton() {
	}

	public static ParseSingleton getInstance() {
		if (instance == null) {
			instance = new ParseSingleton();
		}
		return instance;
	}

	public static Pars factoryParse(String parserName) {
		if (parserName.equals("DOM")) {
			return new DOMPars();
		} else if (parserName.equals("SAX")) {
			return new SAXPars();
		} else if (parserName.equals("StAX")) {
			return new StAXPars();
		}
		return null;
	}
}

class DOMPars implements Pars {

	@Override
	public void construct() {
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = null;
		Document doc = null;
		try {
			builder = factory.newDocumentBuilder();
		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		}
		File f = new File("students.xml");
		try {
			doc = builder.parse(f);
		} catch (SAXException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		Element root = doc.getDocumentElement();
		NodeList nList = root.getChildNodes();
		for (int i = 0; i < nList.getLength(); i++) {

			System.out.println(nList.item(i).getNodeName());
		}
	}
}

class SAXPars implements Pars {

	@Override
	public void construct() {
		try {

			XMLReader reader = XMLReaderFactory.createXMLReader();
			Sax handler = new Sax();
			reader.setContentHandler(handler);
			reader.parse("students.xml");
		} catch (SAXException e) {
			System.err.print("SAX" + e);
		} catch (IOException e) {
			System.err.print(" I/ " + e);
		}
	}

}

class StAXPars implements Pars {

	@Override
	public void construct() {
		boolean isName = false;
		boolean isFac = false;
		XMLInputFactory factory2 = XMLInputFactory.newFactory();
		try {
			XMLStreamReader reader = factory2.createXMLStreamReader(new FileInputStream("students.xml"));
			while (reader.hasNext()) {
				int res = reader.next();
				if (res == reader.START_ELEMENT) {

					if (reader.getLocalName().equals("lastName"))
						isName = true;
					else if (reader.getLocalName().equals("faculty"))
						isFac = true;
				} else if (res == reader.CHARACTERS) {
					if (isName) {
						System.out.println("lastName:" + reader.getText());
						isName = false;
					} else if (isFac) {
						System.out.println("faculty:" + reader.getText());
						isFac = false;
					}
				}
			}
		} catch (FileNotFoundException | XMLStreamException e) {
			e.printStackTrace();
		}
	}
}

class Sax extends DefaultHandler {

	@Override
	public void startDocument() {
		System.out.println("Parsing started");
	}

	@Override
	public void startElement(String uri, String localName, String qName, Attributes attrs) {
		String s = localName;
		for (int i = 0; i < attrs.getLength(); i++) {
			s += " " + attrs.getLocalName(i) + "=" + attrs.getValue(i);
		}
		System.out.print(s.trim());
	}

	@Override
	public void characters(char[] ch, int start, int length) {
		System.out.print(" " + new String(ch, start, length) + " ");
	}

	@Override
	public void endElement(String uri, String localName, String qName) {
		System.out.print(localName);
	}

	@Override
	public void endDocument() {
		System.out.println("\nParsing ended");
	}
}
