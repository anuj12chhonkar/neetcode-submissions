class Solution {
    public int longestConsecutive(int[] nums) {
        
        if(nums.length ==0){
            return 0;
        }
        
        HashSet<Integer> numSet = new HashSet<>();
        for(int i=0; i<nums.length; i++){
            numSet.add(nums[i]);
        }
        
        int longestSub = 1;
        
        for(int num:numSet){
            if(numSet.contains(num-1)){
                continue;
            }
            else{
                int currentNum = num;
                int currentSub = 1;
                while(numSet.contains(currentNum+1)){
                    currentNum++;
                    currentSub++;
                }
                
                longestSub = Math.max(longestSub, currentSub);
            }
            
            
        }
        return longestSub;
        
    }
}

/*
class Solution {
    public int longestConsecutive(int[] nums) {
        
        if(nums.length == 0){
            return 0;
        }
        Arrays.sort(nums);
        
        
        int longestSub = 1;
        int currentSub = 1;
        
        
        for(int i=1; i<nums.length; i++){
            if(nums[i] != nums[i-1]){ 
                if(nums[i]-nums[i-1] == 1){
                    currentSub++;
                }
                else{
                    longestSub= Math.max(currentSub, longestSub);
                    currentSub=1;
                }
            }
        }
        
        return Math.max(longestSub,currentSub);
    }
}
*/