package negocio;

public class Carro implements ICarro{

    protected final int ano;
    protected final String modelo;
    protected final String marca;
    protected final String placa;
    protected final String chassi;

    public Carro(int ano, String modelo, String marca, String placa, String chassi) {
        this.ano = ano;
        this.modelo = modelo;
        this.marca = marca;
        this.placa = placa;
        this.chassi = chassi;
    }

    
    @Override
    public void manobrar(Empregado empregado) {
        System.out.println("Colaborador " + empregado.getNome() + " manobrando um " + modelo + " (" + placa + ").");
    }
    
    @Override
    public String toString() {
        return "Carro [ano=" + ano + ", modelo=" + modelo + ", marca=" + marca + ", placa=" + placa + ", chassi="
                + chassi + "]";
    }
}
