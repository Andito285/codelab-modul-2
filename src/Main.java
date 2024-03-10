import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Tambah Data Mahasiswa");
            System.out.println("2. Tampilkan Data Mahasiswa");
            System.out.println("3. Keluar");
            System.out.print("Pilihan Anda: ");
            int pilihmenu = input.nextInt();

            switch (pilihmenu) {
                case 1:
                    System.out.print("Masukkan nama Mahasiswa\t\t: ");
                    input.nextLine();
                    String nama = input.nextLine();
                    System.out.print("Masukkan NIM Mahasiswa\t\t: ");
                    String nim = input.nextLine();
                    while (nim.length() != 15) {
                        System.out.println("NIM Harus 15 Digit!!!");
                        System.out.print("Masukkan NIM Mahasiswa\t\t: ");
                        nim = input.nextLine();
                    }
                    System.out.print("Masukkan jurusan Mahasiwa\t: ");
                    String jurusan = input.nextLine();
                    Mahasiswa.addDaftarMahasiswa(nama, nim, jurusan);
                    break;
                case 2:
                    Mahasiswa.tampilDataMahasiswa();
                    break;
                case 3:
                    System.out.println("Adios");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Tidak Valid Coba Lagi.");
            }
        }
    }
}
