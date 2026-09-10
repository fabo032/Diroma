-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Tempo de geração: 10/09/2026 às 02:04
-- Versão do servidor: 10.4.32-MariaDB
-- Versão do PHP: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `diroma`
--

-- --------------------------------------------------------

--
-- Estrutura para tabela `produtos`
--

CREATE TABLE `produtos` (
  `id_` int(11) NOT NULL,
  `tipo_` varchar(30) NOT NULL,
  `produto_` varchar(100) NOT NULL,
  `quantidade_` int(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Despejando dados para a tabela `produtos`
--

INSERT INTO `produtos` (`id_`, `tipo_`, `produto_`, `quantidade_`) VALUES
(1, 'Bebida', 'Coca-Cola 2L', 25),
(2, 'Bebida', 'Suco de Laranja 1L', 18),
(3, 'Alimento', 'Arroz 5kg', 30),
(4, 'Alimento', 'Feijão 1kg', 22),
(5, 'Alimento', 'Macarrão 500g', 35),
(6, 'Limpeza', 'Detergente 500ml', 40),
(7, 'Limpeza', 'Sabão em Pó 1kg', 15),
(8, 'Higiene', 'Shampoo 350ml', 20),
(9, 'Higiene', 'Sabonete 90g', 50),
(10, 'Eletrônico', 'Fone de Ouvido', 12),
(11, 'Eletrônico', 'Teclado USB', 8),
(12, 'Papelaria', 'Caderno 100 folhas', 27),
(13, 'Papelaria', 'Caneta Azul', 60),
(14, 'Alimento', 'Biscoito Cream Cracker', 32),
(15, 'Bebida', 'Água Mineral 500ml', 45),
(16, 'EPI', 'plug auricular', 5);

--
-- Índices para tabelas despejadas
--

--
-- Índices de tabela `produtos`
--
ALTER TABLE `produtos`
  ADD PRIMARY KEY (`id_`);

--
-- AUTO_INCREMENT para tabelas despejadas
--

--
-- AUTO_INCREMENT de tabela `produtos`
--
ALTER TABLE `produtos`
  MODIFY `id_` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=17;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
