/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desalocacaomemoria;

import java.util.Scanner;

/**
 *
 * @author valmi
 */
public class DesalocacaoMemoria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("");
        int n = sc.nextInt();
        
        double[] vect =new double[n];
        for(int i = 0; i<n; i++){
            vect[i] = sc.nextDouble();
        }
        
        
        sc.close();
    }
    
}
