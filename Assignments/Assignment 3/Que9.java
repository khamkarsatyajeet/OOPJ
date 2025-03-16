/*
9. Find Missing Number in an Array
○ Given an array of size n-1 containing numbers from 1 to n, find the missing number.
*/



public class Que9 {
    public static int findMissingNumber(int[] arr, int n) {
        int expectedSum = n * (n + 1) / 2;

        int actualSum = 0;
        for (int num : arr) {
            actualSum += num;
        }

        return expectedSum - actualSum;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 6}; // n = 6 (one number is missing)
        int n = 6;
        System.out.println("Missing Number: " + findMissingNumber(arr, n));
    }
}