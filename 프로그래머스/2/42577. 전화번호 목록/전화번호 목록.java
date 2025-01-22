import java.util.HashSet;

class Solution {
    public boolean solution(String[] phone_book) {        
        HashSet<String> pBook = new HashSet<>();
        
        for (String p: phone_book) pBook.add(p);
        
        for (String p: phone_book) {
            for (int i = 1; i < p.length(); i++) {
                if (pBook.contains(p.substring(0, i))) return false;
            }
        }
        
        return true;
    }
}