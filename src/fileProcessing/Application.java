package fileProcessing;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File file = new File("myfile.txt");
		
		// java 7 features introduce the try with resources
		// try with resources means we can handle the all resources in try block so we don't need to close the resources in finally block 
		// or any other where automatically close that file
		
		try (FileReader fileReader = new FileReader(file); 
				BufferedReader bufferedReader = new BufferedReader(fileReader);) {
			
			
			String line = bufferedReader.readLine();
			
			while(line != null) {
				System.out.println(line);
				line = bufferedReader.readLine();
			}
			
		}catch(FileNotFoundException e) {
			System.out.println("File Not Found..!");
		}catch(IOException e) {
			System.out.println("Problem readig the file " + file.getName());
		}
		

	}

}
