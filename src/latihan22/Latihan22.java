/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan22;

import java.util.Scanner;

/**
 *
 * @author lutfi
 * NAMA  : LUTFI RAMADHAN
 * NIM   : 10118908
 * KELAS : IF 11 KARYAWAN
 */
public class Latihan22 {

    /**
     */
    public static final float PHI = (float)3.14;
    
    public static void hitungLingkaran(float diameter){
        float jari, luas, keliling;
        keliling = (float)PHI*diameter;
        luas = (float) ((0.25)*PHI*diameter*diameter);
        System.out.println();
        jari = keliling/(2*PHI);
        System.out.println("===Hasil Perhitungan Lingkaran===");
        System.out.println("Jari-jari Lingkaran = "+jari+" cm");
        System.out.println("Luas Lingkaran = "+luas+" cm");
        System.out.println("Keliling Lingkaran = "+keliling+" cm");
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        float diameter = 0;
        System.out.println("======Perhitungan Lingkaran======");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nilai diameter lingkaran : ");
        if (scanner.hasNextInt()) {
            diameter = scanner.nextInt();
        }else{
            while (!scanner.hasNextInt()) {
                System.out.println("Nilai Diameter Tidak Sesuai\n");
                System.out.print("Masukkan nilai diameter lingkaran : ");
                scanner.next();
            }
            if (scanner.hasNextInt()) {
                diameter = scanner.nextInt();
            }
        }
        hitungLingkaran(diameter);
    }
    
}
