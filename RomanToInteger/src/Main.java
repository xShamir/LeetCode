import java.util.HashMap;

class Solution {
    public int romanToInt(String s)
    {
        HashMap<Character, Integer> map = new HashMap<>();

        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int length = s.length();
        int result = 0;

        for(int i=0;i<length;i++)
        {
            char ch = s.charAt(i);

            if(i>0 && map.get(ch) >map.get(s.charAt(i-1)))
            {
                result += map.get(ch) - 2*map.get(s.charAt(i-1));
            }
            else
            {
                result += map.get(ch);
            }
        }

        return result;
    }
}