package MyProject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListConcept {
    public static void main(String[] args)
    {
        operationOnArrayList() ;
    }

    public static void basicConceptArrayList()
    {
        // Declaration and initialization of array 
        ArrayList arrayList = new ArrayList<>() ;
        // Array items into array 
        arrayList.add(100) ;
        arrayList.add("abcd") ;
        arrayList.add(true) ;

        // Return value at index 2 
        arrayList.get(2) ;
        // Return physical capacity of the array of the length of the array 
        arrayList.size() ;


        System.out.println(arrayList);
    }

    public static void virtualCapacityConcept()
    {
        // Here java assign virtual capacity as 10 by default
        ArrayList ar = new ArrayList() ;

        // Here virtual capacity can be changed by passing into argument
        ArrayList<Object> obj = new ArrayList<Object>(20) ;

    }

    public static void traverseArrayWays()
    {
        ArrayList<Integer> ar= new ArrayList<Integer>() ;
        ar.add(10) ;
        ar.add(20) ;
        ar.add(40) ;

        // Traditional array list to get element 
        for(int i = 0 ; i < ar.size(); i++ )
        {
            System.out.println(ar.get(i));
        }

        // using for each loop
        for(int i : ar)
        {
            System.out.println(i);
        }

        // using lambda function 
        ar.forEach(ele -> System.out.println(ele));

        // using iterator class
        Iterator<Integer> it = ar.iterator() ;

        while(it.hasNext())
        {
            System.out.println(it.next());
        }

    }

    public static void operationOnArrayList()
    {
        ArrayList<Integer> op = new ArrayList<Integer>(Arrays.asList(1,2,2,2,2,3,5,6)) ;
        // remove if method
        op.removeIf(num -> num%2 != 0 ) ;

        // get last element method

        // create subarray from array
        ArrayList<Integer> subarray = new ArrayList<Integer>(op.subList(2,4)) ;

        // retains all element check for all occurences
        op.retainAll(Collections.singleton(2)) ;
        System.out.println(op);
    }
}
