/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estruturarepetitivafor;

import java.util.Scanner;

/**
 *
 * @author valmi
 */
public class EstruturaRepetitivaFor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o numero para iniciar uma contagem: ");
        int i = sc.nextInt();
        
        System.out.println("Digite o numero onde deve terminar a contagem: ");
        int ate = sc.nextInt();
        
        int soma = 0;
        int sf = 0;
        
        for(i=1; i<ate; i++){
            soma = soma + i;
            System.out.print(i+ ", ");
        }
        System.out.println(ate+".");
        sf = soma + ate;
        System.out.println("O valor da soma dos numeros digitados é " +sf);
        System.out.println("Fim da contagem");
    }
    
}
