public int[][] rotate(int[][] arr) {
    int n = arr.length;
    int m = arr[0].length;
    int[][] rotate = new int[m][n];

    //시계방향으로 90도 회전
    for (int i = 0; i < rotate.length; i++) {
        for (int j = 0; j < rotate[i].length; j++) {
            rotate[i][j] = arr[n-1-j][i];
        }
    }

    return rotate;
}
