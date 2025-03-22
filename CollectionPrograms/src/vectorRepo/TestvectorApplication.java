package vectorRepo;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Vector;

public class TestvectorApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
Scanner sc=new Scanner(System.in);
		
		/*
		  Case 1: Add New Element in Vector 
			Case 2: View All Elements 
			Case 3: Count number of element 
			Case 4: Search element by contains
			Case 5: Search Element by index 
			Case 6: delete element by using index 
			Case 7: Fetch elements using get() method 
			Case 8: SubList 
			Case 9: Remove by element 

		 */
		
		// create the vector array for storing the object data
			Vector v=new Vector();
		do {
		System.out.println("1: add new element in vector");
		System.out.println("2: view all element");
		System.out.println("3: count number of element");
		System.out.println("4: search element by contains");
		System.out.println("5: search element by index");
		System.out.println("6: fetch element usig get() method");
		System.out.println("7: sublist");
		System.out.println("8: Remove element in vetor");
		int choice=sc.nextInt();
		switch(choice) {
		case 1:
			//add new element in vector
			System.out.println("==========================================================================");
			System.out.println("enter the how many element we want to insert in vector");
			int size=sc.nextInt();
			System.out.println("eneter the element");
			for(int i=0;i<size;i++) {
				v.add(sc.nextInt());
			}
			System.out.println("==========================================================================");
			break;
		case 2:
			//view all element
			System.out.println("==========================================================================");
			System.out.println("the element of the vector is");
			Iterator i=v.iterator();
			while(i.hasNext()) {
				System.out.println(i.next());
			}
			System.out.println("==========================================================================");
			break;
		case 3:
			//count number of element
			System.out.println("==========================================================================");
			int count=v.size();
			if(count>0) {
			System.out.println(count+  "element is present in vector");
			}else {
				System.out.println("vector are empty please insert the element in vector");
			}
			System.out.println("==========================================================================");
			break;
		case 4:
			// search element by contails
			System.out.println("==========================================================================");
			if(v.size()>0) {
				System.out.println("enter the number for serching the number");
				int no=sc.nextInt();
				boolean ele=v.contains(no);
				if(ele) {
					System.out.println("element is present in the vector");
				}else {
					System.out.println("element is not present in the vector");
				}
			}
			System.out.println("==========================================================================");
			break;
		case 5:
			// search element by contains
			System.out.println("==========================================================================");
			if(v!=null) {
				System.out.println("enter the index of the element");
				int index=sc.nextInt();
			Object obj=v.get(index);
			System.out.println(obj+" is present element in"+index);
					
			}else {
				System.out.println("vector is empty");
			}
			System.out.println("==========================================================================");
			
			break;
		case 6:
			//fetch element by using get method
			System.out.println("==========================================================================");
			if(v!=null) {
			for(int j=0;j<v.size();j++) {
				System.out.println(v.get(j));
			}
			}else {
				System.out.println("the vector is empty");
			}
			System.out.println("==========================================================================");
			break;
		case 7:
			//sublist
			System.out.println("==========================================================================");
			if(v!=null) {
			System.out.println("eneter the first index and last index to find the sublist");
			int in1=sc.nextInt();
			int in2=sc.nextInt();
			if(in1>0 && in2<v.size()) {
			List l=v.subList(in1, in2);
			System.out.println(l);
			}else {
				System.out.println("inter the valid input");
			}
			}else {
				System.out.println("vector is empty first add the element in the vector");
			}
			System.out.println("==========================================================================");
			break;
		case 8:
			//remove element in vector
			System.out.println("==========================================================================");
			if(v!=null) {
			boolean delete=v.removeAll(v);
			if(delete) {
				System.out.println("remove the all element of a vector");
			}else {
				System.out.println("not remove the all element of a vector");
			}
			}else {
				System.out.println("vector is empty please add the element in a vector");
			}
			System.out.println("==========================================================================");
			break;
			
			
			default:
				System.out.println("enter the valid input");
		}
			
		}while(true);
		
		  
		
		

	}

}
