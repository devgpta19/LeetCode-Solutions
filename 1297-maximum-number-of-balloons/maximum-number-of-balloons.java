import java.util.*;

class Solution {
    public int maxNumberOfBalloons(String text) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('b',0);
        map.put('a',0);
        map.put('l',0);
        map.put('o',0);
        map.put('n',0);
        for(char ch : text.toCharArray()){
            if(map.containsKey(ch))
            map.put(ch, map.get(ch)+1);
        }
        boolean flag = true;
        int count = 0;
        Collection<Integer> list1 = map.values();
        if(list1.contains(0))
        flag = false;

        while(flag){
            for(Map.Entry<Character, Integer> entry : map.entrySet()){
                if(entry.getKey() == 'b' || entry.getKey() == 'a' || entry.getKey() == 'n'){
                    map.put(entry.getKey(), entry.getValue() -1);
                }else{
                    map.put(entry.getKey(), entry.getValue() -2);
                }
            }
            Collection<Integer> list = map.values();
            System.out.println(list);
            if(list.contains(-1) || list.contains(-2)){
                flag = false;
                continue;
            }
            count ++;
        }
        return count;        
    }
}