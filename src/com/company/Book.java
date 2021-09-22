package com.company;

import java.io.*;
//import java.io.FileNotFoundException;
//import java.util.Arrays;
//import java.util.LinkedList;
//import java.util.List;
import java.util.*;

public class Book {
    /**
     * @param args
     */
    public static void main(String[] args) throws Exception
    {
        ArrayList<String> BookList = new ArrayList<String>();
        String filename = "books2.csv";
        File file = new File(filename);

        /* ArrayList List Declaration */
        LinkedList<String> arraylist = new LinkedList<String>();

        /* Linked List Declaration */
        LinkedList<String> linkedlist = new LinkedList<String>();

        try {
            Scanner scanner = new Scanner(file); //parsing a CSV file into Scanner class constructor
            while(scanner.hasNext()) { //returns a boolean value
                String data = scanner.nextLine(); //find and returns the next complete row from this scanner

                // BookList.add(data); // add it to the Book List
                // System.out.println(BookList); // print each row


                // --- LinkedList Code STARTS ---
                linkedlist.add(data);
                System.out.println("Linked List Content: " + linkedlist);
                // Iterating LinkedList
                Iterator<String> iterator = linkedlist.iterator();
                while(iterator.hasNext()){
                    System.out.println(iterator.next());
                }
                // --- LinkedList Code ENDS ---

                // --- ArrayList Code STARTS ---
                arraylist.add(data);
                System.out.println("Array List Content: " + arraylist);
                // Iterating ArrayList
                for(String str:arraylist)
                    System.out.println(str);
                // --- ArrayList Code ENDS ---

            }
//          System.out.println("the element at index 2 is " + BookList.get(2));

            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
