class Mahasiswa {
    String nim;
    String nama;
    int nilai;
    char grade;

    // Method untuk menentukan grade
    void hitungGrade() {
        if (nilai >= 80 && nilai <= 100) {
            grade = 'A';
        } else if (nilai >= 70) {
            grade = 'B';
        } else if (nilai >= 60) {
            grade = 'C';
        } else if (nilai >= 50) {
            grade = 'D';
        } else if (nilai >= 0) {
            grade = 'E';
        } else {
            grade = 'X'; // untuk nilai tidak valid
        }
    }

    // Method tampilkan data
    void tampilkanData() {
        System.out.println("NIM  : " + nim);
        System.out.println("Nama : " + nama);
        System.out.println("Nilai: " + nilai);
        System.out.println("Grade: " + grade);
        System.out.println("=======================================");
    }
}