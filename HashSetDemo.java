import java.util.*;  
class Book {  
int id;  
String name,author,publisher;  
int quantity;  
public Book(int id, String name, String author, String publisher, int quantity) {  
    this.id = id;  
    this.name = name;  
    this.author = author;  
    this.publisher = publisher;  
    this.quantity = quantity;  
}  
}  
public class HashSetDemo {  
	public static void main(String[] args) {  
	    HashSet<Book> set=new HashSet<Book>();  
	    //Creating Books  
	    Book b1=new Book(601,"Let us C","Yashwant Kanetkar","BPB",4);  
	    Book b2=new Book(602,"Data Communications & Networking","Forouzan","Mc Graw Hill",5);  
	    Book b3=new Book(603,"Operating System","Galvin","Wiley",6);  
	    //Adding Books to HashSet  
	    set.add(b1);  
	    set.add(b2);  
	    set.add(b3);  
	    
	    //Traversing HashSet
	    System.out.println("Available Books");
	    System.out.println("-----------------------------");  
	    for(Book b:set){  
	    	System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);  
	    }
	    System.out.println("-----------------------------");
	    //Get Size Of HashSet
	    System.out.println("Size of HashSet: "+set.size());
	    
	    System.out.println("Remove the book object whose name is Let us C");
	    Book bx=null;
	    for(Book b:set){  
	    	if(b.name.equals("Let us C")){
	    		bx = b;
	    	}	    
	    }
	    set.remove(bx);  
	    
	    //Get Size Of HashSet
	    System.out.println("After Removing Size of HashSet: "+set.size());
	}	 
}
/*Output
-----------------------------------------------
Available Books
-----------------------------
601 Let us C Yashwant Kanetkar BPB 4
602 Data Communications & Networking Forouzan Mc Graw Hill 5
603 Operating System Galvin Wiley 6
-----------------------------
Size of HashSet: 3
Remove the book object whose name is Let us C
After Removing Size of HashSet: 2

*/
