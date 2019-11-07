/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo.ulang.pkg10114504.latihan46.tandanyakamu;

import java.util.Scanner;

/**
 *
 * @author
 * NAMA      : Sandy Akbar
 * KELAS     : PBO-ULANG
 * NIM       : 10114504
 * Deskripsi : Menampilkan umur dan keterangan sesuai umur
 */
public class PBOULANG10114504Latihan46TandanyaKamu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Age age = new Age(2019);

        Scanner sca = new Scanner(System.in);
        System.out.print("Masukkan Tahun lahir anda : ");
        age.setYearBirth(sca.nextInt());

        System.out.println("======Hasil Perhiyungan Umur======");
        System.out.println("Tahun Lahir Anda : " + age.getYearBirth(0));
        System.out.println("Hari ini Tahun : " + age.getYearNow());
        System.out.println("Umur kamu sampai hari ini adalah "
                + age.hitungUmur() + " tahun");
        System.out.println("Tandanya Kamu : " + age.tandanyaKamu(age.hitungUmur()));
    }
    }
    

