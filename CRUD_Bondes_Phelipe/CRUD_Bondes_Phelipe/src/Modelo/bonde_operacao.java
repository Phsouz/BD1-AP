/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Phelipe Almeida de Souza RA: a2007029
 */
public class bonde_operacao {
    Long cod_bonde;
    String nome_bonde;
    Long id_maquinista;
    
    public Long getcod_bonde() {
        return cod_bonde;
    }

    public void setcod_bonde(Long cod_bonde) {
        this.cod_bonde = cod_bonde;
    }

    public String getnome_bonde() {
        return nome_bonde;
    }

    public void setnome_bonde(String nome_bonde) {
        this.nome_bonde = nome_bonde;
    }

    public Long getid_maquinista() {
        return id_maquinista;
    }

    public void setid_maquinista(Long id_maquinista) {
        this.id_maquinista = id_maquinista;
    }    
}
