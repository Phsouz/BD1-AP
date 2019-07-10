/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Modelo.bonde_operacao;
import Modelo.maquinista;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;



/**
 *
 * @author a2007029
 */
public class bonde_operacaoDAO {
    private Connection conn;
    private final String sqlInsert = "INSERT INTO bonde_operacao(cod_bonde, nome_bonde, id_maquinista) VALUES (?,?,?)";
    private final String sqlUpdate = "UPDATE bonde_operacao SET nome_bonde= ?  WHERE cod_bonde = ? ";
    private final String sqlRemove = "DELETE FROM bonde_operacap WHERE id_maquinista = ?";
    //private final String sqlList   = "SELECT cod_bonde, nome_bonde, id_maquinista FROM bonde_operacao ORDER BY nome_bonde";
    //private final String sqlFind   = "SELECT cod_bonde, nome_bonde FROM Equipe WHERE id_maquinista = ?";


    public void insert(bonde_operacao bonde) throws SQLException{
        PreparedStatement ps = null;
        try{
            conn = connect();
            ps = conn.prepareStatement(sqlInsert);
            ps.setString(1, bonde.getnome_bonde());
           
            ps.execute();
        }
        finally{
            ps.close();
            close(conn);
        }        
    }

    public void update(bonde_operacao bonde) throws SQLException{
        PreparedStatement ps = null;
        try{
            conn = connect();
            ps = conn.prepareStatement(sqlUpdate);
            ps.setString(1, bonde.getnome_bonde());
            ps.execute();
        }
        finally{
            ps.close();
            close(conn);
        }
    }
    public void remove(int id_maquinista) throws SQLException{
        PreparedStatement ps = null;
        try{
            conn = connect();
            ps = conn.prepareStatement(sqlRemove);
            ps.setInt(1, id_maquinista);
            ps.execute();
        }
        finally{
            ps.close();
            close(conn);
        }

    }
    
}
