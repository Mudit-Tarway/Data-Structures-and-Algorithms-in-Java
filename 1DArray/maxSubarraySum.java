public class maxSubarraySum {
    public static void main(String[] args) {
        int[] arr = {0, 2, 3, -2, 5};
        int maxSum = findMaxSubarraySum(arr);
        System.out.println("Maximum subarray sum is: " + maxSum);
    }
    public static int findMaxSubarraySum(int[] arr) {
        int maxSum = arr[0];
        int currentSum = arr[0];

        for (int i = 1; i < arr.length; i++) {
            currentSum = Math.max(arr[i], currentSum + arr[i]);
            maxSum = Math.max(maxSum, currentSum);
        }
        return maxSum;
    }
}
