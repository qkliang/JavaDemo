package com.lqk.db;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;

public class MyXMLReader {
	private String ORACLEDRIVER;
	private String URL;
	private String USER;
	private String PASSWORD;

	public MyXMLReader() {
		try {
			File f = new File("./database/dbconfig.xml");
			/* 创建一个DocumentBuilderFactory的对象 */
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			// 创建一个DocumentBuilder的对象
			DocumentBuilder db = factory.newDocumentBuilder();
			// 通过DocumentBuilder对象的parser方法加载books.xml文件到当前项目下
			Document doc = db.parse(f);
			ORACLEDRIVER = doc.getElementsByTagName("driver").item(0).getFirstChild().getNodeValue();
			URL = doc.getElementsByTagName("url").item(0).getFirstChild().getNodeValue();
			USER = doc.getElementsByTagName("user").item(0).getFirstChild().getNodeValue();
			PASSWORD = doc.getElementsByTagName("password").item(0).getFirstChild().getNodeValue();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public String getORACLEDRIVER() {
		return ORACLEDRIVER;
	}

	public String getURL() {
		return URL;
	}

	public String getUSER() {
		return USER;
	}

	public String getPASSWORD() {
		return PASSWORD;
	}

}
