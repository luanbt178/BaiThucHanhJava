import java.util.Scanner;

/**
 * 30
 */
public class Tinhtong {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        int a, sum = 0;
        System.out.println("Nhap vao mot so.");
        a = input.nextInt();
        while( a > 0){
            sum += a % 10;
            a = a / 10;
        }
        System.out.println("Tong cua cac chu so la: " + sum );
        input.close();

    }
    
}