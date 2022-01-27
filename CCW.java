//CCW 알고리즘, 두 선분이 교차했는지 판별하는데 사용할 수 있다.
public static int checkCCW(Point p1, Point p2, Point p3) {
  //외적을 구한다.
    long ret = (p1.x * p2.y + p2.x * p3.y + p3.x * p1.y) - (p1.y * p2.x + p2.y * p3.x + p3.y * p1.x);
    if(ret > 0) return 1;
    else if(ret == 0) return 0;
    else return -1;
}
