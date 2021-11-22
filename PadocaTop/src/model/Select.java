/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import com.padoca.Conexao;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
/**
 *
 * @author lorenzo.uliano
 */
public class Select {

    public ResultSet rs;
    public void SelectFunc(String selected) throws SQLException {
        try {
            Conexao con = new Conexao();
            Statement st = con.conexao.createStatement();
            
            st.executeQuery("select * from tb_funcionario where nome_funcionario = '"+ selected +"'");
            this.rs = st.getResultSet();
            JOptionPane.showMessageDialog(null, "aaaaaa");
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro" + e);
        }
        
    }
    void SelectProd() throws SQLException {
        try {
            Conexao con = new Conexao();
            Statement st = con.conexao.createStatement();
            
            st.executeQuery("select * from tb_produto");
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro" + e);
        }
        
    }
    void SelectVendas() throws SQLException {
        try {
            Conexao con = new Conexao();
            Statement st = con.conexao.createStatement();
            
            st.executeQuery("select * from tb_venda");
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro" + e);
        }
        
    }
    void SelectEstoque() throws SQLException {
        try {
            Conexao con = new Conexao();
            Statement st = con.conexao.createStatement();
            
            st.executeQuery("select * from tb_estoque");
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro" + e);
        }
        
    }
    void SelectRemessa() throws SQLException {
        try {
            Conexao con = new Conexao();
            Statement st = con.conexao.createStatement();
            
            st.executeQuery("select * from tb_remessa");
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro" + e);
        }
        
    }
    void SelectFornecedor() throws SQLException {
        try {
            Conexao con = new Conexao();
            Statement st = con.conexao.createStatement();
            
            st.executeQuery("select * from tb_fornecedor");
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro" + e);
        }
        
    }
}
