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
			// ��������� ������������� XSL-��������������
			Transformer transformer = tf.newTransformer(new StreamSource("students.xsl"));
			// ��������� ��������� XML-��������� � ��������� XML-�����
			transformer.transform(new StreamSource("students.xml"),	new StreamResult("new_students.html"));
			System.out.println("Transform " + " complete");

		} catch (TransformerException e) {

		e.printStackTrace();

		}
	}
}
