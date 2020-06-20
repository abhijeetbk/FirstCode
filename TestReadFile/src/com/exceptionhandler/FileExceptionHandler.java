package com.exceptionhandler;

import java.io.FileNotFoundException;
import java.util.NoSuchElementException;
import com.model.MyException;


public class FileExceptionHandler {

	public FileExceptionHandler(Exception e) throws MyException{
		
		if (e instanceof FileNotFoundException){
			throw new MyException("File is not present. Please create one");
		}else if (e instanceof NoSuchElementException){
			throw new MyException("File is Empty");
		}
	}
}
