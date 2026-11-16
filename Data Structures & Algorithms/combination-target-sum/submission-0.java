class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        rec(nums,target,0,ans,list);
        return ans;
    }
    public void rec(int[] nums,int target,int index, List<List<Integer>>
    ans, List<Integer> list){
       if (index == nums.length){
        if (target ==0){
            ans.add(new ArrayList<>(list));
          
        }
          return;
       }
       if (nums[index] <= target){
         list.add(nums[index]);
        rec(nums,target-nums[index],index,ans,list);
        list.remove(list.size()-1);
       }
        rec(nums,target,index+1,ans,list);
    }
}
