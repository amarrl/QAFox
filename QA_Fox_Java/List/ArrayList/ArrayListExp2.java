package ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListExp2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
ArrayList <String> list=new ArrayList<String>();
		
		//using add() method for adding objects into ArrayList
		list.add("Arun");
		list.add("varun");
		list.add("Tharun");
		list.add("Arun");
		
		
		/*
		list.add(0, "Amar");
		System.out.println(list);
		System.out.println("=============================");
		
		System.out.println("InOrder to replce the exsiting obje with new one will use Set() method");
		
		list.set(0, "Amar Raj");
		
		System.out.println("After Setting new object"+list);
		
		System.out.println("Inorder to get the index of the object need to use indexOf()method if object not there means returns -1");
		
		System.out.println(list.indexOf("Index value is "+"Amar Rajj"));
		
		System.out.println("IndexofLast occurance of the object is "+list.lastIndexOf("Arun"));
		
		//sorting the array list in asendeing order
		//System.out.println("===============");
		//Collections.sort(list);
		System.out.println(list);
		
		//useing iterator method for iterating and retriving the Arraylist object one by one
		System.out.println("=================");
		
		Iterator i=list.iterator();
		
		while(i.hasNext()) {
			System.out.println("Using iterator  "+i.next());
		}
		System.out.println("===============listIterator");
		*/
		//listIerator ius advance one 
		
		ListIterator listitr=list.listIterator();
		listitr.next();   // cursor ponting to 1st object
		listitr.next();   // cursor ponting to 2st object
		listitr.next();   // cursor ponting to 3st object
		listitr.next();   // cursor ponting to 4st object i.e Arun
		
		
		while(listitr.hasPrevious()) {
			System.out.println(listitr.previous());
		}
		
		

		

	}

}
