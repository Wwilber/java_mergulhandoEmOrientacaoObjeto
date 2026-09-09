package aula_5_25_Desafio_composicao_de_objetos_e_metodos;

public class Principal {
    public static void main(String[] args) {

        ContratoTrabalho contratoValor = new ContratoTrabalho();
        contratoValor.ValorDaHorNormal = 15.00;
        contratoValor.ValordaHoraExtra = 30.00;
        contratoValor.funcionario.quantidadeFilhos = 0;
        double horaNormal = 10.00;
        double horaExtra = 10.00;
        FolhaPagamento folha = new FolhaPagamento();
        double valorRecebido = folha.calcularSalario(contratoValor, horaNormal, horaExtra);

        System.out.printf("O total recebido foi: %.2f%n", valorRecebido);
    }
}
