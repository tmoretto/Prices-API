INSERT INTO Produto (codigo_barras, nome) VALUES ('7894900019841', 'REFRIGERANTE COCA-COLA LATA 350ML');
INSERT INTO Produto (codigo_barras, nome) VALUES ('0000078906938', 'CERVEJA HEINEKEN 355ML');
INSERT INTO Produto (codigo_barras, nome) VALUES ('7893500020271', 'ARROZ TIO JOAO 1K');
INSERT INTO Produto (codigo_barras, nome) VALUES ('7891048050262', 'GELATINA DR.OETKER MORANGO');

INSERT INTO Fornecedor (cnpj, nome) VALUES ('94910842000124', 'Fornecedor 1');
INSERT INTO Fornecedor (cnpj, nome) VALUES ('40577668000110', 'Fornecedor 2');

INSERT INTO Preco_Produto (cnpj, codigo_barras, quantidade_minima, preco) VALUES ('94910842000124', '7894900019841', 100, 5.5);
INSERT INTO Preco_Produto (cnpj, codigo_barras, quantidade_minima, preco) VALUES ('40577668000110', '7894900019841',  50, 6.5);

INSERT INTO Preco_Produto (cnpj, codigo_barras, quantidade_minima, preco) VALUES ('94910842000124', '0000078906938',  80, 2.5);
INSERT INTO Preco_Produto (cnpj, codigo_barras, quantidade_minima, preco) VALUES ('40577668000110', '0000078906938', 100, 3.0);

INSERT INTO Preco_Produto (cnpj, codigo_barras, quantidade_minima, preco) VALUES ('94910842000124', '7891048050262', 150, 2.8);
INSERT INTO Preco_Produto (cnpj, codigo_barras, quantidade_minima, preco) VALUES ('40577668000110', '7891048050262', 200, 3.4);
