public class starPattern {

    public static void main(String[] args){
    // Right Angled Triangle
        for(int k = 1; k <= 5; k++){
            for(int l = 1; l <= k; l++){
                System.out.print("* ");
            }
            System.out.println();
        }
    
// Inverted Right angled Triangle
        for(int i = 4 ; i >= 1 ; i--){
           for(int j = 1; j <= i ; j++){
               System.out.print("* ");
          }
            System.out.println();
       }
// Combining Both Results to a Star pattern
/*

* 
* * 
* * * 
* * * * 
* * * * * 
* * * * 
* * * 
* * 
* 

 */
}
}
