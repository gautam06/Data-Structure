/*
Sorting on user defined object
----------------------------------------
In this example sorting is performed on employee salary
USe of Comparable Interface
*/

import java.util.*;  
import java.io.*; 
class Employee implements Comparable<Employee>{  
	int eid;  
	String ename;  
	long salary;  
	Employee(int eid,String ename,long salary){  
	this.eid=eid;  
	this.ename=ename;  
	this.salary=salary;  
	}  
  
	public int compareTo(Employee e){  
	if(salary==e.salary)  
		return 0;  
	else if(salary>e.salary)  
		return 1;  
	else  
		return -1;  
	}  
}  

 
public class CollectionsSort2{  
	public static void main(String args[]){  
		ArrayList<Employee> eal=new ArrayList<Employee>();  
		eal.add(new Employee(101,"Gautam",25000));  
		eal.add(new Employee(106,"Shivam",18000));  
		eal.add(new Employee(105,"Tejas",15000));  
		  
		System.out.println("Soring based on employee salary");  
		System.out.println("-----------------------------------------");
		Collections.sort(eal);  
		
		for(Employee e:eal){  
			System.out.println(e.eid+" "+e.ename+" "+e.salary);  
		}  
	}  
}  

/*Output 
-------------------------
Soring based on employee salary
-----------------------------------------
105 Tejas 15000
106 Shivam 18000
101 Gautam 25000

*/
