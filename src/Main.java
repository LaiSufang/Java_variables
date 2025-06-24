//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // ✅ Variable = a named, reusable container for a value;
        //               a variable behaves as if it was the value it contains

        // 🟥 Primitive variables = simple value stored directly in memory (stack)
        // 🟦 Reference variables = memory address (stack) that points to the (heap)

        // 🟥 Primitive Types (store actual values):
        //    int, double, char, boolean, byte, short, long, float

        // 🟦 Reference Types (store references to objects):
        //    String, Array, Class, Interface, Object

        // 2 steps to create a variable:
        // 1). variable declaration = tell the compiler the variable's type and name
        // 2). assignment = assigning a value to a variable

        // 📝 Naming Rules:
        //    - Must start with a letter, $, or _
        //    - Cannot start with a digit
        //    - Case-sensitive
        //    - No spaces or special characters (except $ and _)
        //    - Should use camelCase for variables


        // 🧑‍💻 Examples:

        // Primitive variables
        int age = 30;
        int year = 2025;

        double price = 19.999;
        double gpa = 4.0;
        double temperature = -25.5;

        char grade = 'A';
        char symbol = '!';
        char currency = '$';

        boolean isStudent = true;
        boolean forSale = false;

        // Reference variables
        String firstName = "Michael";
        String lastName = "Scott";

        int[] numbers = {1,2,3};

        // 🟢 Constants (final variables)
        //    - Value cannot be changed after assignment
        final double PI = 3.14159;


        // System.out.print(): Prints text without a newline at the end.
        // System.out.println(): Prints text and moves to a new line.
        // System.out.printf(): Prints formatted text, allowing placeholders for variables.
        System.out.print(firstName + " " + lastName + "\n");
        System.out.println(firstName + " " + lastName);
        System.out.printf("Name: %s, Age %d, Price: %.2f\n", firstName, age, price);


        ArithmeticOperations();

    }
    
    public static void ArithmeticOperations(){
        int x = 10;
        int y = 20;
        int z = 2;

        // Arithmetic Operators:
        // z = x + y;
        // z = x - y;
        // z = x * y;
        // z = x / y;
        // z = x % y;


        // Augmented Assignment Operators
        // z += y;
        // z -= y;
        // z *= y;
        // z /= y;
        // z %= y;

        // Increment and Decrement Operators
        // z += 1;
        // z ++;
        // z -= 1;
        // z --;

        // System.out.println(z);

        // Order of Operations [PEMDAS]:
        // Parenthesis --> Exponents --> Multiplication --> Division --> Addition --> Subtraction
        double result = 3 + 4 * (7 - 5) / 2.0;

        System.out.println(result);
    }
}