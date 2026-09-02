package aula_5_25_Desafio_composicao_de_objetos_e_metodos;

public class Principal {
    public static void main(String[] args) {

        FolhaPagamento folha = new FolhaPagamento();
        double horaNormal = 10;
        double horaExtra = 10;
        double valorHoraNormal = 15.00;
        double valorHoraExtra = 50.00;

        double valorRecebido = folha.calcularSalario(horaNormal,horaExtra,valorHoraNormal,valorHoraExtra);

        System.out.printf("O total recebido foi: %.2f%n", valorRecebido);
    }
}
