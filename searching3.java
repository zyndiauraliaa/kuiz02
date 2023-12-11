
package searching;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class searching3 {
    private static Scanner scanner = new Scanner(System.in);
    private static List<String> menuItems = new ArrayList<>();
    private static List<Integer> menuPrices = new ArrayList<>();
    private static List<Integer> salesQuantities = new ArrayList<>();
    private static int loyaltyPoints = 0;

    public static void main(String[] args) {
        Collections.addAll(menuItems, "Mie Ayam", "Bakso", "Soto", "Nasi Pecel", "Lumpia Basah", "Seafood");
        Collections.addAll(menuPrices, 20000, 25000, 22000, 23000, 24000, 30000);
        for (int i = 0; i < menuItems.size(); i++) {
            salesQuantities.add(0);
        }
        while (true) {
            System.out.println("Pilih:");
            System.out.println("1. Iya");
            System.out.println("2. Tidak");
            System.out.print("Masukkan pilihan Anda: ");
            int pilihan = scanner.nextInt();
            scanner.nextLine();
            switch (pilihan) {
                case 1:
                    modeCari();
                    break;
                case 2:
                    System.exit(0);
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
    }

    private static void modeCari() {
        tampilkanMenu();
        prosesTransaksi();
    }

    private static void prosesTransaksi() {
        String pilihanMenu;
        int jumlah, totalBiaya = 0;
        System.out.println("Silakan masukkan menu yang dibeli atau ketik 'selesai' untuk mengakhiri:");
        while (true) {
            System.out.print("Menu: ");
            pilihanMenu = scanner.nextLine();
            if (pilihanMenu.equalsIgnoreCase("selesai")) {
                break;
            }
            int indeksMenu = cariMenu(menuItems, pilihanMenu);
            if (indeksMenu != -1) {
                System.out.println("ketemu");
                System.out.print("Jumlah: ");
                jumlah = scanner.nextInt();
                scanner.nextLine();
                int harga = menuPrices.get(indeksMenu);
                totalBiaya += harga * jumlah;
                salesQuantities.set(indeksMenu, salesQuantities.get(indeksMenu) + jumlah);
            } else {
                System.out.println("Menu tidak ditemukan.");
            }
        }
        System.out.println("Total biaya : Rp " + totalBiaya);
    }

    private static void tampilkanMenu() {
        for (int i = 0; i < menuItems.size(); i++) {
            System.out.println((i + 1) + ". " + menuItems.get(i) + " - Rp" + menuPrices.get(i));
        }
    }


    private static int cariMenu(List<String> data, String kata) {
        for (int i = 0; i < data.size(); i++) {
            if (data.get(i).equalsIgnoreCase(kata)) {
                return i;
            }
        }
        return -1;
    }



    }

 

