/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LENOVO
 */
import java.util.Scanner;
public class Example1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz:");
        int sayi = input.nextInt();
        if (sayi % 2 == 0){
            System.out.println(sayi + "çift sayıdır.");
        }
        else{
            System.out.println(sayi + "tek sayıdır.");
        }
    }
    
}
