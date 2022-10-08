public class Main {
    public static void main(String[] args) {

        // if bloğu
        int sayi1 = 266;
        int sayi2 = 25;
        int sayi3 = 26;
        int enBüyük = 26;

        if (enBüyük < sayi1) {
            enBüyük = sayi1;
        }
        if (enBüyük < sayi2) {
            enBüyük = sayi2;
        }
        if (enBüyük < sayi3) {
            enBüyük = sayi3;
        }

        System.out.println("En büyük = " + enBüyük);

        // switch
        char grade = 'A';

        switch (grade) {
            case 'A':
                System.out.println("Mükemmel : Geçtiniz");
                break;
            case 'B':
                System.out.println("Çok güzel : Geçtiniz");
                break;
            case 'C':
                System.out.println("İyi : Geçtiniz");
                break;
            case 'D':
                System.out.println("Fena değil : Geçtiniz");
                break;
            case 'F':
                System.out.println("Maalesef : Kaldınız");
                break;
            default:
                System.out.println("Geçersiz not girdiniz");
        }

        // for
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        System.out.println("Döngü Bitti");

        for (int i = 2; i < 10; i += 2) {
            System.out.println(i);
        }
        System.out.println("Döngü Bitti");

        // while
        int i = 2;
        while (i < 10) {
            System.out.println(i);
            i += 2;
        }

        System.out.println("While döngüsü bitti");

        // Do-While
        int j = 100;
        do {
            System.out.println(j);
            j +=2;
        }while(j < 10);
        System.out.println("Do-While döngüsü bitti");



    }
}
