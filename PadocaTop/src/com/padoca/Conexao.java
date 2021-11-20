/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.padoca;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author lorenzo.uliano
 */
public class Conexao {
    public Connection conexao;
    String server = "localhost";
    String dbname = "padariav3";
    String url = "jdbc:mysql://" + server +  "/" + dbname;
    String user = "root";
    String password = "%Pedroso";
    
    public Conexao() throws SQLException{
        conexao = DriverManager.getConnection(url, user, password);
    }
}
