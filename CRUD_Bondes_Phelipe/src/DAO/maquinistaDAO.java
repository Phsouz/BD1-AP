/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Modelo.maquinista;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


/**
 *
 * @author a2007029
 */
public class maquinistaDAO extends DbConnection{
    private Connection conn;
    private final String sqlInsert  = "INSERT INTO maquinista(id_maquinista, nome_maquinista) VALUES (?,?)";
    private final String sqlUpdate  = "UPDATE maquinista SET id_maquinista= ?, nome_maqunista=?";
    private final String sqlRemove  = "DELETE FROM maquinista WHERE nome_maquinista = ?";
    

    public void insert(maquinista m) throws SQLException{
        PreparedStatement ps = null;
        try{
            conn = connect();
            ps = conn.prepareStatement(sqlInsert);
            ps.setString(2, m.getnome_maquinista());
            ps.execute();
        }
        finally{
            ps.close();
            conn.close();
        }
    }

    public void update(maquinista m, String nome_maquinista) throws SQLException{
        PreparedStatement ps = null;
        try{
            conn = connect();
            ps = conn.prepareStatement(sqlUpdate);
            ps.setString(2, m.getnome_maquinista());
           
            ps.execute();
        }
        finally{
            ps.close();
            conn.close();
        }
    }
    public void remove(String nome_maquinista) throws SQLException{
        PreparedStatement ps = null;
        try{
            conn = connect();
            ps = conn.prepareStatement(sqlRemove);
            ps.setString(1, nome_maquinista);
            ps.execute();
        }
        finally{
            ps.close();
            conn.close();
        }
    }
    
}
