public static int[][] matrixMultiply(int[][] A, int[][] B) {
    int[][] ret = new int[8][8];
    for (int i = 0; i < 8; i++) {
        for (int j = 0; j < 8; j++) {
            int c = 0;
            for (int k = 0; k < 8; k++) {
                c += (A[i][k] * B[k][j]);
            }
            ret[i][j] = c;
        }
    }

    return ret;
}
