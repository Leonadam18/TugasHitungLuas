
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SMK TELKOM 05
 */
public class menghitungLuasPersegi {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Masukkan Nilai Sisi: ");
        int sisi=input.nextInt();
        int luas=sisi*sisi;
        System.out.println("Luas Persegi dengan "+"sisi "+sisi+" adalah "+luas);
    }
}