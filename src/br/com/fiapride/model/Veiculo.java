package br.com.fiapride.model;

public class Veiculo {

    private String nomeDono;    // mudança: individuo para nomeDono
    private String placa;   // mudança: pl para placa
    private double quantidadeGasolinaLitros; // mudança: gas para quantidadeGasolinaLitros, mudança: int para double --> qtd gasolina pode ser quebrada

    // adiciona construtor da classe
    public Veiculo(String nomeDono, String placa, double quantidadeGasolinaLitros) {
        this.setNomeDono(nomeDono);
        this.setPlaca(placa);
        this.setquantidadeGasolinaLitros(quantidadeGasolinaLitros);
    }
    
    // getters para permitir leitura dos valores dos atributos de forma segura
    public String getNomeDono() {
        return this.nomeDono;
    } 
    
    public String getPlaca() {
        return this.placa;
    } 
    
    public double getquantidadeGasolinaLitros() {
        return this.quantidadeGasolinaLitros;
    } 

    // setters para permitir mudança dos valores dos atributos de forma segura
    private void setNomeDono(String nome) {
        if (nome == null || nome.trim().isEmpty()) {    // .trim() remove espaços | .isEmpty() verifica se a string é vazia
            System.out.println("ERRO: Tentativa de definir o nome do dono do veículo bloqueada!");
            return;
        }

        this.nomeDono = nome;
    } 
    
    private void setPlaca(String placa) {
        if (placa == null || placa.trim().length() != 8) {
            System.out.println("ERRO: A placa deve conter exatamente 8 caracteres (contando com o hífen).");
            return; 
        }

        this.placa = placa;
    }
    
    private void setquantidadeGasolinaLitros(double quantidadeGasolinaLitros) {
        if (quantidadeGasolinaLitros <= 0){
            System.out.println("ERRO: Tentativa de definir quantidade de gasolina negativa bloqueada!");
            return; 
        }

        this.quantidadeGasolinaLitros = quantidadeGasolinaLitros;
    }  

    public void abastecer(double litrosGasolina) {
        if (quantidadeGasolinaLitros <= 0){
            System.out.println("ERRO: Quantidade de gasolina inválida. O valor a abastecer tem que ser maior que zero.");
            return; 
        }

        this.quantidadeGasolinaLitros += litrosGasolina;
        System.out.println("Veículo abastecido com " + litrosGasolina + " litros de gasolina.");
    }

    public void consumir(double litrosGasolina) {
        if (this.quantidadeGasolinaLitros < litrosGasolina){
            System.out.println("ERRO: Quantidade de gasolina insuficiente. Abasteça o veículo.");
            return; 
        }

        this.quantidadeGasolinaLitros -= litrosGasolina;
        System.out.println("Veículo consumiu " + litrosGasolina + " litros de gasolina.");
    }
}
