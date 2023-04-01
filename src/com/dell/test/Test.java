package com.dell.test;

import java.beans.XMLDecoder;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

import com.dell.entity.Employee;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		Employee e = new Employee();
		
		
		e.setEmpid(110);
		e.setEmpname("Ravi");
		e.setSalary(2300.00);
		
		 // convert the object to XML and write it to a file
		try (XMLEncoder encoder = new XMLEncoder(new BufferedOutputStream(new FileOutputStream("D:\\file.xml")))) {
		      encoder.writeObject(e);
		    } catch (IOException k) {
		      k.printStackTrace();
		   }
		*/
		// read the XML file and convert it back into a Java object
	    try (XMLDecoder decoder = new XMLDecoder(new BufferedInputStream(new FileInputStream("D:\\file.xml")))) {
	    	Employee e= (Employee) decoder.readObject();
	      System.out.println(e.toString());
	    } catch (IOException e) {
	      e.printStackTrace();
	    }
	    
	  }

	}


