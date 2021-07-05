import java.util.Scanner;
public class VucutKitleIndeksi {
    public static void main(String[] args) {
     Scanner imput = new Scanner(System.in);
        System.out.print("Boyunuzu giriniz(metre cinsinden):");
        float boy = imput.nextFloat();
        System.out.print("Kilonuzu giriniz:");
        float kilo = imput.nextFloat();
        float sonuc = kilo /(boy*boy);
        System.out.println("Vücut kitle indeksiniz: " + sonuc);
    }
}
