/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programtunjangan;

/**
 *
 * @author 'KoalaX'
 * NAMA     : Fiqri Akbar Pratama
 * KELAS    : PBO1/IF1
 * NIM      : 10118020
 * Deksripsi Program : Program ini berisi program untuk nemapilkan tunjangan
 * gaji pegawai dengan ketentuan yang sudah menikah atau belum
 */
public class GajiPokok {
    
    public double pokok;
    public String status;
    public double tunjangan;
    
    public double  hitungTunjangan(){
        tunjangan =(status.equals("Menikah"))? 0.35 * pokok:0;
        
        return tunjangan;
    }
    
    public double hitungTotal(){
        
        return pokok + tunjangan;   
        
        
    }
}
