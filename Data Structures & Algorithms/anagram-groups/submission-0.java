class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        List<List<String>> list = new ArrayList<>();
        HashMap<String,List<String>> map = new HashMap<>();
        for (int i=0;i<strs.length;i++){
            String s = strs[i];
            char[] arr = s.toCharArray();
            Arrays.sort(arr);
            String sorted = new String(arr);
            if (!map.containsKey(sorted)){
                map.put(sorted,new ArrayList<>());
            }
            map.get(sorted).add(s);
        }
        for (List<String> group : map.values()) {
            list.add(group);
        }
        return list;
    }
}