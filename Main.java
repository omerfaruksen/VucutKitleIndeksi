import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //Değişkenleri tanımlıyoruz
        float boy,kilo;

        Scanner inp= new Scanner(System.in);
        //Kullanıcıdan verileri alıyoruz
        System.out.print("Boyunuzu giriniz (m): ");
        boy =inp.nextFloat();
        System.out.print("Kilonuzu giriniz (kg): ");
        kilo=inp.nextFloat();

        float endex= kilo/(boy*boy);
        System.out.print("Vücut kitle indeksiniz: " +endex);

    }
}