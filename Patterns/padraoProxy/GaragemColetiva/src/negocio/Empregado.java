package negocio;

import java.time.LocalDate;
import java.time.Period;

public class Empregado {

    protected final String nome;
    protected final LocalDate dataNascimento;
    protected final String numeroCNH;

    public Empregado(String nome, LocalDate dataNascimento, String numeroCNH) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.numeroCNH = numeroCNH;
    }

    public String getNome() {
        return nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public boolean possuiCNH() {
        return numeroCNH != null && !numeroCNH.isEmpty();
    }

    public int calculaIdade() {
        return Period.between(this.getDataNascimento(), LocalDate.now()).getYears();
    }

    @Override
    public String toString() {
        return "Empregado [nome=" + nome + ", dataNascimento=" + dataNascimento + ", numeroCNH=" + numeroCNH + "]";
    }
}
