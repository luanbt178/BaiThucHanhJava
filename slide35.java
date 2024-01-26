import java.util.Scanner;

/**
 * timsonhonhat
 */
public class timsonhonhat {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float a, b;
        System.out.println("Nhap so thu nhat: ");
        a = input.nextFloat();
        System.out.println("Nhap vao so thu hai: ");
        b = input.nextFloat();
        if ( a < b){
            System.out.println("So nho nhat trong hai so la: " +a);
        }
        else{
            System.out.println("So nho nhat trong hai so la: " +b);
        }
        input.close();
    }
}