package aula_5_27_Metodos_que_alteram_variaveis_de_instancia;

public class Aeronave {
    boolean ativo;
    int totalAssentos;
    int assentosReservados;

    int calcularAssentosDisponiveis() {
        return totalAssentos - assentosReservados;
    }

    void reservarAssentos(int numeroAssentos){
        if(ativo){
            assentosReservados += numeroAssentos;
        } else {
            // existe excessões
            System.out.println("Aeronave desativada. Assentos não reservados!!!");
        }
    }
    void desativar() {
        if (assentosReservados > 0) {

        } else {
            ativo = false;
        }
    }

    void ativar(){
        ativo = true;
    }
}
