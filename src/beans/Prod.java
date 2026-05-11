/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package beans;

/**
 *
 * @author Fabo
 */
public class Prod {
    
    private int id;
    private String tipo_;
    private String produto_;
    private int quantidade_;

    
    public int getId() {
        return id;
    }

    
    public void setId(int id) {
        this.id = id;
    }

    //////////////////////////
    /// @return /
    
    public String getTipo() {
        return tipo_;
    }

 
    public void setTipo(String tipo) {
        this.tipo_ = tipo;
    }

    /**
     * @return the marca
     */
    public String getProduto() {
        return produto_;
    }

    /**
     * @param produto
     */
    public void setProduto(String produto) {
        this.produto_ = produto;
    }

    /**
     * @return the valor
     */
    public int getQuantidade() {
        return quantidade_;
    }

    /**
     * @param quantidade
     */
    public void setQuantidade(int quantidade) {
        this.quantidade_ = quantidade;
    }
    
    
}
