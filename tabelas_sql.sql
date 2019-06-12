drop table if exists passam;
drop table if exists contem;
drop table if exists bonde_operacao;
drop table if exists maquinista;
drop table if exists estacoes;
drop table if exists linhas;


create table linhas(
	cod_linha integer primary key,
	nome_linha varchar(10)
);

create table estacoes(
	cod_estacao integer primary key,
    nome_estacao varchar(100)
);

create table contem(
	cod_linha integer,
    cod_estacao integer,
    primary key (cod_linha, cod_estacao),
    foreign key (cod_linha) references linhas (cod_linha),
    foreign key (cod_estacao) references estacoes (cod_estacao) 
);

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

create table passam(
	cod_estacao integer,
    cod_bonde integer,
    primary key (cod_estacao, cod_bonde),
    foreign key (cod_estacao) references estacoes (cod_estacao),
    foreign key (cod_bonde) references bonde_operacao (cod_bonde)
);