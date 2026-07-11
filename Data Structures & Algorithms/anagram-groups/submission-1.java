class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, List<String>> map = new HashMap<>();

        for (int i = 0; i < strs.length; i++) {

            String key = strs[i];

            char[] arr = key.toCharArray();
            Arrays.sort(arr);

            String sortedKey = new String(arr);

            if (map.containsKey(sortedKey)) {
                map.get(sortedKey).add(strs[i]);
            } else {
                List<String> list = new ArrayList<>();
                list.add(strs[i]);
                map.put(sortedKey, list);
            }
        }

        return new ArrayList<>(map.values());
    }
}
