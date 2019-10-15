/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programtunjangan;

import java.util.Scanner;

/**
 *
 * @author 'KoalaX'
 * NAMA     : Fiqri Akbar Pratama
 * KELAS    : PBO1/IF1
 * NIM      : 10118020
 * Deksripsi Program : Program ini berisi program untuk nemapilkan tunjangan
 * gaji pegawai dengan ketentuan yang sudah menikah atau belum
 */
public class ProgramTunjangan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        GajiPokok gaji = new GajiPokok();

        System.out.println("==========Program Tunjangan==========");
        System.out.print("Berapa gaji pokok anda perbulan : Rp.");
        gaji.pokok = scanner.nextDouble();
        System.out.print("Status Anda? (Menikah/Belum)\t: ");
        gaji.status = scanner.next();

        System.out.println("");
        System.out.println("========Hasil Perhitungan Gaji Anda========");
        System.out.println("Gaji Pokok\t: " + gaji.pokok);
        System.out.println("Tunjangan\t: " + gaji.hitungTunjangan());
        System.out.println("Total Gaji\t: " + gaji.hitungTotal());

        System.out.println("(Developed by : Fiqri Akbar Pratama)");
    }
    
}
