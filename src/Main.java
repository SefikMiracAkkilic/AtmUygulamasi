import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Sefik Akkılıç : TR1234 000 551 931 355 6371 25 41
        // Sefik kullanıcısının adı ve sifresi : sefik21 --- 2005

        // Mehmet Akkılıc : TR1285 0720 217 562 854 7535 81 46
        // Mehmet kullanıcısının adı ve sifresi : mehmet34 --- 1997

        /*
         * Bakiye görüntüleme için ---> 1 Para çekmek için ---> 2 Farklı hesaba para
         * yatırmak için ---> 3 Uygulamadan çıkmak için ---> q
         */

        String islemSecenekleri = "Bakiye Goruntuleme  ---> 1 \n" + "Para cekmek ---> 2 \n"
                + "Farkli hesaba para yatirmak icin ---> 3\n" + "Cikis Yapmak icin q' tusuna basınız.";

        Scanner scanner = new Scanner(System.in);

        double SefikBakiye = 5500;
        String SefikIBAN = "TR1234 000 551 931 355 6371 25 41";
        String SefikKullanici = "sefik21";
        String SefikSifre = "2005";

        double MehmetBakiye = 2300;
        String MehmetIBAN = "TR1285 0720 217 562 854 7535 81 46";
        String MehmetKullanici = "mehmet34";
        String MehmetSifre = "1997";

        System.out.println("ATM ' ye HOsGELDINIZ. ");
        System.out.println("Lutfen bilgilerinizi giriniz");

        System.out.print("Kullanici adi : ");
        String kullaniciAdi = scanner.nextLine();

        System.out.print("Sifre : ");
        String sifre = scanner.nextLine();

        if (kullaniciAdi.equals("sefik21") && sifre.equals("2005")) {
            System.out.println("Sefik Akkilic Hesabina Giris Yapildi...");
            System.out.println(islemSecenekleri);
            System.out.print("Lutfen bir secim yapiniz :");
            String secim = scanner.nextLine();

            switch (secim) {
                case "1":
                    System.out.println("Bakiyeniz : " + SefikBakiye);
                    break;

                case "2":
                    System.out.print("Cekmek istediginiz tutari giriniz : ");
                    int cekilecekTutar = scanner.nextInt();
                    if (SefikBakiye >= cekilecekTutar) {
                        SefikBakiye -= cekilecekTutar;
                        System.out.println("Kalan Tutar : " + SefikBakiye);
                    } else {
                        System.out.println("Bakiyenizden fazla para cekemezsiniz...");
                    }
                    break;

                case "3":
                    System.out.print("Ne kadar yatırmak istiyorsunuz : ");
                    int yatirilacakTutar = scanner.nextInt();
                    if (yatirilacakTutar <= SefikBakiye) {
                        System.out.print("Iban giriniz : ");
                        scanner.nextLine();
                        String yatirilacakIBAN = scanner.nextLine();
                        if (yatirilacakIBAN.equals(MehmetIBAN)) {
                            System.out.println("Para Mehmet Akkilic adli kisiye yatiriliyor");
                            SefikBakiye -= yatirilacakTutar;
                            MehmetBakiye += yatirilacakTutar;
                            System.out.println("Bakiyeniz : " + SefikBakiye);
                            System.out.println("Mehmetin Bakiye : " + MehmetBakiye);
                        }

                    }

            }

        } else if (kullaniciAdi.equals("mehmet34") && sifre.equals("1997")) {
            System.out.println("Mehmet Akkilic Hesabina Giris Yapildi...");
            System.out.println(islemSecenekleri);
            System.out.println("Lutfen bir secim yapiniz");
            String secim = scanner.nextLine();
            switch (secim) {
                case "1":
                    System.out.println("Bakiyeniz : " + MehmetBakiye);
                    break;

                case "2":
                    System.out.print("Cekmek istediginiz tutari giriniz : ");
                    int cekilecekTutar = scanner.nextInt();
                    if (MehmetBakiye >= cekilecekTutar) {
                        MehmetBakiye -= cekilecekTutar;
                        System.out.println("Kalan Tutar : " + MehmetBakiye);
                    } else {
                        System.out.println("Bakiyenizden fazla para cekemezsiniz...");
                    }
                    break;

                case "3":
                    System.out.print("Ne kadar yatırmak istiyorsunuz : ");
                    int yatirilacakTutar = scanner.nextInt();
                    if (yatirilacakTutar <= MehmetBakiye) {
                        System.out.print("Iban giriniz : ");
                        scanner.nextLine();
                        String yatirilacakIBAN = scanner.nextLine();
                        if (yatirilacakIBAN.equals(SefikIBAN)) {
                            System.out.println("Para Sefik Akkilic adli kisiye yatiriliyor");
                            MehmetBakiye -= yatirilacakTutar;
                            SefikBakiye += yatirilacakTutar;
                            System.out.println("Bakiyeniz : " + MehmetBakiye);
                            System.out.println("Mehmetin Bakiye : " + SefikBakiye);
                        }

                    }

            }

        } else {
            System.out.println("Kullanici adi veya sifreniz yanlis ! ");
        }

    }
}