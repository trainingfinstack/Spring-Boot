package CrudOperation;

import java.util.*;

class Person{
	int id;
	String name;
	String city;
	
	public Person(int id, String name, String city) {

		this.id = id;
		this.name = name;
		this.city = city;
	}

	public int getId() {
		return id;
	}

	
	@Override
	public String toString() {
		return "[id=" + id + ", name=" + name + ", city=" + city + "]";
	}
	
	
}


public class CrudOperation {

	public static void main(String[] args) {
		
	 ArrayList<Person> a = new ArrayList<Person>();
     Scanner s = new Scanner(System.in);
     Scanner s1 = new Scanner(System.in);
     int ch;
     do {
    	 System.out.println("1. INSERT");
    	 System.out.println("2. READ");
    	 System.out.println("3. DELETE");
    	 System.out.println("4. UPDATE");
    	 System.out.println("0. STOP");
    	 System.out.print("Enter the code to perform opertion: ");
    	 ch=s.nextInt();
    	 
    	 switch(ch) {
    	      case 1:
    	    	  System.out.print("Enter Person Id: ");
    	    	  int pid = s.nextInt();
    	    	  System.out.print("Enter Person Name: ");
    	    	  String pname = s1.nextLine();
    	    	  System.out.print("Enter City: ");
    	    	  String pcity = s1.nextLine();
    	    	  
    	    	  a.add(new Person(pid, pname, pcity));
    	    	  System.out.println ("--------------------------");
    	    	  break;
    	      case 2:
    	    	  Iterator<Person> i = a.iterator();
    	    	  while(i.hasNext()) {
    	    		  Person p = i.next();
    	    		  System.out.println(p);
    	    	  }
    	    	  System.out.println ("--------------------------");
    	    	  break;
    	      case 3:
    	    	  boolean found = false;
    	    	  System.out.print("Enter id to Delete: ");
    	    	  pid= s.nextInt();
    	    	  i= a.iterator();
    	    	  while(i.hasNext()) {
    	    		  Person p = i.next();
    	    		  if(p.getId()==pid) {
    	    			  i.remove();
    	    		System.out.println("Record is deleted");
    	    			  found = true;
    	    		  }
    	    	  } 
    	    	  if(!found) {
    	    		  System.out.println("Enter the correct id");
    	    	  }
    	    	  System.out.println ("--------------------------");
    	    	  break;
    	      case 4:
    	    	  found = false;
    	    	  System.out.print("Enter id to Update: ");
    	    	  pid= s.nextInt();
    	    	  ListIterator<Person> l = a.listIterator();
    	    	  while(l.hasNext()) {
    	    		  Person p = l.next();
    	    		  if(p.getId()==pid) {
    	    			  System.out.print("Enter Person Name: ");
    	    	    	  pname = s1.nextLine();
    	    	    	  System.out.print("Enter City: ");
    	    	    	  pcity = s1.nextLine();  
    	    	    	   
    	    	    	  l.set(new Person(pid, pname, pcity));
    	    			  System.out.println("Record is deleted");
    	    			  found = true;
    	    		  }
    	    	  } 
    	    	  if(!found) {
    	    		  System.out.println("Enter the correct id");
    	    	  }
    	    	  break;
    	    	  
    	 }
    	 
     }while(ch!=0);
		
	}

}
