import java.util.Scanner;

 public class RightTriangle{
  
   public static void main(String...args){
   Scanner scanner = new Scanner(System.in);
  
   System.out.println("Enter length of base of the triangle between 1-10: ");
   int lenght_size = scanner.nextInt();

     
   for (int f = 1; f <= lenght_size; f++) {
            for (int p = 1; p <= f; p++) {
                System.out.print(" * ");
                
               }
                  System.out.println();
        }
    

     
   
 } 

}


