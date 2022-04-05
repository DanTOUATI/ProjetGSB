-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1
-- Généré le : mar. 05 avr. 2022 à 15:15
-- Version du serveur : 10.4.22-MariaDB
-- Version de PHP : 8.0.13

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données : `gsb_java`
--

-- --------------------------------------------------------

--
-- Structure de la table `visiteur`
--

CREATE TABLE `visiteur` (
  `id_vis` int(10) NOT NULL,
  `nom_vis` varchar(25) NOT NULL,
  `prenom_vis` varchar(50) NOT NULL,
  `adresse_vis` varchar(50) NOT NULL,
  `CP_vis` int(10) NOT NULL,
  `ville_vis` varchar(30) NOT NULL,
  `dateEmbauche_vis` date NOT NULL,
  `id_sec` int(2) NOT NULL,
  `id_labo` int(11) NOT NULL,
  `id_region` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Déchargement des données de la table `visiteur`
--

INSERT INTO `visiteur` (`id_vis`, `nom_vis`, `prenom_vis`, `adresse_vis`, `CP_vis`, `ville_vis`, `dateEmbauche_vis`, `id_sec`, `id_labo`, `id_region`) VALUES
(1, 'medhi', 'cament', '71 rue de bout', 75020, 'Paris', '2021-01-17', 1, 3, 4),
(2, 'tibi', 'benjamin', '19 rue du chateau', 34566, 'Deauville', '2021-08-02', 2, 2, 1),
(3, 'assouline', 'ilan', '240 avenue de ternes', 75017, 'Nantes', '2021-04-08', 3, 4, 3),
(4, 'cohen', 'shirel', '48 rue des pyramides', 92200, 'Neuilly-sur-Seine', '2021-01-10', 4, 3, 1),
(5, 'ibgui', 'nathan', '190 rue des rigoles', 94120, 'FONTENAY SOUS BOIS', '2021-05-15', 5, 5, 2),
(6, 'elbaze', 'Sarah', '137 avenue de laumiere', 75019, 'Epinay', '2019-09-16', 3, 2, 3),
(7, 'amouyal', 'ruben', '89 rue des joies ', 75016, 'paris', '2021-12-31', 1, 5, 1),
(8, 'didi', 'jeremy', '234 rue des fontaines', 92500, 'Sarcelles', '2020-04-02', 2, 1, 4);

--
-- Index pour les tables déchargées
--

--
-- Index pour la table `visiteur`
--
ALTER TABLE `visiteur`
  ADD PRIMARY KEY (`id_vis`),
  ADD KEY `id_labo` (`id_labo`),
  ADD KEY `id_sec` (`id_sec`),
  ADD KEY `id_region` (`id_region`);

--
-- AUTO_INCREMENT pour les tables déchargées
--

--
-- AUTO_INCREMENT pour la table `visiteur`
--
ALTER TABLE `visiteur`
  MODIFY `id_vis` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- Contraintes pour les tables déchargées
--

--
-- Contraintes pour la table `visiteur`
--
ALTER TABLE `visiteur`
  ADD CONSTRAINT `visiteur_ibfk_1` FOREIGN KEY (`id_labo`) REFERENCES `labo` (`id_labo`),
  ADD CONSTRAINT `visiteur_ibfk_2` FOREIGN KEY (`id_sec`) REFERENCES `secteur` (`id_sec`),
  ADD CONSTRAINT `visiteur_ibfk_3` FOREIGN KEY (`id_region`) REFERENCES `region` (`id_region`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
