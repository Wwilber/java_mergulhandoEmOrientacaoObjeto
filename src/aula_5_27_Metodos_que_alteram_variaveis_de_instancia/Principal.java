package aula_5_27_Metodos_que_alteram_variaveis_de_instancia;

public class Principal {
    public static void main(String[] args) {
        Aeronave aviaoGol = new Aeronave();
        aviaoGol.totalAssentos = 100;

        // aviaoGol.ativo = false;
        // aviaoGol.desativar();
        aviaoGol.ativar();
        aviaoGol.reservarAssentos(10);

        System.out.printf("GOL (%s): %d assentos disponíveis",
                aviaoGol.ativo ? "Ativo" : "Inativo",
                aviaoGol.calcularAssentosDisponiveis());


    }
}
