import java.util.Scanner;
public class Java101_6Odev_Vucut_Kitle_Index
{
   public static void main(String[] args)
   {
      Scanner giris = new Scanner(System.in);

      System.out.print("L�tfen boyunuzu (metre cinsinde) giriniz: ");
      double boy = giris.nextDouble();

      System.out.print("L�tfen kilonuzu giriniz: ");
      double kilo = giris.nextDouble();

      double kitle = kilo / (boy * boy);
      System.out.println("V�cut Kitle �ndeksiniz: " + kitle);
   }
}
/* V�cut Kitle �ndeksi Hesaplama Java ile kullan�c�dan boy ve kilo de�erlerini al�p bir
de�i�kene atay�n. A�a��daki form�le g�re kullan�c�n�n "V�cut Kitle �ndeks" de�erini hesaplay�p ekrana yazd�r�n.

Form�l
Kilo (kg) / Boy(m) * Boy(m)
*/
// Kaynak: https://app.patika.dev/courses/java101/odev-vucut-kitle-hesaplama