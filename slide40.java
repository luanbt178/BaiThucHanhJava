import java.util.Scanner;

/**
 * songaytrongtuan
 */
public class songaytrongtuan {
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int ngay;
    System.out.println("Nhap vao so ngay: ");
    ngay = input.nextInt();
    switch (ngay) {
        case 1:
        System.out.println("Ngay "+ngay+" la thu 2.");
            break;
        case 2:
        System.out.println("Ngay "+ngay+" la thu 3.");
        break;
        case 3:
        System.out.println("Ngay "+ngay+" la thu 4.");
        break;
        case 4:
        System.out.println("Ngay "+ngay+" la thu 5.");
        break;
        case 5:
        System.out.println("Ngay "+ngay+" la thu 6.");
        break;
        case 6:
        System.out.println("Ngay "+ngay+" la thu 7.");
        break;
        case 7:
        System.out.println("Ngay "+ngay+" la Chu nhat.");
            break;
        default:
        System.out.println("So ngay khong hop le.");
        break;
    }
    input.close();
}
    
}