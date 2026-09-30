package aula_5_37_Modificador_final_em_variaveis_locais;

public class Principal {
    public static void main(String[] args) {
        Visitante novoVisitante = new Visitante();
        novoVisitante.nome = "João";
        novoVisitante.idade = 12;

        CadastroPortaria cadastro = new CadastroPortaria();
        cadastro.cadastrar(novoVisitante,100);


    }
}
