class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;

        for(int i = 0; i< n; i++){
            for(int j = i+1; j < m; j++){
                    int val = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i] = val;             
            }
        }

        for(int j = 0; j < n; j++){
            int left = 0;  int right = n -1;
            while(left < right){
            int val = matrix[j][left];
            matrix[j][left] = matrix[j][right];
            matrix[j][right] = val;
            left++;
            right--;
            }
            
        }
        
    }
}