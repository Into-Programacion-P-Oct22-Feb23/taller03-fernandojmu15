/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio8;

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
        
        int var1 = 10;
        int var2 = 9;
        int var3 = 20;
        int var4 = 500;
        int var5 = 2;
        int var6 = 3;
        int var7 = 2;
        int var8 = 200;
        int var9 = 50;
        int var10 = 50;
        int var11 = 50;
        int var12 = 51;
        
        boolean valor = ((var1 * var2) + var3 - (var4/var5) + Math.pow(var6,var7) >= var8) || (var9 >= var10 - var11 + var12); 
        System.out.println(valor);
    }
    
}
