/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum4soal;

/**
 *
 * @author hp
 */
public class Main {
    public static void main(String[] args) {
        // Membuat objek Pekerja
        Pekerja pekerja = new Pekerja("Muhsu", 30, "Programmer", 5000000);

        // Tampilkan informasi pekerja
        System.out.println("Data Awal - " + pekerja.toString());

        // Ubah nama pekerja menggunakan metode setter
        pekerja.setNama("Muhammad Surya");

        // Tampilkan ulang informasi pekerja
        System.out.println("Data Setelah Nama Pekerja Diubah - " + pekerja.toString());
    }
}
