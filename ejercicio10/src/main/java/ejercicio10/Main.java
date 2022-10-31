/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio10;

/**
 *
 * @author DELL
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int var1 = 25;
        int var2 = 10;
        int var3 = 100;
        int var4 = 10;
        int var5 = 5;
        int var6 = 2;
        
        boolean valor = (Math.sqrt(var1) *  var2 >= var3);
        boolean valor2 = true;
        boolean valor3 = false;
        boolean valor4 = ((var4 / var5) >= var6);
        
        System.out.println(valor && valor2 || valor3 || valor4);
    }
    
}
