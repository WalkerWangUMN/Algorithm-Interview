public void swap (int []arr, int left, int right) {
    int temp = int arr[left];
    arr[left] = arr[right];
    arr[right] = temp;
}

public void quickSort(int [] arr, int leftend, int rightend) {
    int left = leftend;
    int right = rightend;
    int mid = arr[(left + right) / 2];
    do {
        while (arr[left] < mid) {
            left ++;
        }
        while (mid < arr[right]) {
            right --;
        }
        if (left <= right) {
            swap(arr, left, right);
            left ++;
            right --;
        }
    } while (left <= right);
    if (leftend < right) quickSort(arr, leftend, right);
    if (left < rightend) quickSort(arr, left, rightend);
}
