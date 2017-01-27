import java.util.*;  
class CollectionsSort1{  
	public static void main(String args[]){  
	  
	  	System.out.println("Sorting using Collections.sort()");
		ArrayList<Integer> al=new ArrayList<>();  
		al.add(601);  
		al.add(Integer.valueOf(201));  
		al.add(254);// internally work as Integer.valueOf(254)  
		  
		Collections.sort(al);  
		 
		 System.out.println("Sorting on Integer Data");
		  
		Iterator<Integer> itr=al.iterator();  
		while(itr.hasNext()){  
			System.out.println(itr.next());  
		}  
		
		ArrayList<String> emp = new ArrayList<>();
		emp.add("Gautam");
		emp.add("Sarvam");
		emp.add("Parth");
		emp.add("Aman");
		
		Collections.sort(emp);
		
		System.out.println("Sorting on String Data");
		Iterator<String> eitr = emp.iterator();
		while(eitr.hasNext()){
			System.out.println(eitr.next());
		}
	}  
}  

/*Output
----------------------------------
Sorting using Collections.sort()
Sorting on Integer Data
201
254
601
Sorting on String Data
Aman
Gautam
Parth
Sarvam

*/
