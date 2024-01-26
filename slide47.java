import java.util.Scanner;

/**
 * tongcacsonguyen
 */
public class tongcacsonguyen {
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int so, sum = 0;
    do {
        System.out.println("Nhap vao mot so: ");
        so = input.nextInt();
        sum += so;
    }while(sum <= 100);
    System.out.println("Tong cac so vua nhap la: "+sum);
    input.close();
}
}