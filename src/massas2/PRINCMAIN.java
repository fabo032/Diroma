/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package massas2;

import conexao.Conexao;
/**
 *
 * @author Fábio
 */
public class PRINCMAIN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Conexao c = new Conexao();
       c.getConexao();

    }
    public static boolean checkLogin(String usuario, String senha){
    
    
        return usuario.equals("123") && senha.equals("123");
}
}