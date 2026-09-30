package aula_5_36_Declarando_constantes_com_static_e_final;

public class Principal {
    public static void main(String[] args) {
        Visitante novoVisitante = new Visitante();
        novoVisitante.nome = "João";
        novoVisitante.idade = 12;

        if (novoVisitante.possuiAcessoRestritoPorIdade()){
            System.out.printf("Acesso não permitido para menores de %d anos",
            Visitante.IDADE_MINIMA_ACESSO_RESTRITO);
        } else {
            System.out.println("Acesso Liberado");
        }
    }
}
