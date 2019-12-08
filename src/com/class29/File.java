package com.class29;
/*
 * Create a class File that will have the following 
 * behaviors: open, edit, close. 
 * Edit and close are implemented method while 
 * open is an abstract. 
 * Create 3 subclasses: 
 * JavaFile, WordFile, PDFFile 
 * that will provide specific implementation of open behaviour: 
 * Example: to open .java file we need notepad++ or sublime text, to open .doc file we need Microsoft word to be installed etc
 */
public abstract class File {
	public void Edit() {
		System.out.println("Edit your file ");
	}
	public void Close() {
		System.out.println("Close your file when done");
	}
	public abstract void Open();
	

}
class JavaFile extends File{

	@Override
	public void Open() {
		System.out.println("Install notepad++ or sublime to open the text file");
	}
	
}
class WordFile extends File{

	@Override
	public void Open() {
		System.out.println("Microsoft Word is required to open the .doc file");
	}
	
}
class PDFFile extends File{

	@Override
	public void Open() {
		System.out.println("Install Acrobat Reader to open PDF file");
	}
	
}