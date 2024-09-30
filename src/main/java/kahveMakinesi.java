import java.util.Scanner;

public class kahveMakinesi {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        while (true) {  // Tüm işlemler en baştan başlatmak için sonsuz bir döngü
            // Değişkenler
            String hangiKahve = "";
            String sut = "";
            String seker = "";
            String boyut = "";
            int hataSayisi = 0;  // Hatalı girişlerin sayacını takip etmek için

            // Kahve Seçimi
            while (true) {
                System.out.println("Hangi Kahveyi İstersiniz?");
                System.out.println("1. Türk Kahvesi");
                System.out.println("2. Filtre Kahve");
                System.out.println("3. Espresso");

                hangiKahve = sc.nextLine().toLowerCase();

                if (hangiKahve.equals("türk kahvesi") || hangiKahve.equals("filtre kahve") || hangiKahve.equals("espresso")) {
                    System.out.println(hangiKahve + " hazırlanıyor.");
                    break;
                } else {
                    hataSayisi++;
                    System.out.println("Hatalı tuşlama yaptınız.");
                    if (hataSayisi >= 4) {
                        System.out.println("Çok fazla hatalı giriş yaptınız, başa dönülüyor.");
                        continue;  // Ana döngünün başına dön
                    }
                }
            }

            // Süt Eklenmesi
            hataSayisi = 0;  // Hata sayacını sıfırlıyoruz
            while (true) {
                System.out.println("Süt eklememizi ister misiniz? (Evet veya Hayır olarak cevaplayınız):");
                sut = sc.nextLine().toLowerCase();

                if (sut.equals("evet")) {
                    System.out.println("Süt ekleniyor...");
                    break;
                } else if (sut.equals("hayır")) {
                    System.out.println("Süt eklenmiyor.");
                    break;
                } else {
                    hataSayisi++;
                    System.out.println("Hatalı giriş yaptınız.");
                    if (hataSayisi >= 2) {
                        System.out.println("Çok fazla hatalı giriş yaptınız, başa dönülüyor.");
                        continue;  // Ana döngünün başına dön
                    }
                }
            }

            // Şeker Eklenmesi
            hataSayisi = 0;  // Hata sayacını sıfırlıyoruz
            while (true) {
                System.out.println("Şeker ister misiniz? (Evet veya hayır cevabını veriniz):");
                seker = sc.nextLine().toLowerCase();

                if (seker.equals("evet")) {
                    System.out.println("Kaç şeker olsun?");
                    int kacSeker = sc.nextInt();
                    sc.nextLine(); // Dummy input
                    System.out.println(kacSeker + " şeker ekleniyor.");
                    break;
                } else if (seker.equals("hayır")) {
                    System.out.println("Şeker eklenmiyor.");
                    break;
                } else {
                    hataSayisi++;
                    System.out.println("Hatalı giriş yaptınız.");
                    if (hataSayisi >= 2) {
                        System.out.println("Çok fazla hatalı giriş yaptınız, başa dönülüyor.");
                        continue;  // Ana döngünün başına dön
                    }
                }
            }

            // Kahve Boyutu
            hataSayisi = 0;  // Hata sayacını sıfırlıyoruz
            while (true) {
                System.out.println("Hangi boyutta olsun? (Büyük boy - orta boy - küçük boy olarak giriniz):");
                boyut = sc.nextLine().toLowerCase();

                if (boyut.equals("büyük boy") || boyut.equals("orta boy") || boyut.equals("küçük boy")) {
                    System.out.println("Kahveniz " + boyut + " hazırlanıyor.");
                    break;
                } else {
                    hataSayisi++;
                    System.out.println("Hatalı tuşlama yaptınız.");
                    if (hataSayisi >= 2) {
                        System.out.println("Çok fazla hatalı giriş yaptınız, başa dönülüyor.");
                        continue;  // Ana döngünün başına dön
                    }
                }
            }

            // Sonuç
            System.out.println(hangiKahve + " " + boyut + " hazırdır. Afiyet olsun!!!");

            // Programdan çıkış
            break;  // Başarılı tamamlandıktan sonra döngüden çık
        }

        sc.close();
    }

}

