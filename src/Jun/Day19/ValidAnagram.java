package Jun.Day19;

import java.util.HashMap;

public class ValidAnagram {

    public static boolean isAnagram(String s, String t) {
        // here is another approach i found more elegant

        if(s.length()!=t.length()){
            return false;
        }
        s = s.toLowerCase();
        t = t.toLowerCase();
        int [] arr = new int[26];
        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i)-'a']++;
            arr[t.charAt(i)-'a']--;

        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=0){
                return false ;
            }
        }
        return true;

        /*
        this solution pass only 33 / 38 testcases passed
        if(s.length() != t.length()){
            return false;
        }
        HashMap<Character,Integer> lookUp=new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            lookUp.put(s.charAt(i),i);
        }

        for (int i = 0; i < t.length(); i++) {

            if(!lookUp.containsKey(t.charAt(i))){
                return  false;
            }else{
                lookUp.remove(t.charAt(i));
            }

        }
        return true;*/

    }

    public static void main(String[] args) {
        String s = "aacc", t = "ccac";

        System.out.println(isAnagram(s,t));
    }
}
