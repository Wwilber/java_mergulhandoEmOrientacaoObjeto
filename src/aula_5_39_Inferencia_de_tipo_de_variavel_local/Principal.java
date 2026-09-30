package aula_5_39_Inferencia_de_tipo_de_variavel_local;

public class Principal {
    public static void main(String[] args) {
        var novoVisitante = new Visitante();
        novoVisitante.nome = "João";
        novoVisitante.idade = 12;

        var cadastro = new CadastroPortaria();
        cadastro.cadastrar(novoVisitante,10);
        cadastro.cadastrar(novoVisitante);


    }
}
