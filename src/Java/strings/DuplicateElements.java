/* WAP to remove duplicate words in a String array.
 */

package Java.strings;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateElements {

	public static void main(String[] args) {
		 String names[]= {"Java","JavaScript","Ruby","C","Python","Java"};
		 
		 //Worst Solution Compare each element O(n*n)
		 for(int i=0;i<names.length;i++)
		 {
			 for(int j=i+1;j<names.length;j++)
			 {
				 if(names[i].equals(names[j]))
				 {
					 System.out.println("Duplicate Elements is: "+names[i]);
				 }
			 }
		 } 
		 
		 //Using HashSet[It takes only unique values] O(n)
		 
		 Set<String> store = new HashSet<String>();
		 
		 for(String name:names)
		 {
			 if(store.add(name)==false)
			 {
				 System.out.println("Duplicate Elements is[using HashSet]: "+name);
			 }
		 }
		 
		 //Using HashMap O(2n)
		 Map<String,Integer> storeMap= new HashMap<String,Integer>();
		 for(String name:names)
		 {
			 Integer count=storeMap.get(name);
			 if(count==null)
			 {
				 storeMap.put(name, 1);
			 }
			 
			 else
			 {
				 storeMap.put(name, ++count);
			 }
		 }
		 
		 //get the values from this HashMap
		 Set<Entry<String,Integer>> entrySet =storeMap.entrySet();
		 for(Entry<String,Integer> entry:entrySet)
		 {
			 if(entry.getValue()>1)
			 {
				 System.out.println("Duplicate Elements is[using HashMap]: "+entry.getKey());
			 }
		 }
		 
		 
		 

	}

}
