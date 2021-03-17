package doublePointerSlidingWindow;

import java.util.HashMap;
import java.util.Map;

public class Q3 {
    public static int lengthOfLongestSubstring(String s) {
        if (s==null||s.length()==0){
            return 0;
        }
        Map<Character,Integer> hashMap = new HashMap<Character, Integer>();
        int length=0;
        int start=0;
        for (int end=0; end<s.length();end++) {
            char c = s.charAt(end);
            if(hashMap.containsKey(c)){
                start=Math.max(start,hashMap.get(c));
            }
            hashMap.put(c,end+1);

            length = Math.max(length,end-start+1);
        }
        return length;
    }
//    public static void main(String[] args){
//        System.out.println(lengthOfLongestSubstring("pwwkew"));
//
//    }

}
