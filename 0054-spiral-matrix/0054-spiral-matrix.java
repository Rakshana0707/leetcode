class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();

        int n = matrix.length;
        int m = matrix[0].length;

        boolean[][] visited = new boolean[n][m];

        int[] dr = {0, 1, 0, -1};
        int[] dc = {1, 0, -1, 0};

        int r = 0;
        int c = 0;
        int dir = 0;

        for (int i = 0; i < n * m; i++) {
            ans.add(matrix[r][c]);
            visited[r][c] = true;

            int nr = r + dr[dir];
            int nc = c + dc[dir];

            if (nr < 0 || nr >= n || nc < 0 || nc >= m || visited[nr][nc]) {
                dir = (dir + 1) % 4;
                nr = r + dr[dir];
                nc = c + dc[dir];
            }

            r = nr;
            c = nc;
        }

        return ans;
    }
}