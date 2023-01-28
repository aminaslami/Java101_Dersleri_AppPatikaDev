import java.util.Scanner;
public class Java101_1Pratik_Not_Ortalamasi_Hesaplayan_Program
{
    public static void main(String[] args)
    {
        Scanner giris = new Scanner(System.in);

        System.out.print("Matematik Notunuzu Giriniz: ");
        int matNot = giris.nextInt();

        System.out.print("Fizik Notunuzu Giriniz: ");
        int fizkNot = giris.nextInt();

        System.out.print("Kimya Notunuzu Giriniz: ");
        int kimyaNot = giris.nextInt();

        System.out.print("Türkçe Notunuzu Giriniz: ");
        int trNot = giris.nextInt();

        System.out.print("Tarih Notunuzu Giriniz: ");
        int tarhNot = giris.nextInt();

        int dersNotOrtalamasi = (matNot + fizkNot + kimyaNot + trNot + trNot) / 5;
        System.out.println("Not Ortalamasý Sonucu: " + dersNotOrtalamasi);
    }
}
/*
 Not Ortalamasý Hesaplayan Program
 Java ile Matematik, Fizik, Kimya, Türkçe, Tarih, Müzik derslerinin sýnav puanlarýný kullanýcýdan
 alan ve ortalamalarýný hesaplayýp ekrana bastýrýlan programý yazýn.

 Ödev
 Ayný program içerisinde koþullu ifadeler kullanýlarak, eðer kullanýcýnýn ortalamasý 60'dan
 büyük ise ekrana "Sýnýfý Geçti" , küçük ise "Sýnýfta Kaldý" yazsýn.

 Not : If ve Else kullanýlmayacak...
 Kaynak: https://app.patika.dev/courses/java101/pratik-not-ortalamasi
 */