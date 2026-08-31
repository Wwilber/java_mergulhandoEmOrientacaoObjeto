package aula_5_7_Desafio_instanciando_objetos_e_acessando_os_atributos;

public class Principal {
    public static void main(String[] args) {
        Cachorro poodle = new Cachorro();
        Cachorro pitbull = new Cachorro();

        poodle.nome = "piti";
        poodle.idade = 2;
        poodle.raca = "toy";
        poodle.sexo = "femea";

        pitbull.nome = "totó";
        pitbull.idade = 15;
        pitbull.raca = "rangnoze";
        pitbull.sexo = "masculino";


        System.out.printf("Nome do Poodle: %s%n", poodle.nome);
        System.out.printf("Idade do Poodle: %d%n", poodle.idade);
        System.out.printf("raca do Poodle: %s%n", poodle.raca);
        System.out.printf("sexo do Poodle: %s%n", poodle.sexo);
        System.out.println("");

        System.out.printf("Nome do Pitbull: %s%n", pitbull.nome);
        System.out.printf("Idade do Pitbull: %d%n", pitbull.idade);
        System.out.printf("raca do Pitbull: %s%n", pitbull.raca);
        System.out.printf("sexo do Pitbull: %s%n", pitbull.sexo);

    }
}
