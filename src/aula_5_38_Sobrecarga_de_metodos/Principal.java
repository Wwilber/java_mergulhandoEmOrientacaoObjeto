package aula_5_38_Sobrecarga_de_metodos;

public class Principal {
    public static void main(String[] args) {
        Visitante novoVisitante = new Visitante();
        novoVisitante.nome = "João";
        novoVisitante.idade = 12;

        CadastroPortaria cadastro = new CadastroPortaria();
        cadastro.cadastrar(novoVisitante,10);
        cadastro.cadastrar(novoVisitante);


    }
}
