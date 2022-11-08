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
public class Example2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen birinci sayıyı giriniz:");
        int sayi1 = input.nextInt();
        System.out.println("Lütfen ikinci sayıyı giriniz:");
        int sayi2 = input.nextInt();
        System.out.println("Lütfen üçüncü sayıyı giriniz:");
        int sayi3 = input.nextInt();
        
        if (sayi1 > sayi2 && sayi1>sayi3){
            System.out.println(sayi1 + "en büyüktür");
        }
        else if (sayi2 > sayi1 && sayi2>sayi3){
            System.out.println(sayi2 + "en büyüktür");
        }
        else if (sayi3>sayi1 && sayi3>sayi2){
            System.out.println(sayi3 + "en büyüktür");
        }
        else {
            System.out.println("Sayıların birbirine üstünlüğü yoktur");
        }
    }
    
    
    
}
