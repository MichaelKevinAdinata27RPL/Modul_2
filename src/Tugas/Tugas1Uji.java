package Tugas;

import java.util.Scanner;

public class Tugas1Uji {

    public static void main(String[] args) {
        Tugas1 tugas = new Tugas1();
        Scanner masuk = new Scanner(System.in);
        boolean pass, add = true;
        int jmlPenumpang = 0, penmpng, max = 10, pwd;
        String jawab;
        double berat;

        System.out.println("Michael Kevin Adinata / XR6 / 30");
        System.out.println("");
        tugas.Bus(max);
        System.out.println("Maksimal jumlah penumpang : " + max);
        System.out.print("Masukkan password : ");
        pwd = masuk.nextInt();
        pass = tugas.setPassword(pwd);

        if (pass) {
            System.out.println("===Password Benar===");
            do {
                System.out.print("Masukkan jumlah penumpang yang akan ditambah : ");
                penmpng = masuk.nextInt();
                jmlPenumpang += penmpng;

                boolean tambah = tugas.setPenumpang(penmpng);
                if (tambah) {
                    System.out.print("Masukkan berat penumpang (Kg) : ");
                    berat = masuk.nextDouble();
                    tugas.setBeratPenumpang(berat);
                    System.out.println("Totat berat seluruh penumpang : " + tugas.getBeratPenumpang() + "Kg");
                    System.out.println("Ingin menambah penumpang?");
                    System.out.println("ya/tidak");
                    System.out.print("Jawab : ");
                    jawab = masuk.next();

                    if (jawab.equalsIgnoreCase("ya")) {
                        add = true;
                    } else {
                        add = false;
                    }

                }
            } while (add);
            System.out.println("Total berat penumpang sekarang : " + tugas.getBeratPenumpang() + "Kg");
            System.out.println("Total penumpang sekarang : " + tugas.getPenumpang());
            System.out.println("Rata - rata berat seluruh penumpang : " + tugas.getRataRata() + "Kg");
        }

    }

}
