import java.util.HashMap;
import java.util.Map;

class Solution
{

    public boolean canConstruct(String ransomNote, String magazine)
    {
        Map<Character, Integer> map = new HashMap<>();

        for(char c : magazine.toCharArray())
        {
            int count = map.containsKey(c) ? map.get(c) + 1 : 1;
            map.put(c, count);
        }

        for(char c : ransomNote.toCharArray())
        {
            int newCount = map.containsKey(c) ? map.get(c) - 1 : -1;
            if(newCount == -1) return false;
            map.put(c, newCount);
        }

        return true;
    }

}