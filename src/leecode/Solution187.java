package leecode;

import java.util.*;

public class Solution187 {
    public static List<String> findRepeatedDnaSequences(String s) {
        List<String> result = new LinkedList<>();
        Map<String,Integer> map = new HashMap<>();
        for (int i = 0; i<=  s.length()-10;i++){
            String subString = s.substring(i,i+10);
            Integer count = map.get(subString);
            if (count == null){
                count = 0;
            }
            map.put(subString,++count);
            if (count == 2){
               result.add(subString);
            }
        }
        return result;
    }

    public static List<String> findRepeatedDnaSequences2(String s) {
        List<String> result = new LinkedList<>();
        Set<String> scan = new HashSet<>();
        for (int i = 0; i<=  s.length()-10;i++){
            String subString = s.substring(i,i+10);
            if (scan.contains(subString) && !result.contains(subString)){
                result.add(subString);
            } else {
                scan.add(subString);
            }
        }
        return result;
    }

    public static void main(String[] args){
        List<String> list = findRepeatedDnaSequences2("AAAAAAAAAAAA");
        System.out.println(list.toString());
    }
}
