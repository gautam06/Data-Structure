/*
Map Interface
-----------------------------------
Map contains only unique keys.
Map is useful if you have to search, update or delete elements on the basis of key.

Simple example for adding object in map
*/

import java.util.*;  
class MapInterfaceDemo{  
 	public static void main(String args[]){  
 	 	Map<Integer,String> map=new HashMap<Integer,String>();  
 	 	map.put(1,"C++");  
 	 	map.put(2,"JAVA");  
 	 	map.put(3,"Python");
 	 	map.put(4,"Ruby");  
  		
  		 //Traversing Map    
 	 	for(Map.Entry m:map.entrySet()){  
 	  		System.out.println(m.getKey()+" "+m.getValue());  
 	 	}  
 	}  
}  

/*Output
---------------------------------
1 C++
2 JAVA
3 Python
4 Ruby

*/
