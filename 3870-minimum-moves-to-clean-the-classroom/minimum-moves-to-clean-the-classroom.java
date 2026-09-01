class Solution {
    public int minMoves(String[] classroom, int energy) {
        int m = classroom.length;
        int n = classroom[0].length();
        int startRow = -1, startCol = -1;
        List<int[]> litterPos = new ArrayList<>();
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                char cell = classroom[i].charAt(j);
                if (cell == 'S') {
                    startRow = i;
                    startCol = j;
                } else if (cell == 'L') {
                    litterPos.add(new int[]{i, j});
                }
            }
        }
        
        if (litterPos.isEmpty()) return 0;
        
        int litterCount = litterPos.size();
        boolean[][][][] visited = new boolean[m][n][energy + 1][1 << litterCount];
        
        Queue<int[]> queue = new ArrayDeque<>();
        queue.offer(new int[]{startRow, startCol, energy, 0, 0});
        visited[startRow][startCol][energy][0] = true;
        
        int[] directions = {-1, 0, 1, 0, -1};
        int allLitterMask = (1 << litterCount) - 1;
        
        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int row = current[0];
            int col = current[1];
            int currEnergy = current[2];
            int litterMask = current[3];
            int moves = current[4];
            
            if (litterMask == allLitterMask) {
                return moves;
            }
            
            for (int d = 0; d < 4; d++) {
                int newRow = row + directions[d];
                int newCol = col + directions[d + 1];
                
                if (newRow < 0 || newRow >= m || newCol < 0 || newCol >= n) {
                    continue;
                }
                
                char cell = classroom[newRow].charAt(newCol);
                if (cell == 'X' || currEnergy <= 0) {
                    continue;
                }
                
                int newEnergy = currEnergy - 1;
                int newLitterMask = litterMask;
                
                for (int i = 0; i < litterPos.size(); i++) {
                    if (litterPos.get(i)[0] == newRow && litterPos.get(i)[1] == newCol) {
                        newLitterMask |= (1 << i);
                        break;
                    }
                }
                
                if (cell == 'R') {
                    newEnergy = energy;
                }
                
                if (!visited[newRow][newCol][newEnergy][newLitterMask]) {
                    visited[newRow][newCol][newEnergy][newLitterMask] = true;
                    queue.offer(new int[]{newRow, newCol, newEnergy, newLitterMask, moves + 1});
                }
            }
        }
        
        return -1;
    }
}