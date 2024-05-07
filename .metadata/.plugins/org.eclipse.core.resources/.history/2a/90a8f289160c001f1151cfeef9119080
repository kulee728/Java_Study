package pre.properties2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.InvalidPropertiesFormatException;
import java.util.List;
import java.util.Properties;

public class PropTest {

	public static void fileSave(Properties p) throws IOException {

		fos.close();
		
	}
	
	public static void fileRead(Properties p) throws InvalidPropertiesFormatException, IOException {
		FileInputStream fis = new FileInputStream("Drama.xml");
		p.loadFromXML(fis);
		List<Drama> dL = new ArrayList<Drama>();
		for(String keys : p.stringPropertyNames()) {
			String []values = p.getProperty(keys).split(",");
			Drama d = new Drama(values[0],Integer.parseInt(values[1]),Integer.parseInt(values[2]));
			dL.add(d);
		}
		Drama[] dArr = dL.toArray(new Drama[0]);
		Arrays.sort(dArr);
		for(Drama d : dArr) {
			System.out.println(d.toString());
		}
		
	}
	
	
	
	public static void main(String[] args) throws IOException {
		//fileSave(new Properties());
		fileRead(new Properties());
	}

}
