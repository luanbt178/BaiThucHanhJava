import java.util.Scanner;

public class Person {

    public String hoTen;
    public int tuoi;
    public double chieuCao;
    public double canNang;

    Scanner input = new Scanner(System.in);
    public Person (){
        hoTen = "NguyenVanA";
        tuoi = 18;
        chieuCao = 1.89;
        canNang = 76.8;
    }
    void NhapTT()
    {
        System.out.print("Ten: ");
        hoTen = input.nextLine();
        System.out.print("Tuoi: ");
        tuoi = input.nextInt();
        System.out.print("Chieu cao: ");
        chieuCao = input.nextFloat();
        System.out.print("Can nang: ");
        canNang = input.nextFloat();
    }
    

    void Thongtin(String name , int age, double hight, double weight)
    {
        System.out.print("Ho ten: "+name+ ", "+age+" tuoi, cao: "+hight+" m, Can nang: "+weight+" kg."); 
    }
    void inthongtin()
    {
        System.out.print("Ho ten: "+hoTen+ ", "+tuoi+" tuoi, cao: "+chieuCao+" m, Can nang: "+canNang+" kg."); 
    }

    void Thongtin()
    {
   System.out.print(hoTen+ ", "+tuoi+" tuoi, cao: "+chieuCao+" m, Can nang: "+canNang+" kg.");
    }
}