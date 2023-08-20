package MyProject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javafx.scene.web.WebHistory.Entry;

public class HashMapConcepts {
    
    // Features
    // Stores key value pair , can store multiple null value but only one null key, no ordering for store \\
    public static void main(String[] args)
    {
        // iterations();
        convertHashMapIntoArrayList();
    }

    public static void definitionAndInitialization()
    {
        // Defining and initalization of hash map 
        HashMap<Integer, String> hm = new HashMap<Integer,String>() ;
        hm.put(1,"Amarjeet") ;
        hm.put(2, "Hrllo") ;
        hm.put(5,"This is the test hashmap") ;
        System.out.println(hm);

    }

    public static void iterations()
    {
        HashMap<Integer, String> hm = new HashMap<Integer, String>() ;
        hm.put(1,"Amarjeet") ;
        hm.put(2, "Hrllo") ;
        hm.put(5,"This is the test hashmap") ;
        hm.put(7,"he test hashmap") ;

        Iterator<Map.Entry<Integer,String>> it = hm.entrySet().iterator() ;
        while(it.hasNext())
        {
             Map.Entry keyValue = it.next() ;
             System.out.println(keyValue.getKey());
             System.out.println(keyValue.getValue()); 
        }

    }

    public static void convertHashMapIntoArrayList()
    {
        // Initialization and declaration of hashmap
        Map<String, Integer> map = new HashMap<>();
        map.put("Ticket",1400) ;
        map.put("Food",240);
        map.put("Cloth",600);

        // Converting hashmap key into events 
        List<String> events = new ArrayList<>(map.keySet());

        // Converting hashmap values into expense
        List<Integer> expenses = new ArrayList<>(map.values());

        for(String i : events)
        {
            System.out.println(i);
        }
        for(Integer i : expenses)
        {
            System.out.println(i);
        }
    }

}
