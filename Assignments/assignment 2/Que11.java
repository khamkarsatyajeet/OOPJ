/*  Q11: Write a program to check if a given number is a power of 2 using bitwise operators.
Hint: n & (n - 1) == 0 for positive numbers.  */


class Que11 {
    public static void main(String[] args) {
        int n = 16; 

        boolean isPowerOftwo = (n > 0) && ((n & (n - 1)) == 0);

        System.out.println(n + " is a power of 2: " + isPowerOftwo);
    }
}