-- SCHEMA: javax

-- DROP SCHEMA "javax" ;

-- CREATE SCHEMA "javax"
    -- AUTHORIZATION postgres;


CREATE TABLE javax.pessoa (
	IdCliente INTEGER CONSTRAINT IdClientePk PRIMARY KEY,
	NomeCliente VARCHAR(64)
);
CREATE TABLE javax.user(
	IdUser SERIAL CONSTRAINT IdUserPk PRIMARY KEY,
	IdCliente INTEGER,
	IdTipo INTEGER,
	Usuario VARCHAR(64),
	Senha VARCHAR(64)
);
CREATE TABLE javax.tipo(
	IdTipo SERIAL CONSTRAINT IdTipoPK PRIMARY KEY,
	TipoUser VARCHAR(64)
);

ALTER TABLE javax.user ADD CONSTRAINT IdCleinteFk FOREIGN KEY (IdCliente) REFERENCES javax.pessoa(IdCliente);
ALTER TABLE javax.user ADD CONSTRAINT IdTipoFk  FOREIGN KEY (IdTipo) REFERENCES javax.tipo(IdTipo);

CREATE OR REPLACE VIEW javax.downAll AS(
	
	SELECT pes.IdCliente, pes.NomeCliente , us.Usuario, us.Senha, tp.TipoUser
	FROM javax.pessoa pes
	INNER JOIN javax.user us on us.IdCliente = pes.IdCliente
	INNER JOIN javax.tipo tp on tp.IdTipo = us.IdTipo
	ORDER BY pes.IdCliente desc
);



/*
SELECT * FROM javax.downAll;

SELECT *
FROM javax.downall

SELECT *
FROM javax.pessoa pes
INNER JOIN javax.user us on pes.IdCliente = us.IdCliente
INNER JOIN javax.tipo tp on us.IdTipo = tp.Idtipo
*/

INSERT INTO javax.tipo(TipoUser) VALUES ('Administrador');
INSERT INTO javax.tipo(TipoUser) VALUES ('Funcionario');
INSERT INTO javax.tipo(TipoUser) VALUES ('Usuario');


INSERT INTO javax.pessoa (IdCliente,NomeCliente) VALUES (1,'Lucas C. Bresolino');
INSERT INTO javax.pessoa (IdCliente,NomeCliente) VALUES (2,'Hellena Gunz');
INSERT INTO javax.pessoa (IdCliente,NomeCliente) VALUES (3,'Leonildas');


INSERT INTO javax.user(IdCliente, IdTipo,Usuario,Senha) VALUES (1,1,'ChaosMind','XD');
INSERT INTO javax.user(IdCliente, IdTipo,Usuario,Senha) VALUES (2,2,'GunzAndHouse','8X');
INSERT INTO javax.user(IdCliente, IdTipo,Usuario,Senha) VALUES (3,3,'SensTime','XD');


--Aluno: Lucas C. Bresolino
--RA: 2037882


