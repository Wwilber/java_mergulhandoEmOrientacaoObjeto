package aula_5_25_Desafio_composicao_de_objetos_e_metodos;

public class Holerite {

    Funcionario funcionario = new Funcionario();
    double valorTotalHorasNormais;
    double valorTotalHorasExtras;
    double valorAdidionalFilhos;

    double calcularValorTotal(ContratoTrabalho contrato, double hsNormalTrabalhada,
                              double hsExtraTrabalhada, Funcionario funcionario) {
        valorTotalHorasNormais = hsNormalTrabalhada * contrato.valorDaHorNormal;
        valorTotalHorasExtras = hsExtraTrabalhada * contrato.valordaHoraExtra;
        double horaGeral = valorTotalHorasNormais + valorTotalHorasExtras;

        if (funcionario.temFilhos()) {
            double adicional = horaGeral * 0.10;
            return adicional + horaGeral;
        }
        return horaGeral;

    }

    void imprimirHolerite() {

    }
}

