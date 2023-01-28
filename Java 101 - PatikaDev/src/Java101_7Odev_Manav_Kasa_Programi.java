import java.util.Scanner;
public class Java101_7Odev_Manav_Kasa_Programi
{
   public static void main(String[] args)
   {
      Scanner giris = new Scanner(System.in);

      System.out.print("Armut Kaç Kilo: ");
      double armut = giris.nextDouble();

      System.out.print("Elma Kaç Kilo: ");
      double elma = giris.nextDouble();

      System.out.print("Domates Kaç Kilo: ");
      double domates = giris.nextDouble();

      System.out.print("Muz Kaç Kilo: ");
      double muz = giris.nextDouble();

      System.out.print("Patlýcan Kaç Kilo: ");
      double patlican = giris.nextDouble();

      double toplam_Tutar = (armut * 2.14) + (elma * 3.67) + (domates * 1.11) + (muz * 0.95) + (patlican * 5.00);
      System.out.println("Toplam Tutar = " + toplam_Tutar);
   }
}
/*
Manav Kasa Programý
Java ile kullanýcýlarýn manavdan almýþ olduklarý ürünlerin kilogram deðerlerine
göre toplam tutarýný ekrana yazdýran programý yazýn.

Meyveler ve KG Fiyatlarý

      Armut : 2,14 TL
      Elma : 3,67 TL
      Domates : 1,11 TL
      Muz: 0,95 TL
      Patlýcan : 5,00 TL
*/
// Kaynak: https://app.patika.dev/courses/java101/odev-manav-kasa