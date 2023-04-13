import java.util.Scanner;
public class ThrowExecption {
  public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int roll_no=sc.nextInt();
        if(roll_no<0){
            throw new ArithmeticException("Roll Number Can't be negative");
        }
        else{
            System.out.println("Roll No. is Accepted");
        }
    }
}
