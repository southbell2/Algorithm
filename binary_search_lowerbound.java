//lower bound 구하기
while (start < end) {
    int mid = (start + end) / 2;
    if(list.get(mid) < score) {
        start = mid + 1;
    }else {
        end = mid;
    }
}
