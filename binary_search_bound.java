//lower bound 구하기, 특정 target보다 크거나 같은 첫번째 원소의 index를 리턴한다
private static int lowerBound(List<Integer> data, int target) {
    int begin = 0;
    int end = data.size();
    
    while(begin < end) {
    	int mid = (begin + end) / 2;
        
        if(data.get(mid) >= target) {
        	end = mid;
        }
        else {
        	begin = mid + 1;
        }
    }
    return end;
}

//upper bound 구하기, 특정 target보다 큰 첫번째 원소의 index를 리턴한다
private static int upperBound(List<Integer> data, int target) {
    int begin = 0;
    int end = data.size();
    
    while(begin < end) {
    	int mid = (begin + end) / 2;
        
        if(data.get(mid) <= target) {
        	begin = mid + 1;
        }
        else {
        	end = mid;
        }
    }
    return end;
}
