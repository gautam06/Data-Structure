/*HashMap
-------------------------------------
A HashMap contains values based on the key.
It contains only unique elements.
It may have one null key and multiple null values.
It maintains no order.
*/

import java.util.Map;
import java.util.HashMap;

class Student{
	int rollno;
	String name;
	float per;
	
	Student(int rollno, String name, float per){
		this.rollno=rollno;
		this.name=name;
		this.per=per;
	}
	
	public void setRollno(int rollno){
		this.rollno=rollno;
	}
	public void setName(String name){
		this.name=name;
	}
	public void setPer(float per){
		this.per=per;
	}
	
	public int getRollno(){
		return rollno;
	}
	public String getName(){
		return name;
	}
	public float getPer(){
		return per;
	}
}

class HashMapDemo{

	private static HashMap<Integer,Student> hm = new HashMap<>();
	public static void main(String args[]){
		
		//insert object in hashmap
		hm.put(1,new Student(1,"Gautam",74.66f));
		hm.put(2,new Student(2,"Sarvam",72.41f));
		hm.put(3,new Student(3,"Chaital",50.22f));
    		
    		
    		displayStudentDetails();
    		
    		//update object stored in hashmap
    		if(hm.containsKey(1)){
    			Student s1 = hm.get(1);
    			s1.setPer(76.66f);	
    		}
    		System.out.println("\n------------------------------");
    		System.out.println("After Updating 1st Record");
    		displayStudentDetails();
    		    		
    		//removing object from hashmap   		
    		if(hm.containsKey(3)){
    			System.out.println("contais key");
    			hm.remove(3);	
    		}
    		System.out.println("\n------------------------------");
    		System.out.println("After Removing Third Record");
    		displayStudentDetails();
    		
    		System.out.println("\n------------------------------");
    		System.out.println("HashMap Size: "+hm.size());
	
		System.out.println("\n------------------------------");
		System.out.println("Clearing HashMap");
		hm.clear();
		System.out.println("HashMap Size: "+hm.size());
	}
	
	public static void displayStudentDetails(){
		//Iterate HashMap
		for(Map.Entry<Integer, Student> entry:hm.entrySet()){    
			Integer key=entry.getKey();  
			Student s=entry.getValue();  
			System.out.println("Key: "+key+" Value: "+s.getRollno()+" "+s.getName()+" "+s.getPer());   
    		}
	}
}

/*Output
----------------------------------------
Key: 1 Value: 1 Gautam 74.66
Key: 2 Value: 2 Sarvam 72.41
Key: 3 Value: 3 Chaital 50.22

------------------------------
After Updating 1st Record
Key: 1 Value: 1 Gautam 76.66
Key: 2 Value: 2 Sarvam 72.41
Key: 3 Value: 3 Chaital 50.22
contais key

------------------------------
After Removing Third Record
Key: 1 Value: 1 Gautam 76.66
Key: 2 Value: 2 Sarvam 72.41

------------------------------
HashMap Size: 2

------------------------------
Clearing HashMap
HashMap Size: 0

*/
