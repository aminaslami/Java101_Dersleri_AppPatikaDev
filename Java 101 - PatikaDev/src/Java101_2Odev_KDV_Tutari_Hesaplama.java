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
KDV Tutar� Hesaplayan Program
Java ile kullan�c�dan al�nan para de�erinin KDV'li fiyat�n� ve KDV
tutar�n� hesaplay�p ekrana bast�ran program� yaz�n.

(Not: KDV tutar�n� 18% olarak al�n)

KDV'siz Fiyat = 10;
KDV'li Fiyat = 11.8;
KDV tutar� = 1.8;

�dev
E�er girilen tutar 0 ve 1000 TL aras�nda ise KDV oran� %18 , tutar 1000 TL'den b�y�k ise
KDV oran�n� %8 olarak KDV tutar� hesaplayan program� yaz�n�z.
 */
// Kaynak: https://app.patika.dev/courses/java101/pratik-kdv-hesaplama