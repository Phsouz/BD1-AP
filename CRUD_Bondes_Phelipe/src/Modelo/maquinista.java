/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author a2007029
 */
public class maquinista {
     Long id;
     String nome_maquinista;
     
     public String getnome_maquinista() {
        return nome_maquinista;
    }

    public void setnome_maquinista(String nome_maquinista) {
        this.nome_maquinista = nome_maquinista;
    }

    public Long getid() {
        return id;
    }

    public void setid(Long id) {
        this.id = id;
    }
}

