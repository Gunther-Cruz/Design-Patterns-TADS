package negocio;

public class CarroProxy implements ICarro {

    protected final Carro carro;

    public CarroProxy(Carro carro) {
        this.carro = carro;
    }

    @Override
    public void manobrar(Empregado empregado) {
        if (empregado.possuiCNH() && empregado.calculaIdade() >= 18) {
            carro.manobrar(empregado);
        } else {
            System.out.println("Colaborador " + empregado.getNome() + " não está autorizado a manobrar o veículo.");
        }
    }
}
