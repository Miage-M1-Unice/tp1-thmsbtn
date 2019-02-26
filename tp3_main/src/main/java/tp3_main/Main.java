package tp3_main;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;

public class Main {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		URL[] url = new URL[1];
		url[0] = new URL("./tp3_test");
		
		URLClassLoader urlCL = new URLClassLoader(url);
		
		
	}

}
