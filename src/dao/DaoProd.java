/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import beans.Prod;
import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Fábio
 */
public class DaoProd {
  private Conexao conexao;
  private Connection conn;
  
  public DaoProd(){
        this.conexao = new Conexao();
        this.conn = this.conexao.getConexao();
  }
  
  public void inserir (Prod prod){
        String sql = "INSERT INTO produtos (tipo_,produto_,quantidade_) VALUES " + "(?,?,?)";
        
        try{
            
            PreparedStatement stmt = this.conn.prepareStatement(sql);
            stmt.setString(1, prod.getTipo());
            stmt.setString(2, prod.getProduto());
            stmt.setInt(3, prod.getQuantidade());
            stmt.execute();
            

        
        }catch(Exception e ){
            System.out.println("Erro ao inserir informações " + e.getMessage());

        }
    }
  public Prod getProd(int id){
        
            String sql = "SELECT * FROM produtos WHERE id_ = ?";
            
            try{

                PreparedStatement stmt = this.conn.prepareStatement(sql);
                stmt.setInt(1,id);
                ResultSet rs = stmt.executeQuery();
                Prod prod = new Prod();

                rs.first();
            
                prod.setId(id);
                prod.setTipo(rs.getString ("tipo_"));
                prod.setProduto(rs.getString ("produto_"));
                prod.setQuantidade(rs.getInt ("quantidade_"));
                
                return prod;
            
                
                
            
            }catch(Exception e ){
                System.out.println("Não há nenhum item com o nome " + e.getMessage());
                return null;
            }
            
           
  
    }
  public void excluir (int id){
        String sql = "DELETE FROM produtos WHERE id_ = ?";
        
            try{

                PreparedStatement stmt = this.conn.prepareStatement(sql);

                stmt.setInt(1,id);
                stmt.execute();


            }catch(Exception e ){
                System.out.println("Erro ao ecluir item: " + e.getMessage());

            }
        }
  
  public List<Prod> getProd(){
        
            String sql = "SELECT * FROM produtos";
          
            try{
          
                PreparedStatement stmt = this.conn.prepareStatement(sql);
                ResultSet rs = stmt.executeQuery();
                
                List<Prod> listaItens = new ArrayList<>();
                
                while(rs.next()){
                    
                    
                    Prod prod = new Prod();
                    prod.setId(rs.getInt("id_"));
                    prod.setTipo(rs.getString ("tipo_"));
                    prod.setProduto(rs.getString ("produto_"));
                    prod.setQuantidade(rs.getInt ("quantidade_"));
                    listaItens.add(prod);
                
                }
                
              return listaItens;
              
            }catch(Exception e ){
                System.out.println("Erro ao listar produtos: " + e.getMessage());
                return null;
            }
        }
  
  
  
  
  public void editar(Prod prod)
{

        String sql = "UPDATE produtos SET tipo_=?, produto_=?, quantidade_=? WHERE id_=?";
         
            try {

                PreparedStatement stmt = this.conn.prepareStatement(sql);
                stmt.setString(1, prod.getTipo());
                stmt.setString(2, prod.getProduto());
                stmt.setInt(3, prod.getQuantidade());
                stmt.setInt(4, prod.getId());
                stmt.execute();
            }catch (Exception e){

                System.out.println("Erro ao editar item " + e.getMessage());

            }
        }
}