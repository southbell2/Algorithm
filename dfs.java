//프로그래머스 카카오프렌즈 컬러링북 문제
class Solution {
    public static boolean[][] visited;
    //영역에서 몇 개가 있는지 카운트 하는 변수
    public static int cnt;
    
    public int[] solution(int m, int n, int[][] picture) {
        visited = new boolean[m][n];
        cnt = 0;
        //영역이 몇개인지
        int answer1 = 0;
        //영역의 최대개수가 몇개인지
        int answer2 = 0;
        
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                //dfs를 돌면서 true를 리턴할때만 영역의 개수가 1 올라간다
                if(dfs(i,j,picture,picture[i][j])){
                    answer1++;
                    //이 영역에서 구한 영역의 개수를 최대값과 비교한다
                    answer2 = Math.max(answer2, cnt);
                    //한 영역이 끝났으면 다시 영역의 개수를 0으로 초기화
                    cnt = 0;
                }
            }
        }
        int[] answer = {answer1,answer2};
        
        return answer;
    }
    //
    public boolean dfs(int r, int c, int[][] picture, int number){
        if(r < 0 || picture.length <= r || c < 0 || picture[0].length <= c){
            return false;
        }
        if(picture[r][c] == 0) return false;
        if(visited[r][c] == false && picture[r][c] == number){
            visited[r][c] = true;
            //영역이면 영역의 개수를 올려준다
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
