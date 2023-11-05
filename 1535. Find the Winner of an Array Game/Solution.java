class Solution {

    public static int getWinner(int[] arr, int k) {
        int p = 0;
        int n = arr.length;

        int max = arr[0];
        for (int i = 1; i < n; i++) {
            if (p == k) {
                return max;
            }

            if (max < arr[i]) {
                p = 1;
                max = arr[i];
            } else {
                p++;
            }
        }

        return max;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 1, 3, 5, 4, 6, 7 };
        int k = 2;

        System.out.println(getWinner(arr, k));
    }
}