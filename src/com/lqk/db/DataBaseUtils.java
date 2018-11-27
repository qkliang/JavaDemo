package com.lqk.db;

import java.sql.Connection;
import java.sql.DriverManager;

public class DataBaseUtils {
	private Connection conn = null;
	MyXMLReader mxr = new MyXMLReader();
	public Connection getDBConnection() {
		try {
			Class.forName(mxr.getORACLEDRIVER());
			conn = DriverManager.getConnection(mxr.getURL(),mxr.getUSER(),mxr.getPASSWORD());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
}
