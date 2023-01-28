import java.util.Scanner;
public class Java101_1Odev_Not_Ortalamasi_Hesaplayan_Program
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

        // int dersNotOrtalamasi = (matNot + fizkNot + kimyaNot + trNot + trNot) / 5;
        // System.out.println("Not Ortalamasý Sonucu: " + dersNotOrtalamasi);

        int dersNotOrtalamasi = 60;
        switch (dersNotOrtalamasi){
            case 1: System.out.println("Sinif Gecti");
                break;
            default:
                System.out.println("Sinif Kaldi");
                break;
        }
    }
}
