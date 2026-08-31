package aula_5_20_Metodos_que_retornam_objetos;

public class Principal_2 {
    public static void main(String[] args) {
        Paciente_2 paciente_2 = new Paciente_2();
        paciente_2.altura = 1.82;
        paciente_2.peso = 75;

        double imc2 = paciente_2.calcularIndiceMassaCorporal();

        System.out.printf("IMC: %.2f%n", imc2);
    }
}
