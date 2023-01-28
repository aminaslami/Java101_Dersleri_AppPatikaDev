import java.util.Scanner;
public class Java101_6Odev_Vucut_Kitle_Index
{
   public static void main(String[] args)
   {
      Scanner giris = new Scanner(System.in);

      System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz: ");
      double boy = giris.nextDouble();

      System.out.print("Lütfen kilonuzu giriniz: ");
      double kilo = giris.nextDouble();

      double kitle = kilo / (boy * boy);
      System.out.println("Vücut Kitle Ýndeksiniz: " + kitle);
   }
}
/* Vücut Kitle Ýndeksi Hesaplama Java ile kullanýcýdan boy ve kilo deðerlerini alýp bir
deðiþkene atayýn. Aþaðýdaki formüle göre kullanýcýnýn "Vücut Kitle Ýndeks" deðerini hesaplayýp ekrana yazdýrýn.

Formül
Kilo (kg) / Boy(m) * Boy(m)
*/
// Kaynak: https://app.patika.dev/courses/java101/odev-vucut-kitle-hesaplama