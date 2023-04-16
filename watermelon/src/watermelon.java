import java.util.Scanner;
public class watermelon {
    public static void main (String[]args) {
        Scanner input = new Scanner(System.in);
            int num;
            num=input.nextInt();
            if (num<=2) {
                System.out.println("no");
                return;
            }
            if(num%2==0){
                System.out.println("yes");
            }

            else System.out.println("no");

        }


}
