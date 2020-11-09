create database Funcionario_Dependente;
use Funcionario_Dependente;
-- Criação da tabela funcionario

create table Funcionario (
idFunc int primary key auto_increment,
nomeFunc varchar(45),
salario decimal(7,2) check (salario > 0),
sexo char(1) check (sexo = 'm' or sexo = 'f' or sexo = 'n'),
fkSupervisor int,
foreign key (fkSupervisor) references Funcionario(idFunc)
) auto_increment = 1000;

-- criação da tabela Dependente 
create table Dependente (
fkFunc int,
foreign key (fkFunc) references Funcionario(idFunc),
idDep int,
primary key (fkFunc, idDep), -- configuração da chave primaria composta
nomeDep varchar(45),
tipoRelacao varchar(45),
dataNasc date
);

-- Inserção de valores na tab Dependente
insert into Funcionario (nomeFunc, salario) values ('Maria Sousa', 0);
insert into Funcionario (nomeFunc, sexo) values ('Maria Sousa', 'x');

-- Inserção de valores sem erro na tab Funcionario
insert into Funcionario values (null, 'Maria Sousa', 25000, 'f', null);

insert into Funcionario values 
(null, 'Claudio Silva', 15000, 'm', 1000),
(null, 'João Teixeira', 12000, 'm', 1000),
(null, 'Ana Raia', 8000, 'f', 1001),
(null, 'Adriana maia', 5000, 'f', 1002);

select * from funcionario;

insert into Dependente values
	(1000, 1, 'Paulo Sousa', 'marido', '1990-10-03'),
    (1000, 2, 'Gabriel Sousa', 'filho', '2010-11-09'),
    (1001, 1, 'Claudia Silva', 'esposa', '1990-03-10'),
    (1001, 2, 'Vitor Silva', 'filho', '2015-08-02'),
    (1001, 3, 'Joana Silva', 'filha', '2018-04-10');
    
    select * from Dependente;
    
    select * from Funcionario,Dependente where fkFunc = idFunc;
    select * from Funcionario,Dependente where fkFunc = idFunc and nomeFunc = 'Claudio Silva';
    
    -- Exibir os dados dos funcionarios e dos seus Supervisores
    -- após o where, o fkSupervisor do funcionario deve ser igua ao idFunc do Supervisor
    select * from Funcionario as f, Funcionario as s
		where f.fkSupervisor = s.idFunc
        
select * from Funcionario as f, Funcionario as s
		where f.Funciobario = s.idFunc and s.Funcionario = 'Ana Raia';
 
 -- exibir a média dos salários
 select avg(salario) as 'Media dos salarios' from Funcionario;
 select round(avg(salario),2) 'Media dos salarios' from Funcionario;
 select truncate(avg(salario),2) 'Media dos salarios' from Funcionario;
 -- 13000.009876 - truncate -> 13000.01
 -- 1300.002876 - round -> 13000.00
 -- 13000.009876 - truncate -> 13000.00


    select count(salario) as 'Quantidade de salarios abaixo de 10000'
		from Funcionario where salario <= 10000;
        
        select avg (salario) as 'Media salarios <= 10k',
			sum(salario) as 'Soma salarios <= 12k' from funcionario
			where salario <= 1000;


