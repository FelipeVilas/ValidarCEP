
package com.mycompany.validar_cep;

import java.util.Scanner;


public class Validar_CEP {

   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o CEP: ");
        String cep = sc.nextLine();

        if (validarCEP(cep)) {
            System.out.println("O CEP é válido.");
        } else {
            System.out.println("O CEP é inválido.");
        }

        
    }

    // Função para validar um CEP
    public static boolean validarCEP(String cep) {
       // Verifica se o CEP possui 8 dígitos
       return cep.length() == 8;
    }}