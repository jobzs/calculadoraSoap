/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetocalculadoracientifica;

import br.ifsp.edu.CalcCientifica.Aleatorio;
import br.ifsp.edu.CalcCientifica.Calculadora;
import br.ifsp.edu.CalcCientifica.Cosseno;
import br.ifsp.edu.CalcCientifica.Dividir;
import br.ifsp.edu.CalcCientifica.Fatorial;
import br.ifsp.edu.CalcCientifica.FracionarSimples;
import br.ifsp.edu.CalcCientifica.LogBase10;
import br.ifsp.edu.CalcCientifica.LogaritmoNatural;
import br.ifsp.edu.CalcCientifica.Multiplicar;
import br.ifsp.edu.CalcCientifica.Porcentagem;
import br.ifsp.edu.CalcCientifica.PotenciacaoCompleta;
import br.ifsp.edu.CalcCientifica.PotenciacaoSimples;
import br.ifsp.edu.CalcCientifica.RaizQuadrada;
import br.ifsp.edu.CalcCientifica.Seno;
import br.ifsp.edu.CalcCientifica.ServicoInterface;
import br.ifsp.edu.CalcCientifica.Somar;
import br.ifsp.edu.CalcCientifica.Subtrair;
import br.ifsp.edu.CalcCientifica.Tangente;


public class ProjetoCalculadoraCientifica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        Calculadora calc = new Calculadora("cientifica");

        //Polimorfismo
        ServicoInterface servico01 = new Somar();
        ServicoInterface servico02 = new Subtrair();
        ServicoInterface servico03 = new Multiplicar();
        ServicoInterface servico04 = new Dividir();
        ServicoInterface servico05 = new Porcentagem();
        ServicoInterface servico06 = new FracionarSimples();
        ServicoInterface servico07 = new RaizQuadrada();
        ServicoInterface servico08 = new PotenciacaoSimples();
        ServicoInterface servico09 = new Cosseno();
        ServicoInterface servico10 = new Seno();
        ServicoInterface servico11 = new Tangente();
        ServicoInterface servico12 = new LogBase10();
        ServicoInterface servico13 = new PotenciacaoCompleta();
        ServicoInterface servico14 = new Fatorial();
        ServicoInterface servico15 = new LogaritmoNatural();
        ServicoInterface servico16 = new Aleatorio();

        calc.adicionaServico(servico01);
        calc.adicionaServico(servico02);
        calc.adicionaServico(servico03);
        calc.adicionaServico(servico04);
        calc.adicionaServico(servico05);
        calc.adicionaServico(servico06);
        calc.adicionaServico(servico07);
        calc.adicionaServico(servico08);
        calc.adicionaServico(servico09);
        calc.adicionaServico(servico10);
        calc.adicionaServico(servico11);
        calc.adicionaServico(servico12);
        calc.adicionaServico(servico13);
        calc.adicionaServico(servico14);
        calc.adicionaServico(servico15);
        calc.adicionaServico(servico16);

        calc.setValorInputA(15);
        calc.setValorInputB(3);

        try {
            double soma = calc.calcular("Somar");
            System.out.println("Resultado: " + soma);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            double subtracao = calc.calcular("Subtrair");
            System.out.println("Resultado: " + subtracao);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            double multiplicacao = calc.calcular("Multiplicar");
            System.out.println("Resultado: " + multiplicacao);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            double divisao = calc.calcular("Dividir");
            System.out.println("Resultado: " + divisao);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            double porcentagem = calc.calcular("Porcentagem");
            System.out.println("Resultado: " + porcentagem);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            double fracaoSimples = calc.calcular("1/X");
            System.out.println("Resultado: " + fracaoSimples);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            double raizQuadrada = calc.calcular("Raiz Quadrada");
            System.out.println("Resultado: " + raizQuadrada);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            double elevadoAoQuadrado = calc.calcular("X²");
            System.out.println("Resultado: " + elevadoAoQuadrado);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        //Arrumar, calculos "cientificos" aparecendo na parte de resultado, como "0.0"
        if (calc.getTipoCalculadora().equalsIgnoreCase("cientifica")){
            try {
                double cosseno = calc.calcular("Cosseno");
                System.out.println("Resultado: " + cosseno);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        
            try {
               double seno = calc.calcular("Seno");
                System.out.println("Resultado: " + seno);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            try {
                double tan = calc.calcular("Tangente");
                System.out.println("Resultado: " + tan);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            try {
               double logTen = calc.calcular("Logaritmo Base10");
                System.out.println("Resultado: " + logTen);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            try {
               double poten = calc.calcular("Potencia");
                System.out.println("Resultado: " + poten);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            try {
               double fatorial = calc.calcular("Fatorial");
                System.out.println("Resultado: " + fatorial);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            try {
               double ln = calc.calcular("LN");
                System.out.println("Resultado: " + ln);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            try {
               double rand = calc.calcular("Rand");
                System.out.println("Resultado: " + rand);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println("Catálogo: " + calc.obterCatalogoDeServicosDisponiveis());
    }

}
