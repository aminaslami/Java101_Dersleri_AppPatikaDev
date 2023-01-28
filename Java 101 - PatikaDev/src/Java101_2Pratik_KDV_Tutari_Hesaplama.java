import java.util.Scanner;
public class Java101_2Pratik_KDV_Tutari_Hesaplama
{
    public static void main(String[] args)
    {
        double tutar, kdvOran = 0.18, kdvTutar, kdvliTutar;

        Scanner giris = new Scanner(System.in);

        System.out.print("Ucret Tutarini Giriniz: ");
        tutar = giris.nextDouble();

        kdvTutar = tutar * kdvOran;
        kdvliTutar = tutar + kdvTutar;

        System.out.println("KDV'siz Fiyat = " + tutar);
        System.out.println("KDV Oran = " + kdvOran);
        System.out.println("KDV Tutari = " + kdvTutar);
        System.out.println("KDV'li Tutar = " + kdvliTutar);
    }
}