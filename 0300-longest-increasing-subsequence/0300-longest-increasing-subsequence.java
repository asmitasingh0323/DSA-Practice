class Solution {
    public int lengthOfLIS(int[] nums) {
        List<Integer> list = new ArrayList<>();
        list.add(nums[0]);

        for(int i = 1; i< nums.length; i++){
            int num = nums[i];
            if(num > list.get(list.size()-1)){
                list.add(num);
            }else{
                int j = binarySearch(list, num);
                list.set(j, num);
            }
        }
        return list.size();
    }
    public int binarySearch(List<Integer> list, int num){
        int l = 0;
        int r = list.size() -1;
        int mid = (l+r)/2;

        while(l < r){
            mid = (l+r)/2;

            if(list.get(mid) == num){
                return mid;
            }
            
            if(list.get(mid) < num){
                l = mid+1;
            }else{
                r = mid;
            }
        }
        return l;
    }
}