INSERT INTO Produto (codigo_barras, nome) VALUES ('7894900019841', 'REFRIGERANTE COCA-COLA LATA 350ML');
INSERT INTO Produto (codigo_barras, nome) VALUES ('0000078906938', 'CERVEJA HEINEKEN 355ML');
INSERT INTO Produto (codigo_barras, nome) VALUES ('7893500020271', 'ARROZ TIO JOAO 1K');
INSERT INTO Produto (codigo_barras, nome) VALUES ('7891048050262', 'GELATINA DR.OETKER MORANGO');

INSERT INTO Fornecedor (cnpj, nome) VALUES ('94910842000124', 'Fornecedor 1');
INSERT INTO Fornecedor (cnpj, nome) VALUES ('40577668000110', 'Fornecedor 2');

INSERT INTO Preco_Produto (cnpj, codigo_barras, quantidade_minima, preco) VALUES ('94910842000124', '7894900019841', 20, 5.5);
INSERT INTO Preco_Produto (cnpj, codigo_barras, quantidade_minima, preco) VALUES ('94910842000124', '7894900019841', 1, 10.5);
INSERT INTO Preco_Produto (cnpj, codigo_barras, quantidade_minima, preco) VALUES ('40577668000110', '7894900019841', 10, 6.5);

INSERT INTO Preco_Produto (cnpj, codigo_barras, quantidade_minima, preco) VALUES ('94910842000124', '0000078906938', 5, 2.5);
INSERT INTO Preco_Produto (cnpj, codigo_barras, quantidade_minima, preco) VALUES ('40577668000110', '0000078906938', 1, 3.0);
INSERT INTO Preco_Produto (cnpj, codigo_barras, quantidade_minima, preco) VALUES ('40577668000110', '0000078906938', 10, 2.0);

INSERT INTO Preco_Produto (cnpj, codigo_barras, quantidade_minima, preco) VALUES ('94910842000124', '7891048050262', 1, 3.5);
INSERT INTO Preco_Produto (cnpj, codigo_barras, quantidade_minima, preco) VALUES ('94910842000124', '7891048050262', 15, 2.8);
INSERT INTO Preco_Produto (cnpj, codigo_barras, quantidade_minima, preco) VALUES ('40577668000110', '7891048050262', 20, 3.0);
INSERT INTO Preco_Produto (cnpj, codigo_barras, quantidade_minima, preco) VALUES ('40577668000110', '7891048050262', 5, 5.4);
