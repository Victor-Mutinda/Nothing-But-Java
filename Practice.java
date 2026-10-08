import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number");
        int n = scan.nextInt();
        scan.nextLine(); // Consume the newline character left by nextInt() 
        

        System.out.print("Enter a Phrase: ");
        String phrase = scan.nextLine();
     
        evenOdd(n);
        
        System.out.println("The answer is: " + multiply(5,10));

        

        StringBuilder sb = new StringBuilder(); // StringBuilder is used to create a mutable string. It allows you to modify the string without creating a new object each time.
        sb.append(phrase); // Appending 'phrase' means adding every character of 'phrase' to sb object.

        sb = sb.reverse(); //Since phrase strings are already added in sb, you can know manipulate the strings since they are mutable

        System.out.println("The reversed phrase is: " + sb);
        scan.close();
    }
// Reason why these 2 methods are outside the main method is because in Java you cant define a method inside another method.
//  The main method is the entry point of the program and can call other methods defined in the class. 

    // Multiply two numbers
    public static int multiply(int a, int b) {
        int answer =  a * b ;
        return answer;
    }
    // Check if a number is even or odd
    public static int evenOdd(int number){
        if (number % 2 == 0) {
            System.out.println(number + " is even");
            return number;
        } else {
            System.out.println(number + " is odd");
            return number;
        } 
        
    }


    }
