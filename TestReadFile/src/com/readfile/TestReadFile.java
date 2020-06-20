package com.readfile;
import java.io.File;
import java.util.Scanner;
import com.exceptionhandler.FileExceptionHandler;
import com.model.MyException;

public class TestReadFile {

	public static void main(String[] args)throws MyException {
		// TODO Auto-generated method stub
		try{
			File myObjFile = new File("C:/Users/f7kyncb/Desktop/Fileread.txt");
			Scanner myReader = new Scanner(myObjFile); 
			do{
				String data = myReader.nextLine();
				System.out.println(data);
			}while (myReader.hasNext());
			myReader.close();
		}catch (Exception e) {
			try {
				FileExceptionHandler HandlerObj = new FileExceptionHandler(e);
			}catch (Exception e1){
			  System.out.println(e1.getMessage());
			  //e.printStackTrace();
			}
		}
	}

}
