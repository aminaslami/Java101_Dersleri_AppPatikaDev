import java.util.Scanner;
public class Java101_5Pratik_DaireVeCevreHesaplama
{
   public static void main(String[] args)
   {
      Scanner giris = new Scanner(System.in);

      final double  PI_SAYISI = 3.14;
      System.out.print("Lutfen yari capli degerini giriniz: ");
      int yariCap = giris.nextInt();

      double alan =  PI_SAYISI * yariCap * yariCap;

      double cevre = 2 * yariCap * PI_SAYISI;

      System.out.println("Alan = " + alan + " \nCevre = " + cevre);
   }
}