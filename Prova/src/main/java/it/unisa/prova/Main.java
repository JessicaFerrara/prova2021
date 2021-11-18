/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unisa.prova;

/**
 *
 * @author jessi
 */
public class Main {
    public static void main(String args[]) {
        salute("Fisciano");
        System.out.println("Salve, mondo");
        salute("universe");
    }
    
    public static void salute(String whom){
        System.out.println("Hello, " + whom);
    }
}
