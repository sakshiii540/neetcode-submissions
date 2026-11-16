class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int n = nums.length;
        for (int i=0;i<n;i++){
            set.add(nums[i]);
        }
        int l=0;
        
        for (int num: set){
            int start=0;
            if (!set.contains(num-1)){
                start=num;
                int c=1;
                while (set.contains(start+1)){
                    c++;
                    start++;
                }
                l = Math.max(l,c);
            }

        }
        return l;
    }
}
