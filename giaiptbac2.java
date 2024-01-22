
import java.util.Scanner;

public class giaiptbac2{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float a, b, c, delta, x1, x2;
        System.out.println("Nhap gia tri cua a: ");
        a = input.nextFloat();
        System.out.println("Nhap gia tri cua b: ");
        b = input.nextFloat();
        System.out.println("Nhap gia tri cua c: ");
        c = input.nextFloat();

        delta = b*b - 4*a*c;
        if (delta < 0) {
            System.out.println("Phuong trinh vo nghiem.");
            }
         else if (delta == 0) {
            double x = -b / (2 * a);
            System.out.println("Nghiệm kép x = " + x);
         }
        else {
            x1 =(float)(-b + Math.sqrt(delta)) / (2 * a);
            x2 =(float)(-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("Phuong trinh co 2 nghiem phan biet : x1 = " + x1 + "x2=" + x2);
            input.close();;
        }
    }

}
