class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> ans=new HashSet<>();

        if(nums.length<3){
            return new ArrayList<>();
        }
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++){
            int left=i+1;
            int right=nums.length-1;

            while(left<right){
                int sum=nums[i]+nums[left]+nums[right];

                if(sum<0){
                    left++;
                }else if(sum>0){
                    right--;
                }else{
                    List<Integer> list=Arrays.asList(nums[i],nums[left],nums[right]);
                    ans.add(list);

                    left++;
                    right--;
                }
            }

           
        }

        return new ArrayList<>(ans);
    }
}