class Solution {
    public int totalFruit(int[] fruits) {
        Map<Integer, Integer> hm = new HashMap<>();
        int tFruit = 0;
        int left =0;

        for(int right = 0; right<fruits.length; right++){
           
            int tempFruit = fruits[right];
            hm.put(tempFruit, hm.getOrDefault(tempFruit,0)+1); 

            while(hm.size()>2){
                int fruit = fruits[left];
                hm.put(fruit, hm.get(fruit)-1);

                if(hm.get(fruit) == 0){
                    hm.remove(fruit);
                }

                left++;
            }

            if(hm.size()<=2){
                int temptFruit = right-left+1;
                tFruit = Math.max(temptFruit, tFruit);

            }

        }
        return tFruit;
    }
}