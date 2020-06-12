/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciolist;

/**
 *
 * @author valmi
 */
public class Funcionario {
    private int id;
    private String nome;
    private Double salario;

    public Funcionario(int id, String nome, Double salario) {
        this.id = id;
        this.nome = nome;
        this.salario = salario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }
    public void aumentoSalario(double porcentagem){
        salario = salario + salario * porcentagem / 100.0;
    }

    
    
    
}
