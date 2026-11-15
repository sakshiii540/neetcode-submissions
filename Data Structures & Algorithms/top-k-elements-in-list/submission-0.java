class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int n = nums.length;
        for (int i=0;i<n;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1 );
        }
        List<Integer>[] bucket = new List[n+1];
        for (int x : map.keySet()) {
    int freq = map.get(x);

    if (bucket[freq] == null) {
        bucket[freq] = new ArrayList<>();
    }

    bucket[freq].add(x);
}
        int[] ans = new int[k];
        int y=0;
        for (int i=bucket.length-1;i>=0;i--){
            if (bucket[i]!=null){
               for (int num : bucket[i]){
                 ans[y]=num;
                 y++;
                 if (y==k)return ans;
               }
                
              
            }
        }
          return ans;
     
    }
     
}
