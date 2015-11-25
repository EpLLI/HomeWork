package Parseri;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

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

public class Parseri {
	public static void main(String args[]) {
		System.out.println("1 DOM");
		System.out.println("2 Sax");
		System.out.println("3 StAX");
		Scanner n = new Scanner(System.in);
		int c = n.nextInt();
		
		switch (c) {
		case 1:
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
			break;
		case 2:
			try {

				XMLReader reader = XMLReaderFactory.createXMLReader();
				Sax handler = new Sax();
				reader.setContentHandler(handler);
				reader.parse("students.xml");
			} catch (SAXException e) {
				System.err.print("ошибка SAX парсера" + e);
			} catch (IOException e) {
				System.err.print("ошибка I/О потока " + e);
			}
			break;
		case 3:
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
			break;
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
		// получение и вывод информации об атрибутах элемента
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
