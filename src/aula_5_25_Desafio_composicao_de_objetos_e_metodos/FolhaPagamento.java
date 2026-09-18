package aula_5_25_Desafio_composicao_de_objetos_e_metodos;

public class FolhaPagamento {

    void calcularSalario() {
        Holerite holerite = new Holerite();
        System.out.printf("Valor total das horas normais %.2f", holerite.valorTotalHorasNormais);
        System.out.printf("Valor total das horas extras %.2f", holerite.valorTotalHorasExtras);
        System.out.printf("Valor total das horas adicional filhos %.2f", holerite.valorAdidionalFilhos);
    }


}

// 3)
//double calcularSalario(ContratoTrabalho contrato, double hsNormalTrabalhada,
//                       double hsExtraTrabalhada, Funcionario funcionario) {
//    double totalHsNormal = hsNormalTrabalhada * contrato.ValorDaHorNormal;
//    double totalHsExtra = hsExtraTrabalhada * contrato.ValordaHoraExtra;
//    double horaGeral = totalHsNormal + totalHsExtra;
//
//    if (funcionario.temFilhos()) {
//        double adicional = horaGeral * 0.10;
//        return adicional + horaGeral;
//    } else {
//        return horaGeral;
//    }

//2)
//    double calcularSalario(ContratoTrabalho contrato, double hsNormalTrabalhada,
//                           double hsExtraTrabalhada) {
//        double totalHsNormal = hsNormalTrabalhada * contrato.ValorDaHorNormal;
//        double totalHsExtra = hsExtraTrabalhada * contrato.ValordaHoraExtra;
//        double horaGeral = totalHsNormal + totalHsExtra;
//
//        if (contrato.funcionario.quantidadeFilhos >= 1){
//            double adicional = horaGeral * 0.10;
//            return adicional;
//        }
//
//        return horaGeral;


//1)
//    double calcularSalario(ContratoTrabalhodouble hsNormalTrabalhada, double hsExtraTrabalhada,
//                           double vlrHoraNormal, double vlrHoraExtra) {
//        double totalHsNormal = hsNormalTrabalhada * vlrHoraNormal;
//        double totalHsExtra = hsExtraTrabalhada * vlrHoraExtra;
//        double horaGeral = totalHsNormal + totalHsExtra;
//        return horaGeral;
//    }
// }
