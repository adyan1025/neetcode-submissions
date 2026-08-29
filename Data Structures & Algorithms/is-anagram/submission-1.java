class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        Map<Character, Integer> sMap = new HashMap<>();
        Map<Character, Integer> tMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
            if (!sMap.containsKey(sChar)) {
                sMap.put(sChar, 0);
            }
            if (!tMap.containsKey(tChar)) {
                tMap.put(tChar, 0);
            }
            sMap.put(sChar, sMap.get(sChar)+1);
            tMap.put(tChar, tMap.get(tChar)+1);
        }
        return sMap.equals(tMap);
    }
}
