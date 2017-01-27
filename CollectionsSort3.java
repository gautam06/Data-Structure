import java.util.*;  
import java.io.*;  

class Student{  
	int rollno;  
	String name;  
	int age;  
	Student(int rollno,String name,int age){  
		this.rollno=rollno;  
		this.name=name;  
		this.age=age;  
	}  
}

class NameComparator implements Comparator{  
	public int compare(Object o1,Object o2){  
		Student s1=(Student)o1;  
		Student s2=(Student)o2;  
		  
		return s1.name.compareTo(s2.name);  
	}  
}

class AgeComparator implements Comparator{  
	public int compare(Object o1,Object o2){  
		Student s1=(Student)o1;  
		Student s2=(Student)o2;  
		  
		if(s1.age==s2.age)  
			return 0;  
		else if(s1.age>s2.age)  
			return 1;  
		else  
			return -1;  
	}  
}    
  
class CollectionsSort3{  
	public static void main(String args[]){  
	  
		ArrayList<Student> al=new ArrayList<Student>();  
		al.add(new Student(101,"Vijay",23));  
		al.add(new Student(106,"Ajay",27));  
		al.add(new Student(105,"Jai",21));  
		  
		System.out.println("Sorting based on name...");  
		  
		Collections.sort(al,new NameComparator());  
		Iterator<Student> itr=al.iterator();  
		
		while(itr.hasNext()){  
			Student st=(Student)itr.next();  
			System.out.println(st.rollno+" "+st.name+" "+st.age);  
		}  
		  
		System.out.println("sorting based on age");  
		  
		Collections.sort(al,new AgeComparator());  
		Iterator<Student> itr2=al.iterator();  
		
		while(itr2.hasNext()){  
			Student st=(Student)itr2.next();  
			System.out.println(st.rollno+" "+st.name+" "+st.age);  
		}    
	}  
}

/*Output
--------------------------------
Sorting based on name...
106 Ajay 27
105 Jai 21
101 Vijay 23
sorting based on age
105 Jai 21
101 Vijay 23
106 Ajay 27

*/
