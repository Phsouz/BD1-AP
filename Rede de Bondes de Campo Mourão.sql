create table Linhas(
 numero_linha integer,
 nome_da_linha varchar(100),
 qtde_estações integer,
 horários integer,
 primary key (numero_linha, nome_da_linha)
);

create table Estações(
 numero_linha integer,
 numero_da_estação integer,
 nome_da_estação varchar(100),
 primary key(numero_linha, numero_da_estação),
 foreign key (numero_linha) references Linhas(numero_linha)
);

create table Bondes(
 numero_linha integer,
 cod_bonde integer,
 modelo varchar(100),
 primary key (numero_linha, cod_bonde),
 foreign key (numero_linha) references Linhas (numero_linha)
);

create table Funcionários(
 cpf integer,
 nome varchar(100),
 primary key (cpf)
);

create table Gerente(
 cpf integer,
 primary key (cpf),
 foreign key (cpf) references Funcionários (cpf)
);

create table Sala_de_Controle(
 id integer,
 primary key id
);

create table Manutenção(
 id integer,
 primary key id,
 foreign key (id) references Sala_de_Controle (id)
);
