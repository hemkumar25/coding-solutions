class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
       
       int start = newInterval[0];
       int end = newInterval[1];

       List<int[]> list = new ArrayList<>();

       for(int i=0; i<intervals.length;i++){
            int currentStart = intervals[i][0];
            int currentEnd = intervals[i][1];


            if(currentEnd<start){
                list.add(intervals[i]);

            }else if(currentStart>end){
                list.add(new int[]{start,end});

                for(int j = i; j<intervals.length;j++){
                    list.add(intervals[j]);
                }

                return list.toArray(new int [list.size()][]);
                
            }else{
                start = Math.min(start, currentStart);
                end = Math.max(end , currentEnd);
            }
       }

       list.add(new int[]{start,end});


       return list.toArray(new int [list.size()][]);


    }
}