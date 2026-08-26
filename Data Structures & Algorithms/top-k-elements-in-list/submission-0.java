class Solution {
    public int[] topKFrequent(int[] nums, int k) {
       // Step 1: Count frequency of each number
       Map<Integer, Integer> count = new HashMap<>();
       for (int n : nums) {
        count.put(n, count.getOrDefault(n, 0) + 1);
       }

       // Step 2: Build Min-Heap based on frequency map counts
       PriorityQueue<Integer> heap = new PriorityQueue<>(
        (a, b) -> count.get(a) - count.get(b)
       );

       // Step 3: Keep only the top K elements in the heap
       for (int key : count.keySet()) {
        heap.add(key);
        if (heap.size() > k) {
            heap.poll(); // Eviccts the element with the lowest frequency 
        }
       }

       // Step 4: Extract the elements into an array
       int[] res = new int[k];
       for (int i = 0; i < k; i++) {
        res[i] = heap.poll();
       }
       return res;
    }
}
