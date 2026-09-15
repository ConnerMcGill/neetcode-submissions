class Solution {
    public int maxArea(int[] heights) {
        int l = 0, r = heights.length - 1;
        int maxArea = 0;

        while (l < r) {
            int length = r - l;
            int minHeight = Math.min(heights[l], heights[r]);
            int area = length * minHeight;
            if (area > maxArea) {
                maxArea = area;
            }

            if (heights[l] < heights[r]) {
                l++;
            } else {
                r--;
            }
        }
        return maxArea;
    }
}
