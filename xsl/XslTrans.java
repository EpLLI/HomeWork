package xsl;


import javax.xml.transform.Transformer;

import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;

import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

public class XslTrans {
	public static void main(String[] args) {
		try {
			TransformerFactory tf = TransformerFactory.newInstance();
			// установка используемого XSL-преобразования
			Transformer transformer = tf.newTransformer(new StreamSource("students.xsl"));
			// установка исходного XML-документа и конечного XML-файла
			transformer.transform(new StreamSource("students.xml"),	new StreamResult("new_students.html"));
			System.out.println("Transform " + " complete");

		} catch (TransformerException e) {

		e.printStackTrace();

		}
	}
}
