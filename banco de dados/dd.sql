ESSA PARTE É NOVA (09/10/20)
select * from Aluno;

-- Como exibir dados de um intervalo de RA
select * from Aluno where ra between 1202027 and 1202093;
select * from Aluno where ra between 1202020 and 1202095;

-- Criação da tabela Curso
create table Curso (
  idCurso int primary key auto_increment,
  nomeCurso char(5),
  coordenador varchar(15)
) auto_increment=100;

-- Inserção dos dados da tabela Curso
insert into Curso (nomeCurso, coordenador) values ('ADS', 'Gerson'),
                                                  ('CCO', 'Marise'),
                                                  ('Redes', 'Alex');
-- Exibir os dados da tabela Curso
select * from Curso;

-- Exibir a descrição da tabela Aluno
desc Aluno;

-- Acrescentar a coluna fkCurso na tabela Aluno
alter table Aluno add fkCurso int;
                         
-- Exibir os dados da tabela Aluno
select * from Aluno;

-- Acrescentar a restrição de chave estrangeira na coluna fkCurso da tab Aluno
alter table Aluno add foreign key(fkCurso) references Curso(idCurso);

-- É possível acrescentar a coluna fkCurso na tabela Aluno e já
-- configurar essa coluna como foreign key num único comando alter table:
alter table Aluno add fkCurso int,
                  add foreign key(fkCurso) references Curso(idCurso);

-- Exibir a descrição da tabela Aluno
desc Aluno;

-- Atribuindo valores para a coluna fkCurso
update Aluno set fkCurso = 100 where ra <= 1202027 or ra = 1202099; 
update Aluno set fkCurso = 101 where ra in (1202079, 1202093);
update Aluno set fkCurso = 102 where ra = 1202086;

-- Exibir os dados dos alunos e dos cursos correspondentes
select * from Aluno, Curso where fkCurso = idCurso;

-- Exibir os dados dos alunos e dos cursos correspondentes sem repetir a informação do idCurso
select Aluno.*, nomeCurso, coordenador from Aluno, Curso where fkCurso = idCurso;

-- Inserção de um novo aluno, agora com a fkCurso
insert into Aluno values (1202999, 'Mickey', 'Disney', 102); 