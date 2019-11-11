package java8learning.sort;
import java.util.*; 
import java.lang.*; 
import java.io.*; 
  
/* Name of the class has to be "Main" only if the class is public. */
class Ideone 
{ 
    public static void main(String args[]) 
    { 
        //----------hashtable ------------------------- 
        Hashtable<Integer,String> ht=new Hashtable<Integer,String>(); 
        ht.put(101,"Vijay"); 
        ht.put(101,"Vijay"); 
        ht.put(102,"Vijay"); 
        ht.put(103,"Rahul");
        
        System.out.println("-------------Hash table--------------"); 
        for (Map.Entry m:ht.entrySet()) { 
            System.out.println(m.getKey()+" "+m.getValue()); 
        } 
  
        //----------------hashmap-------------------------------- 
        HashMap<Integer,String> hm=new HashMap<Integer,String>(); 
        hm.put(101,"Vijay"); 
        hm.put(101,"aijay"); 
        hm.put(102,"Vijay"); 
        hm.put(103,"Rahul"); 
        hm.put(null, null);
        System.out.println("-----------Hash map-----------"); 
        for (Map.Entry m:ht.entrySet()) { 
            System.out.println(m.getKey()+" "+m.getValue()); 
        } 
    } 
} 