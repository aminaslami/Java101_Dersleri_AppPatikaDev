import java.util.Scanner;
public class Java101_7Odev_Manav_Kasa_Programi
{
   public static void main(String[] args)
   {
      Scanner giris = new Scanner(System.in);

      System.out.print("Armut Ka� Kilo: ");
      double armut = giris.nextDouble();

      System.out.print("Elma Ka� Kilo: ");
      double elma = giris.nextDouble();

      System.out.print("Domates Ka� Kilo: ");
      double domates = giris.nextDouble();

      System.out.print("Muz Ka� Kilo: ");
      double muz = giris.nextDouble();

      System.out.print("Patl�can Ka� Kilo: ");
      double patlican = giris.nextDouble();

      double toplam_Tutar = (armut * 2.14) + (elma * 3.67) + (domates * 1.11) + (muz * 0.95) + (patlican * 5.00);
      System.out.println("Toplam Tutar = " + toplam_Tutar);
   }
}
/*
Manav Kasa Program�
Java ile kullan�c�lar�n manavdan alm�� olduklar� �r�nlerin kilogram de�erlerine
g�re toplam tutar�n� ekrana yazd�ran program� yaz�n.

Meyveler ve KG Fiyatlar�

      Armut : 2,14 TL
      Elma : 3,67 TL
      Domates : 1,11 TL
      Muz: 0,95 TL
      Patl�can : 5,00 TL
*/
// Kaynak: https://app.patika.dev/courses/java101/odev-manav-kasa