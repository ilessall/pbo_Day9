package com.asia.sistemperkuliahan.ui;

import java.util.Scanner;

public class TextUi {
    private static Scanner scanner = new Scanner(System.in);

    public void run() {
        while (true) {
            displayMainMenu();
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character
            switch (choice) {
                case 1:
                    handlePerkuliahanMenu();
                    break;
                case 2:
                    handleDosenMenu();
                    break;
                case 3:
                    handleStafMenu();
                    break;
                case 4:
                    handleMahasiswaMenu();
                    break;
                case 5:
                    System.out.println("Keluar dari program.");
                    return;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
    }

    private static void displayMainMenu() {
        System.out.println("===================================");
        System.out.println(" SISTEM INFORMASI AKADEMIK");
        System.out.println("===================================");
        System.out.println("Pilih menu:");

        System.out.println("1. Data Perkuliahan");
        System.out.println("2. Data Dosen");
        System.out.println("3. Data Staf");
        System.out.println("4. Data Mahasiswa");
        System.out.println("5. Keluar");
        System.out.print("Masukkan pilihan: ");
    }

    private void handlePerkuliahanMenu() {
        while (true) {
            System.out.println("\n===================================");
            System.out.println(" SISTEM INFORMASI AKADEMIK");
            System.out.println("===================================");
            System.out.println("Pilih menu:");
            System.out.println("1. List Perkuliahan");
            System.out.println("2. Tambah Perkuliahan");
            System.out.println("3. Edit Perkuliahan");
            System.out.println("4. Kembali ke Menu Utama");
            System.out.print("Masukkan pilihan: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character
            switch (choice) {
                case 1:
                    // Implement logic for displaying Perkuliahan list
                    break;
                case 2:
                    // Implement logic for adding Perkuliahan
                    break;
                case 3:
                    // Implement logic for editing Perkuliahan
                    break;
                case 4:
                    return; // Kembali ke menu utama
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
    }

    private static void handleDosenMenu() {
        while (true) {
            System.out.println("\n===================================");
            System.out.println(" SISTEM INFORMASI AKADEMIK");
            System.out.println("===================================");
            System.out.println("Pilih menu:");
            System.out.println("1. List Dosen");
            System.out.println("2. Tambah Dosen");
            System.out.println("3. Kembali ke Menu Utama");
            System.out.print("Masukkan pilihan: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character
            switch (choice) {
                case 1:
                    // Implement logic for displaying Dosen list
                    break;
                case 2:
                    // Implement logic for adding Dosen
                    break;
                case 3:
                    return; // Kembali ke menu utama
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
    }

    private static void handleStafMenu() {
        while (true) {
            System.out.println("\n===================================");
            System.out.println(" SISTEM INFORMASI AKADEMIK");
            System.out.println("===================================");
            System.out.println("Pilih menu:");
            System.out.println("1. List Staf");
            System.out.println("2. Tambah Staf");
            System.out.println("3. Kembali ke Menu Utama");
            System.out.print("Masukkan pilihan: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character
            switch (choice) {
                case 1:
                    // Implement logic for displaying Staf list
                    break;
                case 2:
                    // Implement logic for adding Staf
                    break;
                case 3:
                    return; // Kembali ke menu utama
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
    }

    private static void handleMahasiswaMenu() {
        while (true) {
            System.out.println("\n===================================");
            System.out.println(" SISTEM INFORMASI AKADEMIK");
            System.out.println("===================================");
            System.out.println("Pilih menu:");
            System.out.println("1. List Mahasiswa");
            System.out.println("2. Tambah Mahasiswa");
            System.out.println("3. Kembali ke Menu Utama");
            System.out.print("Masukkan pilihan: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character
            switch (choice) {
                case 1:
                    // Implement logic for displaying Mahasiswa list
                    break;
                case 2:
                    // Implement logic for adding Mahasiswa
                    break;
                case 3:
                    return; // Kembali ke menu utama
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
    }
}
