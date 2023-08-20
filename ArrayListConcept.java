package MyProject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.* ;

public class ArrayListConcept {
    public static void main(String[] args)
    {
        String num = "1210" ;  
        digitCount( num) ;
    }

    public static boolean digitCount(String num) {
        Map<Character, Integer> map = new HashMap<>() ;
        for(int i = 0 ; i < num.length(); i++)
        {
            int count = 0;
            for(int j = 0 ; j < num.length(); j++)
            {
               if(num.charAt(i) == num.charAt(j) )
               {
                   map.put(num.charAt(i),count++);
               }
            }
        }
 

    for(int i = 0 ; i < num.length(); i++)
    {
       if(map.get(i) != num.charAt(i) )
       {
           return false ;
       }
    }
    return true ;
    }

    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        List<Character> word1Arr = new ArrayList<>()  ;
        List<Character> word2Arr = new ArrayList<>()  ;

       addCharacterIntoArray( word1 , word1Arr);
       addCharacterIntoArray( word2 , word2Arr);

       return word1Arr.equals(word2Arr) ;
    }

    public static  void addCharacterIntoArray(String[] word, List<Character> wordArray )
    {
        for(int i = 0; i < word.length; i++)
        {
            for(int j = 0 ; j < word[i].length(); j++ )
            {
                wordArray.add(word[i].charAt(j)) ;
            }
        }
    }

    public static int removeDuplicates(int[] nums) {
        ArrayList<Integer> ans = new ArrayList<Integer>() ;

        // For each for array traversal 
        for(int i = 0 ; i < nums.length ; i++)
        {
            if(ans.isEmpty())
            {
                ans.add(nums[i]);
            }
            if( i > 0 && nums[i-1] != nums[i] )
            {
                ans.add(nums[i]) ;
            }
        }

        for(int i = 0 ; i < ans.size() ; i++)
        {
            nums[i] = ans.get(i) ;
        }

       

        return ans.size()  ; 
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
