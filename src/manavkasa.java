import java.util.Scanner;
public class manavkasa {

    public static void main(String[] args) {

        Scanner kong = new Scanner(System.in);

        double armut,elma,domates,muz,patlican;

        double armutFiyat = 2.14 , elmaFiyat = 3.67 , domatesFiyat = 1.11, muzFiyat = 0.95, patlicanFiyat = 5.0;

        double toplam;


        System.out.print("Alinan elmanin kilosunu girin:");
        elma = kong.nextDouble();
        System.out.print("Alinan armutun kilosunu girin:");
        armut = kong.nextDouble();
        System.out.print("Alinan domatesin kilosunu girin:");
        domates = kong.nextDouble();
        System.out.print("Alinan muzun kilosunu girin:");
        muz = kong.nextDouble();
        System.out.print("Alinan patlicanin kilosunu girin:");
        patlican = kong.nextDouble();

        toplam = (elmaFiyat * elma) + (armutFiyat * armut) + (muzFiyat * muz) + (patlicanFiyat * patlican) + (domatesFiyat * domates);

        System.out.println("toplam tutar" + toplam + "TL");


    }
}
