import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        // Degiskenler olustur
        double km, acilis, min,tutar;
        min = 20;
        acilis=10;
        Scanner inp = new Scanner(System.in);
        System.out.print("Gidilecek KM Giriniz");
        km = inp.nextInt();

         tutar = km*2.20 + acilis;
         tutar = (tutar<min)?min:tutar;
        System.out.print("Odenecek Tutar:" + tutar);

















    }
}
