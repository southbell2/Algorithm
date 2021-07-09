static void per2(int[] arr, int[] output, boolean[] visited, int depth, int n, int r) {
	if(depth == r) {
		print(output, r);
		return;
	}

	for(int i = 0; i < n; i++) {
		if(visited[i] != true) {
			visited[i] = true;
			output[depth] = arr[i];
			per2(arr, output, visited, depth + 1, n, r);    
			visited[i] = false;
		}
	}
}