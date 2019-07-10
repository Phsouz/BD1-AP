/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  a2007029
 * Created: 10/07/2019
 */

drop table if exists bonde_operacao;
drop table if exists maquinista;

create table maquinista(
	id_maquinista integer primary key,
    nome_maquinista varchar(100)
);

create table bonde_operacao(
	cod_bonde integer,
    nome_bonde varchar(100),
    id_maquinista integer,
    primary key (cod_bonde, id_maquinista),
    foreign key (id_maquinista) references maquinista (id_maquinista)
);