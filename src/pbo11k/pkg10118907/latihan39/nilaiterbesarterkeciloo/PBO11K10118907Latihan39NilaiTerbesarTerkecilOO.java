/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo11k.pkg10118907.latihan39.nilaiterbesarterkeciloo;

import java.util.Scanner;

/**
 *
 * @author programmer
 */
public class PBO11K10118907Latihan39NilaiTerbesarTerkecilOO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int byk;
        System.out.print("Masukkan nama petugas : ");
        Scanner scanner = new Scanner(System.in);
        String nama = scanner.next();
        
        System.out.print("Masukkan banyaknya nilai mahasiswa : ");
        Scanner scanner2 = new Scanner(System.in);
        String nilai = scanner2.next();
        byk = Integer.parseInt(nilai);
        
        Nilai n = new Nilai();
        n.setbykAndNama(byk, nama);
        n.hitungNilai();
    }
    
}
