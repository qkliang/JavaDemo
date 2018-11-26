package com.lqk.io;

import java.io.File;

public class UpdateFileName {

	public static void main(String[] args) {
		
		System.out.println(System.currentTimeMillis());
		String url = "F:\\Video";
		String sOld = "";
		String sNew = "";
		update(url,sOld,sNew);
		System.out.println(System.currentTimeMillis());
	}
	
	private static void update(String url,String sOld,String sNew) {
		File file = new File(url);
		if(file.exists() && file.isDirectory()) {
			File[] childFiles = file.listFiles();
			String path = file.getAbsolutePath();
			for(File childFile : childFiles) {
				String oldName = childFile.getName();
				String newName = oldName.replace(sOld, sNew);
				childFile.renameTo(new File(path +"\\"+newName));
			}
		}
	}
}
