package pre.properties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.InvalidPropertiesFormatException;
import java.util.List;
import java.util.Properties;

public class PropTest {
	public static void fileSave(Properties p) throws IOException {
		FileOutputStream fos = new FileOutputStream("movies.xml");
		p.setProperty("1","패밀리맨,4,2000");
		p.setProperty("2","엘리멘탈,5,8000");
		p.setProperty("3","어벤져스,5,10000000");
		p.setProperty("4","구구콘,2,710");
		p.setProperty("5","포켓몬스터:뮤츠의역습,4,7000");
		p.setProperty("6","범죄도시1,5,1000");
		p.setProperty("7","범죄도시2,4,2000");
		p.setProperty("9","범죄도시3,3,3000");
		p.storeToXML(fos, "영화를 위한 주석입니다람쥐");
		fos.close();
	}
	public static void fileRead(Properties p) throws InvalidPropertiesFormatException, IOException {
		FileInputStream fis = new FileInputStream("movies.xml");
		p.loadFromXML(fis);
		List <Movies> mL = new ArrayList<>();
		for(String key : p.stringPropertyNames()) {
			String [] values = p.getProperty(key).split(",");
			Movies m = new Movies(values[0],Integer.parseInt(values[1]),Integer.parseInt(values[2]));
			mL.add(m);
		}
		Movies [] mArr = mL.toArray(new Movies[0]);
		//Arrays.sort(mArr,(Movies a,Movies b)->a.getRate()-b.getRate());
		Arrays.sort(mArr);
		for(Movies m : mArr) {
			System.out.println(m.toString());
		}
		
	}
	public static void main(String [] args) throws InvalidPropertiesFormatException, IOException {
		//fileSave(new Properties());
		fileRead(new Properties());
	}
	
	
}
