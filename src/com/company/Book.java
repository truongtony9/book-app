package com.company;

//import java.io.*;
import java.io.File;
//import java.io.FileNotFoundException;
//import java.util.Arrays;
//import java.util.LinkedList;
//import java.util.List;
import java.util.Scanner;

public class Book {

    public static void main(String[] args) throws Exception
    {
        //parsing a CSV file into Scanner class constructor
        Scanner sc = new Scanner(new File("books.csv"));
         sc.useDelimiter(",");   //sets the delimiter pattern
        	while (sc.hasNext())  //returns a boolean value
        	{
        		System.out.print(sc.next());  //find and returns the next complete token from this scanner
        	}
        sc.close();  //closes the scanner
    }
}