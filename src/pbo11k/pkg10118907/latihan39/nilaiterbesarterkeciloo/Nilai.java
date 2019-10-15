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
public class Nilai {
    private int byk;
    private String nama;
    
    public void setbykAndNama(int byk, String nama) {
        this.byk = byk;
        this.nama = nama;
    }
    
    public void hitungNilai() {
        int high = 0, low = 0, max = 0, min = 0;
        Integer[] nilai2 = new Integer[byk];
            
        for(int i = 0;i<byk; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-"+(i+1)+" : ");
            Scanner scanner = new Scanner(System.in);
            String nilai3 = scanner.next();
            
            nilai2[i] = Integer.parseInt(nilai3);
            
            max = Math.max(nilai2[i], max);
            if(i == 0) 
            min = Math.min(nilai2[i], nilai2[i]);
            else
            min = Math.min(nilai2[i], min);
                
        }
        System.out.println();
        for(int i = 0;i<byk; i++) {
            System.out.println("Nilai mahasiswa ke-"+(i+1)+" = "+nilai2[i]);
        }
        
        System.out.println("\nNilai terbesar adalah "+max);
        System.out.println("Nilai terkecil adalah "+min);
        System.out.println("\nPetugas : "+nama);
    }
}
