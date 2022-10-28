/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio7;

/**
 *
 * @author UTPL
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int var1 = 81;
        int var2 = 9;
        int var3 = 3;
        int var4 = 9;
        int var5 = 10;
        int var6 = 1;
        int var7 = 100;
        int var8 = 25;
        int var9 = 100;
        
        boolean valor = (((Math.sqrt(var1) + var2) / var3) == var4) || (var5 > var6) && (var7 / var8 > Math.sqrt(100)); 
        System.out.println(valor);
    }
    
}
