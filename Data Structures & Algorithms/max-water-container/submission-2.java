class Solution {
    public int maxArea(int[] heights) {
        int l = 0, r = heights.length - 1, maxArea = 0;

        for (int i = 0; i < heights.length; i++) {
            int area = (r - l) * Math.min(heights[l], heights[r]);
            maxArea = Math.max(area, maxArea);
            if (heights[l] < heights[r]) {
                l++;
            } else {
                r--;
            }
        }
        return maxArea;
    }
}
