public class FizzBuzz {
    public static void main(String[] args) {
        fizzBuzz(0); //F
        fizzBuzz(1); // ''
        fizzBuzz(3); // Fizz
        fizzBuzz(27); // Fizz
        fizzBuzz(5); //Buzz
        fizzBuzz(25); //Buzz
        fizzBuzz(15); //Fb
        fizzBuzz(30); //fb
    }
    public static void fizzBuzz(int a){
        if (a % 3 == 0) System.out.print("Fizz");
        if (a % 5 == 0) System.out.print("Buzz");
        System.out.println();
    }
}

