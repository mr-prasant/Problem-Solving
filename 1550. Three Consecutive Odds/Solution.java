class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        for (int i = 0; i < arr.length-2; i++) {
            if (arr[i]%2 == 1 && consOdd(arr, arr.length, i))  return true;
        }

        return false;
    }

    public boolean consOdd(int[] arr, int n, int idx) {

        return (idx+2 >= n)? false
               : ((arr[idx+1]%2 == 1) && (arr[idx+2]%2 == 1));
               
    }
}