package aula_5_23_Metodos_com_argumentos;

public class Principal {
    public static void main(String[] args) {
        Paciente paciente = new Paciente();
        paciente.altura = 1.82;
        paciente.peso = 120;


        IndiceMassaCorporal imc = paciente.calcularIndiceMassaCorporal();

        if (imc.estaComObesidade()) {
            System.out.printf("Paciente com altura de %.2f e peso de %.2f " +
               "está com obesidade %n", imc.altura, imc.peso);
        } else {
            System.out.printf(" O IMC é: %.2f%n", imc.resultado);
        }


    }
}
