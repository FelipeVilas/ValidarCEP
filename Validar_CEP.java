
package com.mycompany.validar_cep;

import java.util.Scanner;


public class Validar_CEP {

   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o CEP:");
        String cep = sc.nextLine();

        if (validarCEP(cep)) {
            System.out.println("O CEP é válido.");
        } else {
            System.out.println("O CEP é inválido.");
        }
    }


    public static boolean validarCEP(String cep) {
       return cep.length() == 8;
    }
}
