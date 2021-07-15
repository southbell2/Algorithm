public String convert(int n, int base){
    String T = "0123456789ABCDEF";
    int q = n / base;
    int r = n % base;
    if(q == 0) return Character.toString(T.charAt(r));
    else return convert(q, base) + T.charAt(r);
}
