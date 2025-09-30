/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

/**
 *
 * @author iapereira
 */
public class MenuItem {
    
    
    private String nome;
    private double preco;
    private boolean ehVegetariano;
    private String descricao;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public boolean isEhVegetariano() {
        return ehVegetariano;
    }

    public void setEhVegetariano(boolean ehVegetariano) {
        this.ehVegetariano = ehVegetariano;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    

    @Override
    public String toString() {
        return "MenuItem{" + "nome=" + nome + ", preco=" + preco + ", ehVegetariano=" + ehVegetariano + ", descricao=" + descricao + '}';
    }
    
    
    
    
}
