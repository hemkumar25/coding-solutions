class Solution {
    public int minMeetingRooms(int[] start, int[] end) {
        // code here
        Arrays.sort(start);
        Arrays.sort(end);
        
        
        int i= 0;
        int j= 0;
        
        int rooms= 0;
        int maxrooms = 0;
        
        while(i<start.length){
            if(start[i]<end[j]){
                rooms++;
                maxrooms = Math.max(rooms,maxrooms);
                i++;
            }else{
                rooms--;
                j++;
            }
        }
        return maxrooms;
        
    }
}
