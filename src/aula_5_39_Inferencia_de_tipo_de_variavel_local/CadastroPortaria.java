package aula_5_39_Inferencia_de_tipo_de_variavel_local;

public class CadastroPortaria {

    static final int TEMPO_EXPIRACAO_PADRAO_EM_MESES = 1;

    void cadastrar(Visitante visitante){

        this.cadastrar(visitante, TEMPO_EXPIRACAO_PADRAO_EM_MESES);
    }

    void cadastrar(Visitante visitante, final int tempoExpiracaoEmMeses){
        final var tempoExpiracaoEmDias = tempoExpiracaoEmMeses * 30;

        System.out.printf("Vistante %s cadastrado para %d dias %n", visitante.nome, tempoExpiracaoEmDias);

    }
}
