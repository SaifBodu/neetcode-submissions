class Solution {
    public int majorityElement(int[] nums) {
        // solution 1-  brute force solution
 /*       int n = nums.length;
        for(int i=0;i<n;i++){
            int count =0;
            for(int j=0;j<n;j++){
                if(nums[i] == nums[j]){
                    count++;
                }
            }
            if(count > n/2){
                return nums[i];
            }
        }
        return -1;
        */
// solution 2 - using hashing
        int  n = nums.length;
        HashMap<Integer, Integer> hash = new HashMap<>();
        for(int i=0; i< n;i++){
            if(!hash.containsKey(nums[i])){
                hash.put(nums[i], 1);
            }else{
                hash.put(nums[i], hash.get(nums[i])+1);
            }
        }
        for(int j : hash.keySet()){
            if(hash.get(j) > (n/2)) {
                return j;
            }
        }
        return -1;
    }
}