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

        

        StringBuilder sb = new StringBuilder();
        sb.append(phrase);

        sb = sb.reverse();

        System.out.println("The reversed phrase is: " + sb);
        scan.close();
    }
    // Multiply two numbers
    public static int multiply(int a, int b) {
        int answer =  a * b ;
        return answer;
    }
    
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
