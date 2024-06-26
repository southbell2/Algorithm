for(int i = 2; i <= Math.sqrt(N); i++) {	// 또는 i * i <= N
	while(N % i == 0) {
		println(i);
		N /= i;
	}
}
 
if(N != 1) {
	println(N);
}
