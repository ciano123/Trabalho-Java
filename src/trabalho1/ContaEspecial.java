/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package trabalho1;

//import javax.swing.JOptionPane;

/**
 *
 * @author Cassiano
 */
public class ContaEspecial extends Contas{
    private double limite;
    private double multa;
    private double saque; 
    private double salT;
   
  
    public void setLimite(double limite) {
        this.limite = limite;
    }
    public double getLimite(){
        return limite;
    }
    public void setSaque(double saque) {
        this.saque = saque;
    }
    public double descontar(double saque, double saldo, double lim, double mu){
        this.salT = lim + saldo;
        //JOptionPane.showMessageDialog(null, "O salT eh: "+this.salT);
        if(saque <= this.salT){
        double novoSaldo = saque-saldo;
        //JOptionPane.showMessageDialog(null, "O novo saldo eh: "+novoSaldo);
        double taxa = novoSaldo*(mu/100);
        //JOptionPane.showMessageDialog(null, "A taxa eh: "+taxa);
        double sn = (novoSaldo+taxa)*(-1);
        //JOptionPane.showMessageDialog(null, "O sn eh: "+sn);
        this.setSaldo(sn);
        return sn;
        }else{
            System.out.println("Saldo insuficiente para realizar o saque.");
            return saldo;
        }
                
        }
    @Override
    public void tipoConta(){
        System.out.println("Conta-Especial");
    }

    public void setMulta(double multa) {
        this.multa = multa;
    }
    public double getMulta(){
        return multa;
    }
        
    }