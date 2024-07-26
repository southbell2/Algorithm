List<Integer> primeList = new ArrayList<>();
for(int i = 2; i <= Math.sqrt(N); i++) {	// 또는 i * i <= N
	while(N % i == 0) {
		primeList.add(i);
		N /= i;
	}
}
 
if(N != 1) {
	primeList.add(N);
}
//primeList에는 소인수가 오름차순으로 들어가있다.
