package com.kh.file;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileEx2 {

	public static void main(String[] args) throws IOException {
		String fileName = "practice.txt";
		File file = new File(fileName);
		if(file.exists()) {
			System.out.println("파일이 이미 존재합니다.");
		}
		else
			file.createNewFile();
		BufferedWriter bw = new BufferedWriter(new FileWriter(file,true));
		bw.write("버퍼쓰기로 하는 중 입니다.\n");
		bw.write("어때요? 잘 써지죠?");
		bw.flush();
		bw.close();
		System.out.println("잘 작성했습니다.");
	}

}
