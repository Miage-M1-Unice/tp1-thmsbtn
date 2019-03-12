package tp3_main;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;

public class Main {

	public static void main(String[] args) throws MalformedURLException{
		// TODO Auto-generated method stub
		URL[] url = new URL[1];
		url[0] = new URL("file:///~/Documents/MIAGE/Programmation_Av/tp-thmsbtn/tp3_test");
		String classTest = "target/classes/tp3_test/Test.class";
		
		
		
		URLClassLoader urlCL = new URLClassLoader(url);
		
		
		try {
			urlCL.loadClass(classTest);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Main.main()"+urlCL.getClass());
		
	}

}
