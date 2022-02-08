
public static void main(String[] args) {
    //두 선분이 교차 하는지 판단하고 싶은 선분의 점들, 선분 A는 점 a,b 로 구성, 선분 B는 점 c,d로 구성
    Point a;
    Point b;
    Point c;
    Point d;

    int abc = checkCCW(a, b, c);
    int abd = checkCCW(a, b, d);
    int cda = checkCCW(c, d, a);
    int cdb = checkCCW(c, d, b);
    if (abc * abd > 0 || cda * cdb > 0) continue;
    //네 점이 한 직선상에 있을 경우
    if (abc * abd == 0 && cda * cdb == 0) {
        if(1 == comparePoint(a, b)) swap(a, b);
        if(1 == comparePoint(c, d)) swap(c, d);

        if (comparePoint(c, b) > 0 || comparePoint(a, d) > 0) continue;
    }
    /*
      여기는 두 선분이 교차할때 사용할 로직을 적는다.
    */
}


//CCW 알고리즘, 두 선분이 교차했는지 판별하는데 사용할 수 있다.
public static int checkCCW(Point p1, Point p2, Point p3) {
  //외적을 구한다.
    long ret = (p1.x * p2.y + p2.x * p3.y + p3.x * p1.y) - (p1.y * p2.x + p2.y * p3.x + p3.y * p1.x);
    if(ret > 0) return 1;
    else if(ret == 0) return 0;
    else return -1;
}


//4개의 점이 한 직선에 놓였을때 위치를 판별하기 위한 메소드
public static int comparePoint(Point p1, Point p2) {
    if(p1.x < p2.x) return -1;
    else if (p1.x == p2.x) {
        if(p1.y < p2.y) return -1;
        else if(p1.y == p2.y) return 0;
        else return 1;
    }
    else return 1;
}
