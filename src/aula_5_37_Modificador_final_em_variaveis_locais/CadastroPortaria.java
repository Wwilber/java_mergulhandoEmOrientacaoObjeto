package aula_5_37_Modificador_final_em_variaveis_locais;

public class CadastroPortaria {

    void cadastrar(Visitante visitante, final int tempoExpiracaoEmMeses) {

        int tempoExpiracaoEmDias;
        tempoExpiracaoEmDias = tempoExpiracaoEmMeses * 30;

        System.out.printf("Vistante %s cadastrado para %d dias %n", visitante.nome, tempoExpiracaoEmDias);

    }
}