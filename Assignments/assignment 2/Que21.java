/* Q21: Write a program that increments a number without using + or ++ operators.
Hint: Use bitwise - (~x).  */



class Que21 {
    public static void main(String[] args) {
        int num = 5; 
        
        int incrementedNum = -(~num);

        System.out.println("Original number: " + num);
        System.out.println("Incremented number: " + incrementedNum);
    }
}