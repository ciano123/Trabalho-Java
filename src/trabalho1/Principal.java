/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package trabalho1;


import javax.swing.JOptionPane;

/**
 *
 * @author Cassiano
 */
public class Principal extends javax.swing.JFrame{
    
    //Definindo variaveis estaticas de cada tipo.. 
    public static Contas conta1 = new Contas();
    
    public static ContaPoupanca conta2 = new ContaPoupanca();
    
    public static ContaEspecial conta3 = new ContaEspecial();
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        JOptionPane.showMessageDialog(null, "Bem Vindo!");
        
        //Chamando a tela principal..
       JFramePrincipal1 p = new JFramePrincipal1();
       p.setResizable(false);
       p.setVisible(true);
        
    }
    
}
