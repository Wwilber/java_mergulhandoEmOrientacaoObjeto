package aula_5_24_Passando_objetos_como_argumentos_de_metodos;

//
public class CalculadoraImc {


    IndiceMassaCorporal calcular(Paciente paciente) {
        double imcCalculado = paciente.peso / (paciente.altura * paciente.altura);

        IndiceMassaCorporal imc = new IndiceMassaCorporal();
        imc.resultado = imcCalculado;

        imc.peso = paciente.peso;
        imc.altura = paciente.altura;

        return imc;
    }
}
