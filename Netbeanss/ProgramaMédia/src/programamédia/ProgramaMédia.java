/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programamédia;

import java.util.Scanner;

/**
 *
 * @author Gtalles
 */
public class ProgramaMédia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.print("Primeira nota: ");
        float n1 = input.nextFloat();
        System.out.print("Segunda nota: ");
        float n2 = input.nextFloat();
        float m = (n1+n2)/2;
        System.out.println("Sua média foi " + m);
        if(m>9){
            System.out.println("Parabéns, pequeno gafanhoto!");
        }
    }
    
}
