package test.io;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReadTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			fr = new FileReader("c:\\temp\\a.txt");
			br = new BufferedReader(fr);
			String oneLine = "";
			while((oneLine=br.readLine()) != null) {
			System.out.println(oneLine);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if(br != null) br.close();
				if(fr != null) fr.close();
			}catch(IOException e) {
		}
	}
	}
}