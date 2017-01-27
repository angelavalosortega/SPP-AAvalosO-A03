/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp.aavaloso.a03;
import java.util.Scanner;
/**
 *
 * @author Angel Avalos
 */
public class SPPAAvalosOA03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    double e,t,r;
    Scanner kb = new Scanner(System.in);
        System.out.println("Elevar un numero a la potencia deseada");
        System.out.println("Introdusca el primer numero");  
        e=kb.nextDouble();
        System.out.println("Introdusca la potencia a la cual se desea elevar el numero");
        t=kb.nextDouble();
        r=Math.pow(e,t);
        System.out.println("El resultado de la operacion es= "+r);
        
// TODO code application logic here
    }
    
}
