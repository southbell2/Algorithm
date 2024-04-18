//유클리드 호제법을 이용한 최대공약수와 최소공배수 구하기

public int gdc(int a, int b) {
    if(a < b) {
        int temp = a;
        a = b;
        b = temp;
    }
    while(b != 0) {
        int r = a % b;
        a = b;
        b = r;
    }
    return a;
  }
  
  public int lcm(int a, int b) {
    return a*b / gdc(a,b);
}
