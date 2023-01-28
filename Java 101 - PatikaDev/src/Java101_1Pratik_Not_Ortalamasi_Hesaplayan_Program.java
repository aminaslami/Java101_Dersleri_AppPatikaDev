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

        System.out.print("T�rk�e Notunuzu Giriniz: ");
        int trNot = giris.nextInt();

        System.out.print("Tarih Notunuzu Giriniz: ");
        int tarhNot = giris.nextInt();

        int dersNotOrtalamasi = (matNot + fizkNot + kimyaNot + trNot + trNot) / 5;
        System.out.println("Not Ortalamas� Sonucu: " + dersNotOrtalamasi);
    }
}
/*
 Not Ortalamas� Hesaplayan Program
 Java ile Matematik, Fizik, Kimya, T�rk�e, Tarih, M�zik derslerinin s�nav puanlar�n� kullan�c�dan
 alan ve ortalamalar�n� hesaplay�p ekrana bast�r�lan program� yaz�n.

 �dev
 Ayn� program i�erisinde ko�ullu ifadeler kullan�larak, e�er kullan�c�n�n ortalamas� 60'dan
 b�y�k ise ekrana "S�n�f� Ge�ti" , k���k ise "S�n�fta Kald�" yazs�n.

 Not : If ve Else kullan�lmayacak...
 Kaynak: https://app.patika.dev/courses/java101/pratik-not-ortalamasi
 */