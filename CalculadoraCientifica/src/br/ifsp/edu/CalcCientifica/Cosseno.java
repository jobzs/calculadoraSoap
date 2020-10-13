/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifsp.edu.CalcCientifica;


public class Cosseno implements ServicoInterface{
    private double valorInputA;
    private double valorInputB;
    private String operacao="Cosseno";
    private String tipoCalculo="cientifica";
    private String tipoCalculadora="";
    
    
    @Override
    public double calcular() throws Exception{
        if (tipoCalculadora.equals(tipoCalculo)){
            throw new Exception("Erro de calculo cientifico.");
        }
        double resul = Math.toRadians(valorInputA);
        resul = Math.cos(resul);
        return resul;
    }
    
    public boolean calculoE(String tipoCalculo){
        if (this.tipoCalculo.equals(tipoCalculo)){
            return true;
        }
        return false;
    }

    @Override
    public boolean operacaoE(String operacao) {
        if (this.operacao.equals(operacao)){
            return true;
        }
        return false;
    }

    @Override
    public void setValorInputA(double valorInputA) {
        this.valorInputA=valorInputA;
    }

    @Override
    public void setValorInputB(double valorInputB) {
        
    }

    @Override
    public String getOperacao() {
        return operacao;
    }

    @Override
    public void setTipoCalculadora(String tipoCalculadora) {
        this.tipoCalculadora=tipoCalculadora;
    }
    
}
