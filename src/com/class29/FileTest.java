package com.class29;

public class FileTest {

	public static void main(String[] args) {
		System.out.println("======== Java Files ===============");
		File file = new JavaFile();
		file.Open();
		file.Edit();
		file.Close();
		System.out.println();
		System.out.println("======== Word Files ===============");
		
		File file2 = new WordFile();
		file2.Open();
		file2.Edit();
		file2.Close();
		System.out.println();
		System.out.println("======== PDF Files ===============");
		
		File file3 = new PDFFile();
		file3.Open();
		file3.Edit();
		file3.Close();
		
		
	}

}
