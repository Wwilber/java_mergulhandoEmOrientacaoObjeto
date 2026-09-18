package aula_5_25_Desafio_composicao_de_objetos_e_metodos;

public class Principal {
    public static void main(String[] args) {
        Funcionario f = new Funcionario();
        ContratoTrabalho contratoValor = new ContratoTrabalho();
        contratoValor.valorDaHorNormal = 15.00;
        contratoValor.valordaHoraExtra = 30.00;

        Holerite holerite = new Holerite();
        holerite.funcionario.nome = "Wilber Ribeiro";
        f.quantidadeFilhos = 0;

        double horaNormal = 10.00;
        double horaExtra = 10.00;
        double valorRecebido = holerite.calcularValorTotal();

        ContratoTrabalho contrato, double hsNormalTrabalhada,
        double hsExtraTrabalhada, Funcionario funcionario


        ContratoTrabalho contrato, hsNormalTrabalhada,
        hsExtraTrabalhada, funcionario

        System.out.printf("O total recebido foi: %.2f%n", valorRecebido);

// 1)
//        ContratoTrabalho contratoValor = new ContratoTrabalho();
//        contratoValor.ValorDaHorNormal = 15.00;
//        contratoValor.ValordaHoraExtra = 30.00;
//        contratoValor.funcionario.quantidadeFilhos = 0;
//        double horaNormal = 10.00;
//        double horaExtra = 10.00;
//        FolhaPagamento folha = new FolhaPagamento();
//        double valorRecebido = folha.calcularSalario(contratoValor, horaNormal, horaExtra);
//
//        System.out.printf("O total recebido foi: %.2f%n", valorRecebido);
    }
}
