package MyProject;

import java.util.Map;
import java.util.HashMap;


public class HashMapSolution {
    public static void main(String [] args)
    {
        // HashMap<Integer, String> hash_map = new HashMap<Integer, String>(Collections.reverseOrder());
  
        // Mapping string values to int keys
        // hash_map.put(1000, "M");
        // hash_map.put(500, "D");
        // hash_map.put(100, "C");
        // hash_map.put(50, "L");
        // hash_map.put(10, "X");
        // hash_map.put(5, "V");
        // hash_map.put(1, "I");

        String num = "1210" ; 
         digitCount( num);
        

    }

    public static boolean digitCount(String num) {
        Map<Character, Integer> map = new HashMap<>() ;
        for(int i = 0 ; i < num.length(); i++)
        {
            int count = 0;
            map.put((char)(i + '0'),count);
            for(int j = 0 ; j < num.length(); j++)
            {
               if((char)(i + '0') == num.charAt(j) )
               {
                    count = count + 1 ;
                   map.put((char)(i + '0'),count);
               }
            }
            count = 0 ;
        }
 

    for(int i = 0 ; i < num.length(); i++)
    {
        char numValue = num.charAt(i);
        int mapValue = map.get((char)(i + '0'));
        char charMapValue = (char)(mapValue + '0') ;
       
       if(numValue == charMapValue )
       {
           
       }else
       {
            return false ;
       }
    }
    return true ;
    }

    public static int romanToInt(String s) {
        HashMap<Integer, String> hash_map = new HashMap<Integer, String>();
  
        // Mapping string values to int keys
        hash_map.put(1000, "M");
        hash_map.put(500, "D");
        hash_map.put(100, "C");
        hash_map.put(50, "L");
        hash_map.put(10, "X");
        hash_map.put(5, "V");
        hash_map.put(1, "I");     
             
    }

}
