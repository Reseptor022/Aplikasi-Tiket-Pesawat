-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 19 Des 2022 pada 00.37
-- Versi server: 10.4.27-MariaDB
-- Versi PHP: 8.1.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `db_uas`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `loginadmin`
--

CREATE TABLE `loginadmin` (
  `username` varchar(20) NOT NULL,
  `no_wa` varchar(20) NOT NULL,
  `nama` varchar(30) NOT NULL,
  `password` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

--
-- Dumping data untuk tabel `loginadmin`
--

INSERT INTO `loginadmin` (`username`, `no_wa`, `nama`, `password`) VALUES
('', '', '', ''),
('lili', '123456789', 'Dilsa', '098765'),
('indra', 'indra', 'indra', 'indra');

-- --------------------------------------------------------

--
-- Struktur dari tabel `user`
--

CREATE TABLE `user` (
  `id_tiket` int(100) NOT NULL,
  `nama1` varchar(50) NOT NULL,
  `tujuan_keb1` varchar(30) NOT NULL,
  `jadwal_keb1` varchar(50) NOT NULL,
  `waktu_pembelian1` varchar(50) NOT NULL,
  `harga1` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

--
-- Dumping data untuk tabel `user`
--

INSERT INTO `user` (`id_tiket`, `nama1`, `tujuan_keb1`, `jadwal_keb1`, `waktu_pembelian1`, `harga1`) VALUES
(34, 'Dilsa(123456789)', 'Batam', 'kamis', 'sabtu', '500000'),
(45, 'indra(081931468226)', 'Bandung', 'senin', 'sabtu', '90000'),
(87, 'kusumah(081931468225)', 'Jakarta', 'rabu', 'selasa', '150000');

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `loginadmin`
--
ALTER TABLE `loginadmin`
  ADD PRIMARY KEY (`no_wa`);

--
-- Indeks untuk tabel `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`id_tiket`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
