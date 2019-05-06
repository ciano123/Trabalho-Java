package trabalho1;

import javax.swing.JOptionPane;
/**
 *
 * @author Cassiano
 */
public class Contas {
    private String nome;
    private int numero;
    private double saldo;
    
        
    public void depositar(double valor){
        this.saldo += valor;
    }
    public double sacar(double valor){
        
        if(valor <= this.saldo){
            double novoValor = this.saldo - valor;
            this.saldo = novoValor;
            JOptionPane.showMessageDialog(null, "Saque efetuado");
            return this.saldo;
        }
            JOptionPane.showMessageDialog(null, "Saldo insuficiente");
             
             return 0;
    }
    public void tipoConta(){
        System.out.println("Conta-Comum ");
    }

    public String getNome() {
        return nome;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

}
