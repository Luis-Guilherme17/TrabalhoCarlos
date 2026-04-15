
package com.mycompany.controlecomissao;
        
public class Vendedor {
  private String nome;
    private double salarioBase;

    public Vendedor(String nome,
                     double salarioBase) {

        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    public double calcularComissao(
            double vendas) {

        double comissao =
                vendas * 0.10;

        return salarioBase + comissao;
    }

}
