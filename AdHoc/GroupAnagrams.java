package AdHoc;
import java.util.*;
/**
 * Q49
 */
public class GroupAnagrams {

    public static void main(String[] args) {

        System.out.println(new GroupAnagrams().groupAnagrams(new String[]{"eat","tea","tan","ate","nat","bat"}));
    }


    public List<List<String>> groupAnagrams(String[] arr) {

        Map<Map<Character, Integer> , List<String>> hm = new HashMap<>();
        Map<Character, Integer> map = new HashMap<>();
        for(String str : arr) {
            map = getAnagramMapping(str);
            if(hm.containsKey(map)) {
                List<String> lst = hm.get(map);
                lst.add(str);
                hm.put(map, lst);
            }
            else {
                hm.put(map, new ArrayList<>(Collections.singletonList(str)));
            }
        }
        return new ArrayList<>(hm.values());
    }

    private Map<Character, Integer> getAnagramMapping(String str) {

        Map<Character, Integer> mp = new HashMap<>();
        for(int i=0;i<str.length();i++) {
            mp.put(str.charAt(i),mp.getOrDefault(str.charAt(i),0)+1);
        }
        return mp;
    }


}
