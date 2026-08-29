class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        for (int i = 0; i < matrix.length; i++) {
            int first = 0;
            int last = matrix[matrix.length-1].length-1;
            while (first <= last) {
                int middle = (first + last) / 2;
                if (matrix[i][middle] < target) first = middle+1;
                else if (matrix[i][middle] > target) last = middle-1;
                else return true;
            }
        }
        return false;
    }
}
