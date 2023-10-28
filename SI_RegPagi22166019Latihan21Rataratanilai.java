/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package si_regpagi.pkg22166019.latihan21.rataratanilai;

import java.util.Scanner;

/**
 *
 * @author ASUS
 * NAMA                 : Rachma Fadilah Kurnianto
 * KELAS                : PBO1
 * NIM                  : 222166019
 * Deskripsi Program    : menghitung rata-rata nilai mahasiswa.
 */
public class SI_RegPagi22166019Latihan21Rataratanilai {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jumlahMahasiswa;
        float totalNilai = 0, nilai, rataRata;

        System.out.print("Masukkan jumlah mahasiswa: ");
        jumlahMahasiswa = input.nextInt();

        for (int i = 1; i <= jumlahMahasiswa; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + i + ": ");
            nilai = input.nextFloat();
            totalNilai += nilai;
        }

        System.out.println();
        rataRata = totalNilai / jumlahMahasiswa;
        System.out.println("Maka, Rata-rata nilainya adalah " + rataRata);
    }
    }
    
