class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int n = arr.length;
        int answer = 0;
        int sum = 0;
        int requiredSum = threshold * k;
        for (int i = 0; i < k; i++) {
            sum = sum + arr[i];
        }
        if (sum >= requiredSum) {
            answer++;
        }

        for (int i = 0; i < n - k; i++) {
            sum = sum - arr[i] + arr[i + k];
            if (sum >= requiredSum) {
                answer++;
            }
        }

        return answer;
    }

}