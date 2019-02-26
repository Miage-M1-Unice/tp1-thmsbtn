package MIAGE_M1.FileSystem;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class Main1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileFile ff = new FileFile();
		File f = new File(".");
		List<File> dd = ff.getListFile(f);
	}

}
