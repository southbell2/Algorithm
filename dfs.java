class Solution {
    public static boolean[][] visited;
    public static int cnt;
    
    public int[] solution(int m, int n, int[][] picture) {
        visited = new boolean[m][n];
        cnt = 0;
        int answer1 = 0;
        int answer2 = 0;
        
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(dfs(i,j,picture,picture[i][j])){
                    answer1++;
                    answer2 = Math.max(answer2, cnt);
                    cnt = 0;
                }
            }
        }
        int[] answer = {answer1,answer2};
        
        return answer;
    }
    
    public boolean dfs(int r, int c, int[][] picture, int number){
        if(r < 0 || picture.length <= r || c < 0 || picture[0].length <= c){
            return false;
        }
        if(picture[r][c] == 0) return false;
        if(visited[r][c] == false && picture[r][c] == number){
            visited[r][c] = true;
            cnt++;
            dfs(r-1,c,picture,number);
            dfs(r+1,c,picture,number);
            dfs(r,c-1,picture,number);
            dfs(r,c+1,picture,number);
            
            return true;
        }
        
        return false;
    }
}
