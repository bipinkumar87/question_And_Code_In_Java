/*Question print pattern
 *  *
 *    * 
 *      *
 *        *
 */


package QuestionAndAnswer;
import java.util.Scanner;
public class pattern7 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int num =sc.nextInt();
        for(int i=1;i<=num;i++){
            for(int j=1;j<=num;j++){
                if(i==j){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    
}
