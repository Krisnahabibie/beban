/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package beban;

import java.util.Scanner;

/**
 *
 * @author krisn
 */ 
public class Beban {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int  gg;
         int jj =0;
        Scanner input = new Scanner(System.in);
        
        System.out.println(" masukkan angka");
        gg = input.nextInt();
         
        for(int x=1; x<=gg; x++){
            jj += x;
            System.out.println("jumlah "+jj);
            
        }
    }
    
}
