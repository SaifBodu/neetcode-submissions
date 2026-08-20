class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int count =0;
        for(int i=0;i<nums1.length;i++){
            if(nums1[i]==0){
                if(count<n){
                    nums1[i] = nums2[count];
                    count++;
                }
            }
        }

        Arrays.sort(nums1);
    }
}