package com.lqk.db;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class ReadXML {

	public static void main(String[] args) {
		run("");
		//C:\Users\lqk\eclipse-workspace\JavaDemo\datebase
	}
	public  static void run(String xmlpath) {
		// ����һ��DocumentBuilderFactory�Ķ���
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		// ����һ��DocumentBuilder�Ķ���
		try {
			// ����DocumentBuilder����
			DocumentBuilder db = dbf.newDocumentBuilder();
			// ͨ��DocumentBuilder�����parser��������books.xml�ļ�����ǰ��Ŀ��
			Document document = db.parse("./database/dbconfig.xml");
			// ��ȡ����databaseConfig�ڵ�ļ���
			NodeList rootList = document.getElementsByTagName("databaseConfig");
			System.out.println(rootList.getLength());
//			Node resources = rootList.item(0);
//			NodeList childNodes = resources.getChildNodes();
//			System.out.println(childNodes.item(0).getFirstChild().getNodeValue());

//			for (int i = 0; i < bookList.getLength(); i++) {
//				System.out.println("=================���濪ʼ������" + (i + 1) + "���������=================");
//				// ͨ�� item(i)���� ��ȡһ��book�ڵ㣬nodelist������ֵ��0��ʼ
//				Node book = bookList.item(i);
//				// ��ȡbook�ڵ���������Լ���
//				NamedNodeMap attrs = book.getAttributes();
//				System.out.println("�� " + (i + 1) + "���鹲��" + attrs.getLength() + "������");
//				// ����book������
//				for (int j = 0; j < attrs.getLength(); j++) {
//					// ͨ��item(index)������ȡbook�ڵ��ĳһ������
//					Node attr = attrs.item(j);
//					// ��ȡ������
//					System.out.print("��������" + attr.getNodeName());
//					// ��ȡ����ֵ
//					System.out.println("--����ֵ" + attr.getNodeValue());
//				}
//				// ����book�ڵ���ӽڵ�
//				NodeList childNodes = book.getChildNodes();
//				// ����childNodes��ȡÿ���ڵ�Ľڵ����ͽڵ�ֵ
//				System.out.println("��" + (i + 1) + "���鹲��" + childNodes.getLength() + "���ӽڵ�");
//				for (int k = 0; k < childNodes.getLength(); k++) {
//					// ���ֳ�text���͵�node�Լ�element���͵�node
//					if (childNodes.item(k).getNodeType() == Node.ELEMENT_NODE) {
//						// ��ȡ��element���ͽڵ�Ľڵ���
//						System.out.print("��" + (k + 1) + "���ڵ�Ľڵ�����" + childNodes.item(k).getNodeName());
//						// ��ȡ��element���ͽڵ�Ľڵ�ֵ
//						System.out.println("--�ڵ�ֵ�ǣ�" + childNodes.item(k).getFirstChild().getNodeValue());
//						// System.out.println("--�ڵ�ֵ�ǣ�" + childNodes.item(k).getTextContent());
//					}
//				}
//				System.out.println("======================����������" + (i + 1) + "���������=================");
//			}
//		} catch (ParserConfigurationException e) {
//			e.printStackTrace();
//		} catch (SAXException e) {
//			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
