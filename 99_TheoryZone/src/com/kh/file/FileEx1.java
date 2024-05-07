package com.kh.file;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileEx1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file = new File("text.txt");
		if(file.exists()) {
			System.out.println("파일이 이미 존재합니다.");
		}
		else {
			file.createNewFile();
			System.out.println("파일을 생성했습니다.");
		}
		FileWriter fw = new FileWriter(file);
		fw.write("FileWriter 예시 입니다.\n");
		fw.write("글쓰는 방법을 진행하고 있습니다.\n");
		fw.close();
		
	}

}
