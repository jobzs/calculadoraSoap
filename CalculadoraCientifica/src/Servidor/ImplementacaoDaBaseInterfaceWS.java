/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servidor;

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
import javax.jws.WebService;





@WebService(endpointInterface="Servidor.BaseInterfaceWS")
public class ImplementacaoDaBaseInterfaceWS implements BaseInterfaceWS{

    Calculadora calc = new Calculadora("cientifica");
    public String operacao="";
    
    @Override
    public double getServico(String nomedoServico, double a, double b) {
        

        calc.setValorInputA(a);
        calc.setValorInputB(b);
        //Polimorfismo
        ServicoInterface servico01 = new Somar();
        calc.adicionaServico(servico01);
        ServicoInterface servico02 = new Subtrair();
        calc.adicionaServico(servico02);
        ServicoInterface servico03 = new Multiplicar();
        calc.adicionaServico(servico03);
        ServicoInterface servico04 = new Dividir();
        calc.adicionaServico(servico04);
        ServicoInterface servico05 = new Porcentagem();
        calc.adicionaServico(servico05);
        ServicoInterface servico06 = new FracionarSimples();
        calc.adicionaServico(servico06);
        ServicoInterface servico07 = new RaizQuadrada();
        calc.adicionaServico(servico07);
        ServicoInterface servico08 = new PotenciacaoSimples();
        calc.adicionaServico(servico08);
        ServicoInterface servico09 = new Cosseno();
        calc.adicionaServico(servico09);
        ServicoInterface servico10 = new Seno();
        calc.adicionaServico(servico10);
        ServicoInterface servico11 = new Tangente();
        calc.adicionaServico(servico11);
        ServicoInterface servico12 = new LogBase10();
        calc.adicionaServico(servico12);
        ServicoInterface servico13 = new PotenciacaoCompleta();
        calc.adicionaServico(servico13);
        ServicoInterface servico14 = new Fatorial();
        calc.adicionaServico(servico14);
        ServicoInterface servico15 = new LogaritmoNatural();
        calc.adicionaServico(servico15);
        ServicoInterface servico16 = new Aleatorio();
        calc.adicionaServico(servico16);
       
        double resul=0;
        try {
            resul = calc.calcular(nomedoServico);
            System.out.println("Resultado: " + resul);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        this.operacao=nomedoServico;
        return resul;
    }

    @Override
    public String getCatalogo() {
        return operacao;
    }
    
}
