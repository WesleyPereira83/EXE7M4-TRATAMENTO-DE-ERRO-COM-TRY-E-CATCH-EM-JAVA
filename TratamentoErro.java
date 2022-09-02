
// Crie uma situação em que ocorra uma exceção dentro de um código. 
// Utilize try/catch para realizar a captura e tratamento dessa exceção. 

import java.util.Scanner;

public class TratamentoErro {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("");
        System.out.println("Favor, digite um número inteiro; caso o número seja o zero ocorrerá um erro:");
     try{
          int n = ler.nextInt();
          System.out.println(30/n); //aqui o valor poderá ser alterado
     } catch(Exception erro){
          System.out.println("Ocorreu um erro => insira um número inteiro e diferente de zero. ");
     }
  }
}   

