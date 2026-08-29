class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, ArrayList<String>> sol = new HashMap<>();

        for (String s : strs) {
            int[] count = new int[26];
            for (char c : s.toCharArray()) {
                count[c - 'a']++;
            }
            String key = Arrays.toString(count);
            if (!sol.containsKey(key)) sol.put(key, new ArrayList<>());
            sol.get(key).add(s);
        }
        return new ArrayList<>(sol.values());
    }

    
}
