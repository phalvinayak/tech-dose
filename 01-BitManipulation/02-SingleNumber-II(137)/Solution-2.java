class Solution {

    /**
     * Creating a map which keeps track of the number frequency
     * And the map entry will be deleted as soon as we see the same key has
     * been appeared before for 2 times.
     * 
     * This way at the end we'll be left with one single entry in the map
     * which is returned as the answer
     */
    public int singleNumber(int[] nums) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        for(int num : nums) {
            if (freqMap.containsKey(num) && freqMap.get(num) == 2) {
                freqMap.remove(num);
            } else {
                freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
            }
        }
        return freqMap.keySet().iterator().next();
    }
}