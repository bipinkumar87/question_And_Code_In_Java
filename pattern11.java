package QuestionAndAnswer;
import java.util.Scanner;
public class pattern11 {
    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int num=sc.nextInt();
        int a=1;
        for(int i=1;i<num;i++){
            for(int j=1;j<=i;j++){
                System.out.print(a+" ");
                a++;
            }
            
            System.out.println();
        }
    }
}
