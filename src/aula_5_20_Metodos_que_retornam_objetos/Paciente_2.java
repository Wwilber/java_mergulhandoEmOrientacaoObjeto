package aula_5_20_Metodos_que_retornam_objetos;

public class Paciente_2 {

    double peso;
    double altura;

    double calcularIndiceMassaCorporal() {
        double imcCalculado = peso / (altura + altura);
        return  imcCalculado;
    }
}
