/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifsp.edu.CalcCientifica;


public interface ServicoInterface {
    public double calcular () throws Exception;
    public boolean operacaoE(String operacao);
    public void setValorInputA(double valorInputA);
    public void setValorInputB(double valorInputB);
    public String getOperacao();
    public boolean calculoE(String tipoCalculo);
    public void setTipoCalculadora(String tipoCalculadora);
    
}
