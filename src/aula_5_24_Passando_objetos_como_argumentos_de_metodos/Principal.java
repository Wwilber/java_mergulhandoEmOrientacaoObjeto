package aula_5_24_Passando_objetos_como_argumentos_de_metodos;

public class Principal {
    public static void main(String[] args) {
        CalculadoraImc calculadoraImc = new CalculadoraImc();
//        calculadoraImc.altura = 1.82;
//        calculadoraImc.peso = 120;

//            double altura = 1.82;
//            double peso = 175;

        Paciente joao = new Paciente();
        joao.altura = 1.82;
        joao.peso = 175;

        IndiceMassaCorporal imc = calculadoraImc.calcular(joao);

        if (imc.estaComObesidade()) {
            System.out.printf("Paciente com altura de %.2f e peso de %.2f " +
                    "está com obesidade %n", imc.altura, imc.peso);
        } else {
            System.out.printf(" O IMC é: %.2f%n", imc.resultado);
        }


    }
}
