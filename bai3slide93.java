import java.util.Scanner;

/**
 * tuoi
 */
public class tuoi {
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String ten;
    int tuoi;
    System.out.print("Ten cua nguoi do la: \n");
    ten = input.nextLine();
    System.out.print("Tuoi cua nguoi do la: ");
    tuoi = input.nextInt();
    if ( tuoi < 16){
        System.out.println("Ban "+ ten+  " o do tuoi vi thanh nien.");
    }
    else if(tuoi >= 16 && tuoi < 18){
        System.out.println("Ban "+ten+" o do tuoi truong thanh.");
    }
    else if(tuoi >= 18){
        System.out.println("Ban "+ten+ " da gia.");
    }
    input.close();
}
}