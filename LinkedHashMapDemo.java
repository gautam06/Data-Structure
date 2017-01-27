/*LinkedHashMap
------------------------------------------
-A LinkedHashMap contains values based on the key.
-It contains only unique elements.
-It may have one null key and multiple null values.
-It is same as HashMap instead maintains insertion order.
*/

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {
    public static void main(String[] args) {
        // Map representing (Company, share price)

        Map<String, Double> linkedHashMap = new LinkedHashMap<String, Double>();

        linkedHashMap.put("Apple", new Double(91.98));

        linkedHashMap.put("Sony", new Double(16.76));

        linkedHashMap.put("Dell", new Double(30.47));

        linkedHashMap.put("HP", new Double(33.91));

        linkedHashMap.put("IBM", new Double(181.71));
 
        // Displaying the contents of the LinkedHashMap

        System.out.println("Contents of LinkedHashMap : " + linkedHashMap);

        // Notice the order of the elements is same as the order of insertion

        System.out.println("\nValues of map after iterating over it : ");

        for (String key : linkedHashMap.keySet()) {

            System.out.println(key + ":\t" + linkedHashMap.get(key));

        }

        // Getting the value for a particular key

        System.out.println("\nThe current share price of HP is : "

                + linkedHashMap.get("HP"));

        // Getting the size of the LinkedHashMap

        System.out.println("\nThe size of the LinkedHashMap is : " + linkedHashMap.size());

        // Checking whether the LinkedHashMap is empty

        System.out.println("\nIs LinkedHashMap empty : " + linkedHashMap.isEmpty());

        //Checking whether Map contains a particular key or value

        System.out.println("\nLinkedHashMap contains Sony as key? : " + linkedHashMap.containsKey("Sony"));

        System.out.println("LinkedHashMap contains 999.0 as value? : " + linkedHashMap.containsValue(999.0));
         
        // Removing a particular value
        System.out.println("\nRemove entry for Dell : " + linkedHashMap.remove("Dell"));
        
        System.out.println("Content of LinkedHashMap removing Dell: " + linkedHashMap);
 
        // Clearing the LinkedHashMap
        linkedHashMap.clear();
        
        System.out.println("\nContent of LinkedHashMap after clearing: " + linkedHashMap);
    }
}

/*Output
-----------------------------------------
Contents of LinkedHashMap : {Apple=91.98, Sony=16.76, Dell=30.47, HP=33.91, IBM=181.71}

Values of map after iterating over it : 
Apple:	91.98
Sony:	16.76
Dell:	30.47
HP:	33.91
IBM:	181.71

The current share price of HP is : 33.91

The size of the LinkedHashMap is : 5

Is LinkedHashMap empty : false

LinkedHashMap contains Sony as key? : true
LinkedHashMap contains 999.0 as value? : false

Remove entry for Dell : 30.47
Content of LinkedHashMap removing Dell: {Apple=91.98, Sony=16.76, HP=33.91, IBM=181.71}

Content of LinkedHashMap after clearing: {}

*/

