/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan;

/**
 *
 * @author DANYAV
 */
public class PembayaranGaji {
    public int hitungGaji(Pegawai peg){
        int uang = peg.gaji();
        if(peg instanceof Direktur)
            uang += ((Direktur)peg).tunjangan();
        if(peg instanceof staf)
            uang += ((staf)peg).bonus();
        return uang;
    }
    public static void main(String[] args) {
        PembayaranGaji pg= new PembayaranGaji();
        staf ali = new staf();
        Direktur Dany = new Direktur();
        System.out.println("Gaji yang dibayarkan untuk staf = "+pg.hitungGaji(ali));
        System.out.println("Gaji yang dibayarkan untuk Direktur = "+pg.hitungGaji(Dany));
    }
    
}
