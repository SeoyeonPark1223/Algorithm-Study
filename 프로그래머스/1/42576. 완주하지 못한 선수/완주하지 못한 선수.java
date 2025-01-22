import java.util.HashMap;

class Solution {
    public String solution(String[] participant, String[] completion) {
        HashMap<String, Integer> map = new HashMap<>();
        
        for (String part: participant) {
            if (map.containsKey(part)) map.put(part, map.get(part) + 1);
            else map.put(part, 1);
        }

        for (String part: completion) {
            if (map.containsKey(part)) map.put(part, map.get(part) - 1);
        }

        for (String part: map.keySet()) {
            if (map.get(part) == 1) return part;
        }

        return "";
    }
}