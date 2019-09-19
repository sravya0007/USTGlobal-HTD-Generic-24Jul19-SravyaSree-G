package com.dev.filehandling;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class FileCommonsUtil {

	public static void main(String[] args) throws IOException {
		File file = new File("D:/hello.txt");
		FileUtils.touch(file);

		if (file.exists()) {
			System.out.println("File Exsits..");
		} else {
			System.out.println("File doesn`t exsits");
		}
		/*
		 * FileUtils.deleteQuietly(file); if (file.exists()) {
		 * System.out.println("File Exsits.."); } else {
		 * System.out.println("File doesn`t exsits"); }
		 */
		
	
	}
}
