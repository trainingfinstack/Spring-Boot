package CrudOperationDemo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Scanner;

public class Operation {
	ArrayList<Employee> a = new ArrayList<Employee>();
    Scanner s = new Scanner(System.in);
    Scanner s1 = new Scanner(System.in);
    int pid;
    Iterator<Employee> i;
    boolean found =false;
    String pname ;
    String pcity;
    
    public void addData() {
    System.out.print("Enter Person Id: ");
  	  pid = s.nextInt();
  	  System.out.print("Enter Person Name: ");
  	  pname = s1.nextLine();
  	  System.out.print("Enter City: ");
  	  pcity = s1.nextLine();
  	  
  	  a.add(new Employee(pid, pname, pcity));
    }
    
    public void readData() {
    	if(!a.isEmpty()) {
    	 i = a.iterator();
   	  while(i.hasNext()) {
   		Employee p = i.next();
   		  System.out.println(p);
   	  }
    	} else {
    		System.out.println("empty list");
    	}

    }
    
    public void deleteData() {
    	found = false;
  	  System.out.print("Enter id to Delete: ");
  	  pid= s.nextInt();
  	  i= a.iterator();
  	  while(i.hasNext()) {
  		Employee p = i.next();
  		  if(p.getId()==pid) {
  			  i.remove();
  		System.out.println("Record is deleted");
  			  found = true;
  		  }
  	  } 
  	  if(!found) {
  		  System.out.println("Enter the correct id");
  	  }
    }
    
    public void updateData() {
    	  found = false;
    	  System.out.print("Enter id to Update: ");
    	  pid= s.nextInt();
    	  ListIterator<Employee> l = a.listIterator();
    	  while(l.hasNext()) {
    		  Employee p = l.next();
    		  if(p.getId()==pid) {
    			  System.out.print("Enter Person Name: ");
    	    	  pname = s1.nextLine();
    	    	  System.out.print("Enter City: ");
    	    	  pcity = s1.nextLine();  
    	    	   
    	    	  l.set(new Employee(pid, pname, pcity));
    			  System.out.println("Record is upadted");
    			  found = true;
    		  }
    	  } 
    	  if(!found) {
    		  System.out.println("Enter the correct id");
    	  }
    }
    
}
