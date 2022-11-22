//2차원 배열을 대칭이동 한다

/* 대각 대칭이동 11-5시 방향
\  
 \
  \
*/
public void diagonal(int[][] matrix) {
    int row = matrix.length;
    int col = 1;

    for(int i = 0; i < row; i++) {
        for(int j = 0; j < col; j++) {
            int temp = matrix[i][j];
            matrix[i][j] = matrix[j][i];
            matrix[j][i] = temp;
        }
        col++;
    }
}


//좌우 대칭이동
public void leftRight(int[][] matrix) {
    int row = matrix.length;
    int col = matrix[0].length;

    for(int i = 0; i < row; i++) {
        for(int j = 0; j < col / 2; j++) {
            int temp = matrix[i][j];
            matrix[i][j] = matrix[i][col-1-j];
            matrix[i][col-1-j] = temp;
        }
    }
}
