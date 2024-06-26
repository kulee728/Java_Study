package ncs4.test2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.InvalidPropertiesFormatException;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;

public class PropTest {
	public static void fileSave(Properties p) throws IOException {
		p.setProperty("1", "apple,1200,22");
		p.setProperty("2", "banana,1200,17");
		p.setProperty("3", "cherry,1200,120");
		p.setProperty("4", "watermellon,1200,5");
		p.setProperty("5", "strawberry,1200,70");
		p.setProperty("6", "coconut,1200,8");
		FileOutputStream fos = new FileOutputStream("data.xml");
		p.storeToXML(fos, "Fruits comment");
		fos.close();
	}
	public static void fileOpen(Properties p) throws InvalidPropertiesFormatException, IOException {
		FileInputStream fis = new FileInputStream("data.xml");
		BufferedReader br = new BufferedReader(new FileReader(new File("data.xml")));
		List <Fruit> fl = new ArrayList<>();
		p.loadFromXML(fis);
	/*	for(Object o :p.values()) {
			fl.add((Fruit) o);
		}*/
		
		for(String key : p.stringPropertyNames()) {
			String[] values = p.getProperty(key).split(",");
			fl.add(new Fruit(values[0],Integer.parseInt(values[1]),
					Integer.parseInt(values[2])));
		}
		Fruit[] fArr = fl.toArray(new Fruit[0]);
		Arrays.sort(fArr,(Fruit a, Fruit b)-> a.quantity - b.quantity);
		
		for(Fruit f : fArr)
			System.out.println(f.toString());
	}
	
	public static void main(String[] args) throws IOException {
		
		Properties p = new Properties();
		//fileSave(p);
		fileOpen(new Properties());
	}

}
