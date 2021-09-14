//lower bound 구하기, 특정 target보다 크거나 같은 첫번째 원소의 index를 리턴한다
private static int lowerBound(List<Integer> data, int target) {
    int start = 0;
    int end = data.size();
    
    while(start < end) {
    	int mid = (start + end) / 2;
        
        if(target <= data.get(mid)) {
        	end = mid;
        }
        else {
        	start = mid + 1;
        }
    }
    return end;
}

//upper bound 구하기, 특정 target보다 큰 첫번째 원소의 index를 리턴한다
private static int upperBound(List<Integer> data, int target) {
    int start = 0;
    int end = data.size();
    
    while(start < end) {
    	int mid = (start + end) / 2;
        
        if(target < data.get(mid)) {
        	end = mid;
        }
        else {
        	start = mid + 1;
        }
    }
    return end;
}
