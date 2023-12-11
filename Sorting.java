/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bubbleshortno1;
import java.util.ArrayList;
import java.util.Scanner;

class Barang {
    String nama;
    double harga;

    public Barang(String nama, double harga) {
        this.nama = nama;
        this.harga = harga;
    }
    public String toString() {
        return "Barang{" +
                "nama='" + nama + '\'' +
                ", harga=" + harga +
                '}';
    }
}

public class BubbleShortno1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Meminta jumlah barang yang akan diinput
        System.out.print("Masukkan jumlah barang: ");
        int jumlahBarang = scanner.nextInt();

        // Membuat ArrayList untuk menyimpan barang
        ArrayList<Barang> daftarBarang = new ArrayList<>();

        // Input data barang
        for (int i = 0; i < jumlahBarang; i++) {
            System.out.println("\nMasukkan informasi barang ke-" + (i + 1));
            System.out.print("Nama Barang: ");
            String nama = scanner.next();
            System.out.print("Harga Barang: ");
            double harga = scanner.nextDouble();

            // Menambahkan barang ke dalam ArrayList
            daftarBarang.add(new Barang(nama, harga));
        }

        // Menampilkan daftar barang sebelum diurutkan
        System.out.println("\nDaftar barang sebelum diurutkan:");
        for (Barang barang : daftarBarang) {
            System.out.println(barang);
        }

        // Meminta pengguna untuk memilih kriteria pengurutan
        System.out.println("\nPilih kriteria pengurutan:");
        System.out.println("1. Harga Tertinggi");
        System.out.println("2. Harga Terendah");
        System.out.println("3. Abjad (Nama Barang)");
        int choice = scanner.nextInt();

        // Mengurutkan berdasarkan pilihan pengguna
        switch (choice) {
            case 1:
                bubbleSortByHargaTertinggi(daftarBarang);
                break;
            case 2:
                bubbleSortByHargaTerendah(daftarBarang);
                break;
            case 3:
                bubbleSortByAbjad(daftarBarang);
                break;
            default:
                System.out.println("Pilihan tidak valid.");
                break;
        }
        // Menampilkan daftar barang setelah diurutkan
        System.out.println("\nDaftar barang setelah diurutkan:");
        for (Barang barang : daftarBarang) {
            System.out.println(barang);
        }

        // Menutup Scanner setelah penggunaan selesai
        scanner.close();
    }

    private static void bubbleSortByHargaTertinggi(ArrayList<Barang> arr) {
        arr.sort((b1, b2) -> Double.compare(b2.harga, b1.harga));
    }

    private static void bubbleSortByHargaTerendah(ArrayList<Barang> arr) {
        arr.sort((b1, b2) -> Double.compare(b1.harga, b2.harga));
    }

    private static void bubbleSortByAbjad(ArrayList<Barang> arr) {
        arr.sort((b1, b2) -> b1.nama.compareTo(b2.nama));
    }
}
