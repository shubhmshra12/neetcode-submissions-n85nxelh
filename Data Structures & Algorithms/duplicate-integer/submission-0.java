class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> hs=new HashSet<>();
        for(int n:nums){
            //chech if hs already contains the element

            if(hs.contains(n)){
               return true;
            }

            hs.add(n);
        }

        return false;


    }
}