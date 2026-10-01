package aula_5_41_Desafio_sobrecarga_de_metodos;


public class NumeroUtil {

    static void decobrirMaiorNumero(int num1, int num2, int num3) {
        if (num1 > num2) {
            System.out.println("O numero 1 é maior");
        } else if (num1 < num3) {
            System.out.println("O numero 3 é maior");

        } else {
            System.out.println("O numero 2 é maior");
        }

    }

    static void decobrirMaiorNumero(int num1, int num2) {
        if (num1 > num2) {
            System.out.println("O numero 1 é maior");
        } else {
            System.out.println("O numero 2 é maior");

        }

    }
}
