class Solution {
    boolean canComplete(int []weights,int days,int capacity){
            int dayused=1;
        int currentweight=0;
        for(int weight:weights){
            if(weight + currentweight > capacity){
                dayused++;
                currentweight=weight;
            }else{
                currentweight+=weight;
            }
        }return dayused <=days;
    }
          public int shipWithinDays(int[] weights, int days) {
            int left=0;
            int right=0;

            for(int weight : weights){
                left=Math.max(left,weight);
                right +=weight;
            }
            

            while(left < right){
                int mid=left +(right - left)/2;
                if(canComplete(weights,days,mid)){
                    right=mid;
                       
                }else{
                    left=mid+1;
                }
            }return left;
        
    }
}