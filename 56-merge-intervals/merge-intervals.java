class Solution {
    public int[][] merge(int[][] intervals) {
         Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        int start=intervals[0][0];
        int end=intervals[0][1];
        List<int[]> result = new ArrayList<>();
       

        for(int i=1;i<intervals.length;i++){
            int currentstart=intervals[i][0];
            int currentend=intervals[i][1];

            if(currentstart<=end){
                start=Math.min(start,currentstart);
                end=Math.max(end,currentend);

            }else{
               result.add(new int[]{start, end});
                start=currentstart;
                end=currentend;

            }
        }
        result.add(new int[]{start, end});
       return result.toArray(new int[result.size()][]);
        
    }
}