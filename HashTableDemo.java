/*
HashTable
--------------------------------
implements a hashtable, which maps keys to values. 
inherits Dictionary class and implements the Map interface.

-A Hashtable is an array of list. Each list is known as a bucket. 
-The position of bucket is identified by calling the hashcode() method. 
-A Hashtable contains values based on the key.
-contains only unique elements.
-It may have not have any null key or value.
-It is synchronized.
*/

import java.util.*;
public class HashTableDemo {

   public static void main(String args[]) {
      // Create a hash map
      Hashtable<String,Double> balance = new Hashtable<>();
      Enumeration names;
      String str;
      double bal;

      balance.put("Gautam", new Double(6434.34));
      balance.put("Anil", new Double(223.22));
      balance.put("Shyam", new Double(378.00));
      balance.put("Tejas", new Double(199.22));
      balance.put("Raghav", new Double(59.08));

      // Show all balances in hash table.
      names = balance.keys();
      
      while(names.hasMoreElements()) {
         str = (String) names.nextElement();
         System.out.println(str + ": " + balance.get(str));
      }        
      System.out.println();
      
      // Deposit 1,000 into Zara's account
      bal = ((Double)balance.get("Gautam"));
      balance.put("Gautam", new Double(bal + 1000));
      System.out.println("Gautam's new balance: " + balance.get("Gautam"));
   }
}

/*Output
---------------------------------------------
Gautam: 6434.34
Anil: 223.22
Raghav: 59.08
Shyam: 378.0
Tejas: 199.22

Gautam's new balance: 7434.34

*/
