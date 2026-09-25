class Solution {
    public int numIslands(char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        boolean visited [][]  = new boolean[n][m];

        int count = 0;

        for(int i = 0; i<n; i++){
            for(int j = 0; j< m; j++){
                if(!visited[i][j] && grid[i][j] == '1'){
                    count++;
                    bfs(grid, i, j, n, m, visited, count);
                }
            }
        }
        return count;
    }

    public void bfs(char[][] grid, int i, int j, int n, int m, boolean [][] visited, int count){
        if(i < 0 || j < 0 || i >= n || j >= m || visited[i][j] || grid[i][j] == '0'){
            return;
        }

            visited[i][j] = true;

            bfs(grid, i+1, j, n, m, visited, count);
            bfs(grid, i, j+1, n, m, visited, count);
            bfs(grid, i-1, j, n, m, visited,count);
            bfs(grid, i, j-1, n, m, visited,count);
            

        
        
    }
}