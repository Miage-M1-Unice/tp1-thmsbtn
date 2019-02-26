package MIAGE_M1.FileSystem;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;


public class FileFile {
	public List<File> getListFile(File f) throws IOException{
		List<File> lFile =new ArrayList<File>();
		File[] racine =  f.listFiles();
		if(f.isDirectory()) {
			String absPathFile = f.getPath();
			if(racine != null && racine.length!=0) {
				for (File fi : racine) {
					
					System.out.println(fi.getName());
					File[] file1 =  f.listFiles();
					if(file1.length !=0 && file1 == null) {
						for (File fil : file1) {
							System.out.println(fi.getName());
						}
					}
				}
			}
			
			
			
			System.out.println("abs :"+ absPathFile);
			
		}
		
		return lFile;
	}
}
