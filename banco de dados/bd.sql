create database ac2Matheus;
use ac2Matheus;

create table Empresa (
idEmpresa int primary key auto_increment,
NomeEmpresa varchar(40),
vendas int,
receita decimal(7,2) check ( receita >= 1000 and receita <= 10000)
);
create table Funcionario (
idFuncionario int primary key auto_increment,
nome varchar(40),
bairro varchar(40),
rua varchar(40),
numero int,
telefone1 char(14),
telefone2 char(14),
fkempresa int,
foreign key (fkempresa) references Empresa(idEmpresa)
) auto_increment = 100;


insert into empresa values
 (null, 'Americanas', 500, 2500.50),
 (null, 'Carrefour', 850, 3000.00), 
 (null, 'Magzine luiza', 280, 1738.67),
 (null, 'Havan', 1000, 4000.00);
 
 insert into funcionario values 
 (null, 'Lucas', 'itaquera', 'rua maça', 5, '(11)95064-7718', '(11)98764-4456', 1),
 (null, 'Ana', 'carrao', ' rua apacurana', 45, '(11)94002-8922', '(11)96548-3698',1),
 (null, 'Tais', 'tatuape', 'rua tuiti', 77, '(11)94569-7418', '(11)94227-8063',2),
 (null, 'Pedro', 'penha', 'rua judiai', 18, '(11)95457-7718', '(11)96591-2378',2),
 (null, 'Julia', 'utinga', 'rua madri', 37 , '(11)9569-3234', '(11)98360-8328',3),
 (null, 'Joao', 'vila re', 'rua cavalcante', 153, '(11)94732-6412', '(11)97856-3241',3),
 (null,  'Leticia', 'jardins', 'rua europa',459 , '(11)96954-2598', '(11)96574-4668',4),
 (null, 'Carlos', 'guilhermina', 'rua joaoquim marra',251 , '(11)95647-3695', '(11)91874-3656',4);
 
 
 select * from empresa;
 select *from funcionario;
 
 select * from empresa, funcionario where fkempresa = idEmpresa;
 select * from empresa, funcionario where fkempresa = idEmpresa and nomeEmpresa = 'Havan';
 
 select sum(receita) as 'total_receita' from Empresa;
 
 select min(receita) as 'Receita Minima', max(receita) as 'Receita Maxima' from Empresa;
 
 select avg(receita) as 'Média da Receita' from Empresa;

 


                           