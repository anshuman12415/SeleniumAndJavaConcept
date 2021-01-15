package exceptions;

import java.io.BufferedReader;
import java.io.FileReader;

public class ThrowsException {
	public static void main(String[] args) throws  Exception {
		FileReader fr = null;
		fr = new FileReader("C:\\Users\\anshu\\OneDrive\\Desktop\\read.txt");
		
		BufferedReader br= new BufferedReader(fr);
		System.out.println(br.readLine());
		
		Thread.sleep(2000);
	}

}
