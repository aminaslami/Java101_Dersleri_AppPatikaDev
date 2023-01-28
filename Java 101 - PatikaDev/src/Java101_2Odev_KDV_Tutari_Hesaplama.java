import java.util.Scanner;
public class Java101_2Odev_KDV_Tutari_Hesaplama
{
   public static void main(String[] args)
   {
      double tutar, kdvOran = 0.18, kdvTutar, kdvliTutar;

      Scanner giris = new Scanner(System.in);

      System.out.print("Ucret Tutarini Giriniz: ");
      tutar = giris.nextDouble();

      kdvTutar = tutar * kdvOran;
      kdvliTutar = tutar + kdvTutar;

      if(tutar > 0 && tutar < 1000)
      {
         System.out.println("KDV Tutari = " + kdvTutar);
      }
      else if(tutar > 1000)
      {
         kdvOran = 0.08;
         kdvTutar = tutar * kdvOran;
         System.out.println("KDV Tutari " + kdvTutar);
      }
   }
}
/*
KDV Tutarý Hesaplayan Program
Java ile kullanýcýdan alýnan para deðerinin KDV'li fiyatýný ve KDV
tutarýný hesaplayýp ekrana bastýran programý yazýn.

(Not: KDV tutarýný 18% olarak alýn)

KDV'siz Fiyat = 10;
KDV'li Fiyat = 11.8;
KDV tutarý = 1.8;

Ödev
Eðer girilen tutar 0 ve 1000 TL arasýnda ise KDV oraný %18 , tutar 1000 TL'den büyük ise
KDV oranýný %8 olarak KDV tutarý hesaplayan programý yazýnýz.
 */
// Kaynak: https://app.patika.dev/courses/java101/pratik-kdv-hesaplama