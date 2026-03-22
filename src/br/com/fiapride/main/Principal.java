package br.com.fiapride.main;

import br.com.fiapride.model.Veiculo;

public class Principal {
    public static void main(String[] args) {
        Veiculo v1 = new Veiculo("Carlos", "ABC-1234", 100);
        
        System.out.println(">> Veículo - Início:");
        System.out.println("Dono: " + v1.getNomeDono() + " | Placa: " + v1.getPlaca() + " | Gasolina: " + v1.getquantidadeGasolinaLitros());

        System.out.println(">> Ações:");
        v1.abastecer(100);
        v1.consumir(50);

        System.out.println(">> Veículo - Fim:");
        System.out.println("Dono: " + v1.getNomeDono() + " | Placa: " + v1.getPlaca() + " | Gasolina: " + v1.getquantidadeGasolinaLitros());
    }
}
