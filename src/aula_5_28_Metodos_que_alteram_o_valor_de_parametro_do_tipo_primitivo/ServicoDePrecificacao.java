package aula_5_28_Metodos_que_alteram_o_valor_de_parametro_do_tipo_primitivo;

public class ServicoDePrecificacao {
    void calcularPrecoVenda(double precoCusto) {
        precoCusto = precoCusto * 1.20;

    }

    double calcularPrecoVenda2(double precoCusto) {
        return precoCusto = precoCusto * 1.20;

    }
}
