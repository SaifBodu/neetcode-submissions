class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] a = new int[nums.length*2];
        int n = 0;
        for(int i=0; i<nums.length * 2;i++){

            if (i == nums.length-1){
                a[i] = nums[n++];
                n =0;
            }
            else if(i < nums.length-1){
                a[i] = nums[n++];
            }else{
                a[i] = nums[n++];
            }
            
        }
        
        return a;
    }
}