public class Typecasting {
    public static void main(String[] args) {

        //widening casting:

        //byte -> short -> char -> int -> long -> float -> double

        // widening casting: int to double
        int myInt = 9;
        double myDouble = myInt; // Automatic casting: int to double
    
        System.out.println(myInt);  
        System.out.println(myDouble);  

        //narrowing casting:

        //double -> float -> long -> int -> char -> short -> byte

        //narrowing casting:
        double mydouble = 9.78d;
        int myint = (int) myDouble; // Manual casting: double to int

        System.out.println(mydouble);   
        System.out.println(myint); 
      }
}
