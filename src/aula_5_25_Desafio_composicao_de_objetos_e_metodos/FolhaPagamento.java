package aula_5_25_Desafio_composicao_de_objetos_e_metodos;

public class FolhaPagamento {

    double calcularSalario(ContratoTrabalho contrato, double hsNormalTrabalhada,
                           double hsExtraTrabalhada) {
        double totalHsNormal = hsNormalTrabalhada * contrato.ValorDaHorNormal;
        double totalHsExtra = hsExtraTrabalhada * contrato.ValordaHoraExtra;
        double horaGeral = totalHsNormal + totalHsExtra;

        if (contrato.funcionario.quantidadeFilhos >= 1){
            double adicional = horaGeral * 0.10;
            return adicional;
        }

        return horaGeral;
    }


//    double calcularSalario(ContratoTrabalhodouble hsNormalTrabalhada, double hsExtraTrabalhada,
//                           double vlrHoraNormal, double vlrHoraExtra) {
//        double totalHsNormal = hsNormalTrabalhada * vlrHoraNormal;
//        double totalHsExtra = hsExtraTrabalhada * vlrHoraExtra;
//        double horaGeral = totalHsNormal + totalHsExtra;
//        return horaGeral;
//    }
}
