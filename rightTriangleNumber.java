import java.util.Scanner;
public class Main
{
      
public static void main(String[] args) 
{
Scanner sc = new Scanner(System.in);
      
System.out.println("Enter the number of rows: ");
 
int rows = sc.nextInt();
          
for (int i = 1; i <= rows; i++) 
{
for (int j = i; j >= 1; j--)
   {
       System.out.print(j+" ");
   }
     
   System.out.println();
}         
sc.close();
}
}
 
