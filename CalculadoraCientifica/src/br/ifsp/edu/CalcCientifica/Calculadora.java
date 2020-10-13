/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifsp.edu.CalcCientifica;

import java.util.ArrayList;
import java.util.List;


public class Calculadora {

    private double valorInputA;
    private double valorInputB;
    private double valorSaida;
    private String tipoCalculadora = "";
    List<ServicoInterface> servicos = new ArrayList<>();

    public Calculadora(String tipoCalculadora) {
        this.tipoCalculadora = tipoCalculadora;
    }

    public String obterCatalogoDeServicosDisponiveis() {
        String catalogo = "";
        int i = 0;
        for (ServicoInterface si : servicos) {
            if (si.calculoE(this.getTipoCalculadora())) {
                catalogo += si.getOperacao()+", ";
                i++;
            }
        }
        catalogo=catalogo.substring(0, catalogo.length()-2);
        return catalogo;
    }

    public double calcular(String operacao) throws Exception {
        for (ServicoInterface si : servicos) {
            if (si.calculoE(this.getTipoCalculadora())) {
                if (si.operacaoE(operacao)) {
                    si.setValorInputA(valorInputA);
                    si.setValorInputB(valorInputB);
                    double res=0;
                    try {
                        res = si.calcular();
                    } catch (Exception e) {
                        throw new Exception("erro");
                    }
                    return res;
                }
            }
        }
        return 0;
    }

    public void adicionaServico(ServicoInterface servico) {
        servicos.add(servico);
    }

    public double getValorInputA() {
        return valorInputA;
    }

    public void setValorInputA(double valorInputA) {
        this.valorInputA = valorInputA;
    }

    public double getValorInputB() {
        return valorInputB;
    }

    public void setValorInputB(double valorInputB) {
        this.valorInputB = valorInputB;
    }

    public double getValorSaida() {
        return valorSaida;
    }

    public void setValorSaida(double valorSaida) {
        this.valorSaida = valorSaida;
    }

    /**
     * @return the tipoCalculadora
     */
    public String getTipoCalculadora() {
        return tipoCalculadora;
    }

    /**
     * @param tipoCalculadora the tipoCalculadora to set
     */
    public void setTipoCalculadora(String tipoCalculadora) {
        this.tipoCalculadora = tipoCalculadora;
    }

}
