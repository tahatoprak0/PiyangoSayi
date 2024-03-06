import java.util.Scanner;

public class PiyangoSayiTahmin {
    public static void main(String[] args) {
        Scanner giris= new Scanner(System.in);
        int piyangoSayi=(int)(Math.random()*90)+10;
        System.out.println("Piyango Sayısı: "+piyangoSayi);

        System.out.println("Sayıyı Tahmin Edin");
        int tahmin= giris.nextInt();
        int tahminBirler=tahmin%10;
        int tahminOnlar=(tahmin-tahminBirler)/10;

        int piyangoSayiBirlerBas=piyangoSayi%10;
        int piyangoSayiOnlarBas=(piyangoSayi-piyangoSayiBirlerBas)/10;



        if (tahmin==piyangoSayi){
            System.out.println("Tebrikler Sayıyı Bildiniz 10000Tl Hesabınıza Geçecek");
        } else if (tahminBirler==piyangoSayiBirlerBas){
            System.out.println("Tebrikler Piyango Sayının 'Birler' Basamağını Bildin Hesabına 1000 Tl Geçecek");
        }else if (tahminOnlar==piyangoSayiOnlarBas){
            System.out.println("Tebrikler Piyango Sayının 'Onlar' Basamağını Bildin Hesabına 1000 Tl Geçecek");
        }else if (tahminBirler==piyangoSayiOnlarBas && tahminOnlar==piyangoSayiBirlerBas) {
            System.out.println("Tebrikler Piyango Sayının Rakamlarının Yer Değiştirilmiş Halini Bildin Hesabına 5000 Tl Geçecek");
        }
        else System.out.println("Sayıyı Bilemedin");


        System.out.println("Lütfen Sayı girin");
        int sayi= giris.nextInt();

        int a=1;
        int faktoriyel=1;
        for (a=1;a<=sayi;a++){
            faktoriyel*=a;
        }
        System.out.println(faktoriyel);
    }
}
