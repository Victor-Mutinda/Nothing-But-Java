public class rightAngledTriangleLeft {
    public static void main(String[] args){
        int rows = 5 ;
        int k ;
        int l ;

    // Left sided Right Angled Triangle
        for(k = 0; k < rows; k++){
            
            for(l = 2 * (5 - k); l >= 0; l--){
                System.out.print(" ");
               // System.out.print("Y");   
            }

            for(l = 0; l <=k; l++){
                 System.out.print("* ");
            }
            
            System.out.println();
        }

    }
}