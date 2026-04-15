import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int jumlah = 4;
        Mahasiswa[] mhs = new Mahasiswa[jumlah];

        int totalNilai = 0;
        int lulus = 0, tidakLulus = 0;
        int A=0, B=0, C=0, D=0, E=0;

        String namaTidakLulus = "";
        String namaA = "", namaB = "", namaD = "";

        for (int i = 0; i < jumlah; i++) {
            mhs[i] = new Mahasiswa();

            System.out.println("Data Mahasiswa ke-" + (i+1));
            System.out.print("NIM   : ");
            mhs[i].nim = input.nextLine();

            System.out.print("Nama  : ");
            mhs[i].nama = input.nextLine();

            System.out.print("Nilai : ");
            mhs[i].nilai = input.nextInt();
            input.nextLine();

            // Validasi nilai
            if (mhs[i].nilai < 0 || mhs[i].nilai > 100) {
                System.out.println("Input nilai anda salah!");
                i--; // ulang input
                continue;
            }

            mhs[i].hitungGrade();

            totalNilai += mhs[i].nilai;

            // Hitung kategori
            switch (mhs[i].grade) {
                case 'A':
                    A++;
                    namaA += mhs[i].nama + ", ";
                    lulus++;
                    break;
                case 'B':
                    B++;
                    namaB += mhs[i].nama + ", ";
                    lulus++;
                    break;
                case 'C':
                    C++;
                    lulus++;
                    break;
                case 'D':
                    D++;
                    namaD += mhs[i].nama + ", ";
                    tidakLulus++;
                    break;
                case 'E':
                    E++;
                    namaTidakLulus += mhs[i].nama + ", ";
                    tidakLulus++;
                    break;
            }
        }

        System.out.println("\n===== OUTPUT =====");

        for (int i = 0; i < jumlah; i++) {
            mhs[i].tampilkanData();
        }

        double rata = (double) totalNilai / jumlah;

        System.out.println("Jumlah Mahasiswa : " + jumlah);
        System.out.println("Jumlah Mahasiswa yg Lulus : " + lulus);
        System.out.println("Jumlah Mahasiswa yg Tidak Lulus : " + tidakLulus + " yaitu " + namaTidakLulus);
        System.out.println("Jumlah Mahasiswa dengan Nilai A = " + A + " yaitu " + namaA);
        System.out.println("Jumlah Mahasiswa dengan Nilai B = " + B + " yaitu " + namaB);
        System.out.println("Jumlah Mahasiswa dengan Nilai D = " + D + " yaitu " + namaD);
        System.out.println("Rata-rata nilai mahasiswa adalah : " + rata);
    }
}