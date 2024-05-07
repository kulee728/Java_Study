package com.kh.io.serialize.ex1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {

	public static void serialize() throws IOException {
		Student student = new Student();
		String filename = "student.txt";
		
		FileOutputStream fos = new FileOutputStream(new File(filename));
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(student);
		
	}
	public static void deSerialize() throws IOException, ClassNotFoundException {
		String filename = "student.txt";
		FileInputStream fis = new FileInputStream(new File(filename));
		ObjectInputStream ois = new ObjectInputStream(fis);
		Student deSerializedStudent = (Student)ois.readObject();
		System.out.println(deSerializedStudent.toString());
	}
	
	public static void main(String[] args) throws IOException, ClassNotFoundException{
		// TODO Auto-generated method stub
		//serialize();
		deSerialize();
	}

}
