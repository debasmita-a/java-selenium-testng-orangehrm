package orangeHRM.trywithresources;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Runner {

	public static void main(String[] args) {

		readExcelData();
		//
		//
	}

	private static void readExcelData() {
		FileInputStream inputFile = null;
		try {
			inputFile = new FileInputStream("");
			// writing code to read from excel..
			// exception ->
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				inputFile.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	private static void readExcelData2() {

		//if our class implements AutoCloseable interface.
		try (FileInputStream fip = new FileInputStream(""); BufferedInputStream bis = new BufferedInputStream(fip)) {	// try with resources. 
			//Here we don't need to add the finally block to close the FileInputStream object.
			//When try block is exited, it will automatically close the FileInputStream object..
			//Also, if any exception occurs with try with resources block, it will be propagated to the main method
			//In case of try block, this will not be the case.
			//writing code..
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}

}
