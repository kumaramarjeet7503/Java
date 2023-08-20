package MyProject ;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class StringSolution
{
    public static void main(String[] args) {
    //    String[] indices = {"a","ac"} ;
        // repeatedStringMatch("aaaaaaaaaaaaaaaaaaaaaab","ba") ;
        // int x = "1234132".charAt(5) - '0'; 
        // int ab =  '4' - '0' ;
        
    }

        public static int repeatedStringMatch(String a, String b) {
        int alength = a.length() ;
        int nlength = a.length() ;
        int blength = b.length() ;
        int count = 0 ;
        String helper = a ;
        while(alength <= blength + nlength)
        {
            count++ ;
            if(a.indexOf(b) != -1)
            {
                break ;
            }
            a = a + helper ;
            alength = a.length() ;
        }
        if(a.indexOf(b) == -1)
        {
            return -1 ;
        }
        return count == 0 ? -1 : count ;
    }

        public static boolean areSentencesSimilar(String sentence1, String sentence2) {
       String min = sentence1.length() < sentence2.length() ? sentence1 : sentence2 ;
       String max = sentence1.length() < sentence2.length() ? sentence2 : sentence1 ;
     String original = sentence1.length() < sentence2.length() ? sentence2.replaceAll(" ", "") : sentence1.replaceAll(" ", "") ;
        StringBuilder maxsb = new StringBuilder(max.replaceAll(" ", ""));
        // replaceAll(maxsb," ","") ;
       String[] minArray = min.split(" ") ;
       for(int i = 0 ; i < minArray.length ; i++)
       {
         
           int start = maxsb.indexOf(minArray[i]) ; 
             int length = start + minArray[i].length() ;
           maxsb.delete(start,length) ;
       }

       String comp = maxsb.toString() ;
       if( original.indexOf(comp) != -1)
       {
           return false ;
       }
       return true ;
    }

        public static boolean checkPalindromeFormation(String a, String b) {
        // String asuffix = a.substring(0,a.length()/2) ;
        // String bprefix = b.substring(b.length()/2,b.length()) ;
        // String res = asuffix + bprefix ;
        return check(a,b) || check(b,a) ;
    }

    

    public static boolean check(String a,String b)
    {
        int l = 0 ;
        int r = b.length()-1 ;
        while(l < r && a.charAt(l) == b.charAt(r))
        {
            l++;
            r-- ;
        }
        if(l >= r)
        {
            return true ;
        }
        return isPalindrome(a.substring(l,r+1)) || isPalindrome(b.substring(l,r+1)) ;
    }

    public static boolean isPalindrome(String res) 
    {
        for(int i = 0 ; i < res.length()/2; i++)
        {
            if(res.charAt(i) != res.charAt(res.length() - 1- i))
            {
                return false ;
            }
        }
        return true;
    }

    public static int romanToInt(String s) {
        Map<String, Integer> hm = new HashMap<>() ;
        hm.put("M",1000) ;
        hm.put("D",500) ;
        hm.put("C",100) ;
        hm.put("L",50) ;
        hm.put("X",10) ;
        hm.put("V",5) ;
        hm.put("I",1) ;
        hm.put("IV",4) ;
        hm.put("IX",9) ;
        hm.put("XL",40) ;
        hm.put("XC",90) ;
        hm.put("CD",400) ;
        hm.put("CM",900) ;

        int i = 0  ;
        int roman = 0 ;
        while(i < s.length())
        {
            if( i < s.length() - 1 && hm.get(s.charAt(i)+"") < hm.get(s.charAt(i+1)+"" ))
            {
                String  ele = s.charAt(i)+""+s.charAt(i+1) ;
                roman += hm.get(ele);
                i++;
            }else
            {
                roman += hm.get(s.charAt(i)+"") ;
            }
            i++;
        }
        return roman ;
    }

        public static boolean isValid(String s) {
        String opening = "({[" ;
        Stack<Character> st = new Stack() ;
        int i = 0 ;
        while(i < s.length())
        {
            if(opening.indexOf(s.charAt(i)) >= 0)
            {
                st.push(s.charAt(i)) ;
            }else
            {
                if(st.size() == 0)
                {
                    return false ;
                }
                char pop = st.pop() ;
                if(isValidChar(pop, s.charAt(i)) == false)
                {
                    return false ;
                } 
            }
            i++;
        }

        if(st.size() == 0)
        {
            return true ;
        }
        return false ;
    }

    public static boolean  isValidChar(char pop, char ele)
    {
        if(pop == '(')
        {
            if(ele == ')')
            {
                return true ;
            }
        }
        if(pop == '{')
        {
            if(ele == '}')
            {
                return true ;
            }
        }
        if(pop == '[')
        {
            if(ele == ']')
            {
                return true ;
            }
        }
        return false ;
    }

        public static String reversePrefix(String word, char ch) {
        int occur = word.indexOf(ch) ;
        if(occur == -1)
        {
            return word ;
        }
        String firstWord = word.substring(0, occur + 1) ;
        StringBuilder sb = new StringBuilder(firstWord) ;
        sb.reverse() ;
        String first = sb.toString() ;
        String ans = first + word.substring(occur + 1,word.length()) ;
        return ans ;
    }

        public static String mergeAlternately(String word1, String word2) {
       int i =  0 ;
       String min = word1.length() > word2.length() ? word2 : word1 ;
       StringBuilder ans = new StringBuilder() ;
       while(i < min.length()) 
       {
                String  first = word1.charAt(i) + "";
                String  second = word2.charAt(i) + "";
                ans.append(first+ second) ;
                i++ ;
       }
       if(word1.length() == word2.length())
       {
           String aux = ans.toString() ;
           return aux ;
       }
       String max = word1.length() > word2.length() ? word1 : word2 ;
       ans.append(max.substring(min.length(),max.length())) ;
        String aux = ans.toString() ;
        return aux ;
    }

        public boolean checkOnesSegment(String s) {
        int indx = s.indexOf("0") ;
        if(indx == -1)
        {
            return true ;
        }
        String pattern = s.substring(indx,s.length()) ;
        if(pattern.indexOf("1") >= 0 )
        {
            return false ;
        }
        return true ;
    }

        public static int maxRepeating(String sequence, String word) {
        int count = 0 ;
        // StringBuilder sb = new StringBuilder(sequence);
        while(sequence.indexOf(word) != -1 )
        {
            int indexOf = sequence.indexOf(word) ;
            sequence = sequence.substring(0,indexOf)+ sequence.substring(indexOf+word.length(),sequence.length());
            count++ ;
        }
        return count ;
    }

        public static String longestCommonPrefix(String[] strs) {
        // String min = "" ;
        // if(strs.length == 1)
        // {
        //     return strs[0] ;
        // }
        // for(int i = 0 ; i < strs.length - 1; i++)
        // {
        //     if(strs[i+1].length() <= strs[i].length() )
        //     {
        //         min = strs[i+1] ;
        //     }else
        //     {
        //         min = strs[i] ;
        //     }
        // }
        // String ans = "" ;
        // String helper = "" ;
        // for(int i = 0 ; i < min.length(); i++ )
        // {
        //      helper = helper + min.charAt(i) ;
        //      int count = 0 ;
        //     for(int j = 0 ; j < strs.length; j++)
        //     {
        //         if(min.charAt(i) == strs[j].charAt(i))
        //         {
        //             count++ ;
        //         }
        //     }
        //     if(count == strs.length)
        //     {
        //         ans = helper ;
        //     }
        //     if(ans == "" || count != strs.length )
        //     {
        //         return ans ;
        //     }
        // }
        // return ans ;
        String res = strs[0] ;
        for(int i = 0 ; i < strs.length; i++)
        {
            res = common(res,strs[i]) ;
        }
        return res ;
    }

    public static String common(String a, String b)
    {
        StringBuilder sb = new StringBuilder() ;
        String min = a.length() > b.length() ? b : a ;
        for(int i = 0 ; i < min.length();i++)
        {
            if(a.charAt(i) == b.charAt(i))
            {
                sb.append(a.charAt(i)) ;
            }else
            {
                break ;
            }
        }

        return sb.toString() ; 
    }

      public static boolean validPalindrome(String s) {
        StringBuilder sb = new StringBuilder(s) ;
        for(int i= 0 ; i < s.length()/2; i++)
        {
            if(s.charAt(i) != s.charAt(s.length() - i -1))
            {
               sb.deleteCharAt(i) ;
               break ;
            }
        }
        String newStr = new String(sb) ;
        for(int i= 0 ; i < newStr.length()/2; i++)
        {
            if(s.charAt(i) != newStr.charAt(newStr.length() - i -1))
            {
               return false ;
            }
        }
        return true ;
           
    }

        // public static boolean isPalindrome(String s) {
           
        //  s = s.toLowerCase() ;
        //   s = s.replaceAll("[^a-z0-9]","") ;
        //     for(int i = 0 ; i < s.length() / 2; i++)
        //     {
        //         if(s.charAt(i) != s.charAt(s.length() - i -1) )
        //         {
        //             return false ;
        //         }
        //     }
        //     return true ;
        // }

        public static boolean isLongPressedName(String name, String typed) {
        StringBuilder sb = new StringBuilder() ;
        for(int i = 0 ; i < typed.length() ; i++ )
        {
            if(  i == typed.length() -1 || (typed.charAt(i) != typed.charAt(i+1) ) )
            {
                sb.append(typed.charAt(i)) ;
            } 
        }

         String aux = sb.toString() ;
         boolean res = name.equals(aux) ;
        return res ;
    }

        public static String convertToTitle(int columnNumber) {
        StringBuilder ans =new StringBuilder() ;
        while(columnNumber > 0)
        {
            int r = (columnNumber -1) % 26 ;
            ans.append((char)(r+'A'));
            columnNumber = (columnNumber - 1) / 26 ;
        }
        return ans.reverse().toString();
    }

        public static String reverseWords(String s) {
        String[] sa = s.split(" ") ;
        StringBuilder ans = new StringBuilder(""); 
        for(int i=0; i < sa.length; i++)
        {
            StringBuilder sb = new StringBuilder(sa[i]);
            sb.reverse() ;
            // ans += sb+" ";
            ans.append(sb+" ");
        }
        // ans.delete(ans.length()-1) ;
        String aux = new String(ans) ;
        return aux.substring(0,aux.length()-1) ;
    }

        public static boolean judgeCircle(String moves) {
        // Map<Character,Integer> hm = new HashMap<>() ;
        // hm.put('R',0);
        // hm.put('L',0);
        // hm.put('U',0);
        // hm.put('D',0);

        int x = 0 ; 
        int y = 0 ;

        for(int i = 0 ; i< moves.length(); i++)
        {
            // hm.put(moves.charAt(i),hm.get(moves.charAt(i)) + 1) ;
            if(moves.charAt(i) == 'R')
            {
                y++;
            }
            if(moves.charAt(i) == 'U')
            {
                x++;
            }
            if(moves.charAt(i) == 'L')
            {
                y--;
            }
            if(moves.charAt(i) == 'D')
            {
                x--;
            }
        }

        if(x == 0 && y == 0)
        {
            return true ;
        }
        return false ;
    }

    public static int numOfStrings(String[] patterns, String word) {
       int count = 0 ;
       for(int i = 0 ; i < patterns.length; i++)
       {
               if(word.indexOf(patterns[i]) != -1 )
               {
                   count++;
               }
       } 
       return count ;
    }

    public static String freqAlphabets(String s) {
        Map<String,Character> hm = new HashMap<>() ;
        for(int i = 0; i<27; i++)
        {
            int a = i + 1 ;
            hm.put(a+"",(char) ('a' + i));
        }

        StringBuilder sb = new StringBuilder(s);
         StringBuilder ans = new StringBuilder();
        sb.reverse() ;
        for(int i = 0 ; i < sb.length(); i++)
        {
            if(sb.charAt(i) == '#')
            {
                String mapcr = "" + sb.charAt(i+2)+sb.charAt(i+1) ;
                char map = hm.get(mapcr) ;
                ans.append(map);
                i = i +2;
            }else{
                ans.append(hm.get(sb.charAt(i)+""));
            }
        }
        String aux =new String(ans.reverse());
        return aux ;
    }

    public static boolean halvesAreAlike(String s) {
        int i = 0 ; 
        int j = s.length() -1 ;
        int firstHalfVowelCount = 0 ; 
        int secondHalfVowelCount = 0 ;
        while(i < j)
        {
            if(isVowel(s.charAt(i)))
            {
                firstHalfVowelCount++ ;
            }
            if(isVowel(s.charAt(j)))
            {
                secondHalfVowelCount++ ;
            }
            i++;
            j--;
        }
        if(firstHalfVowelCount == secondHalfVowelCount )
        {
            return true ;
        }
        return false ;
    }

    public static boolean isVowel(char c)
    {
        char newc = Character.toLowerCase(c)  ;

        if(newc == 'a'  || newc == 'e'  || newc == 'i' || newc == 'o' || newc == 'u' )
        {
            return true ;
        }
        return false ;
    }

    public static String toLowerCase(String s) {
        return s.toLowerCase() ;
    }

    public static String sortSentence(String s) {
        String[] split =  s.split(" ") ;
        String ans = "" ;
        
		for (int i = 0; i < split.length; i++) {
			int min = i;
			for (int j = i+1 ; j < split.length; j++) {
				if(split[j].charAt(split[j].length() - 1) < split[min].charAt(split[min].length() - 1) ) {
					min = j;
				}
			}
			// swap(split,i,min);
            // StringBuilder  temp = new  StringBuilder(split[i]) ;
            
            // StringBuilder second = new StringBuilder(split[min]) ;
            // split[i] = second.deleteCharAt(second.length()-1).toString();
            // split[min] = temp.deleteCharAt(temp.length()-1).toString() ;
            String temp = split[i] ;
            split[i] = split[min] ;
            split[min] = temp ;
		}

        for(int i = 0 ; i < split.length; i++)
        {
            // StringBuilder  temp = new  StringBuilder(split[i].substring(0,split[i].length() - 1)+" ") ;
            ans += split[i].substring(0,split[i].length() - 1)+" " ;
        }
        
        return ans.substring(0,ans.length() - 1) ;
    }

    public static String restoreString(String s, int[] indices) {
        char[] sarr = s.toCharArray() ;
        for(int i = 0; i < indices.length ; i++)
        {
            sarr[indices[i]] = s.charAt(i) ;
        }

        String ans = new String(sarr) ;

       return  ans ;
    }

    public String interpret(String command) {
        StringBuilder ans = new StringBuilder() ;
        for(int i = 0 ; i < command.length(); i++)
        {
            int j = i +1 ;
            if(command.charAt(i) == 'G')
            {
                ans.append(command.charAt(i));
            }
            if(command.charAt(i) == '(' && command.charAt(j) == ')')
            {
                ans.append('o') ;
            }
            if(command.charAt(i) == '(' && command.charAt(j) == 'a')
            {
                ans.append("al") ;
            }
        }
       String res = ans.toString() ;
        return res ;
    }

}