class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer>numbers=new HashSet<>();
        int maxlength=0;
        for(int num:nums){
            numbers.add(num);
        }
        
         for(int num:numbers){
            if(!numbers.contains(num-1)){
                int current=num;
              int length=1;
            
            while(numbers.contains(current+1)){
                current++;
                length++;
            }
            maxlength=Math.max(maxlength,length);

            }
            
        }
        return maxlength;
    }
}


    
