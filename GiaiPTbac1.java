package BaithuchanhJava;
import java.util.Scanner;
public class GiaiPTbac1 {
    public static void main(String[] args) {
        float a,b,kq;
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap gia tri cua a: ");
        a = input.nextFloat();
        System.out.print("Nhap gia tri cua b: ");
        b = input.nextFloat();
        if (a == 0)
        {
            System.out.println("Khong phai phuong trinh bac nhat");
        }
        else
        {
            kq = -b / a;
            System.out.println("Phuong trinh co nghiem x = "+ kq);
        }
    }


}
