/*
Java ile kullanıcıdan boy ve kilo değerlerini alıp bir değişkene atayın. Aşağıdaki formüle göre kullanıcının "Vücut Kitle İndeks" değerini hesaplayıp ekrana yazdırın.

Formül
Kilo (kg) / Boy(m) * Boy(m)
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        System.out.print("Lutfen boyunuzu (metre cinsinde) giriniz: ");
        double boy = inp.nextDouble();
        System.out.print("Lutfen kilonuzu giriniz  : ");
        double kilo = inp.nextDouble();

        double vucutKitleIndeksi = kilo/(boy*boy);
        System.out.print("Vucut Kitle Indeksiniz  : "+vucutKitleIndeksi);
    }
}