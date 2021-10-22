public static void quickSort(int start, int end, int[] arr) {
    if(end <= start) return;

    int pivot = arr[start];
    int left = start;
    int right = end;
    while (left < right) {
        //right을 먼저 줄여줘야 한다 그래야 left == right 이 될때 arr[left] <= pivot을 만족
        while (pivot < arr[right] && left < right) {
            right--;
        }

        while (arr[left] <= pivot && left < right) {
            left++;
        }

        swap(left, right, arr);
    }

    swap(start, left, arr);
    quickSort(start, left - 1, arr);
    quickSort(left + 1, end, arr);
}

public static void swap(int i, int j, int[] arr) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
}
