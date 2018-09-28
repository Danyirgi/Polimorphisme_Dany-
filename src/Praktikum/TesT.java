/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum;

/**
 *
 * @author DANYAV
 */
public class TesT {
    public static int tambah(int a, int b){
        return a+b;
    }
    public static void main(String[] args) {
        Rect r1 = new Rect();
        Rect r2 = new Rect(1,2);
        Rect r3 = new Rect(6,9);
        System.out.println("<" +r1.isInside(2, 3)+"> is inside the union"+"");
        Rect r4 = r1.union(r2);
        System.out.println("r1 union r2 = " + r3.x1+ ", " + r3.x2 + ", "+r3.y1 +r3.y2);
        Rect r5 = r1.union(r3);
        System.out.println("r1 intersect r2 = " + r3.x1+ ", " + r3.x2 + ", "+r3.y1 +r3.y2);
    }
   
    
}
