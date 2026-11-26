-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 10, 2025 at 02:22 PM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.0.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `fixnride`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE `admin` (
  `adminID` varchar(20) NOT NULL,
  `adminName` varchar(50) NOT NULL,
  `adminUsername` varchar(30) NOT NULL,
  `adminPassword` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`adminID`, `adminName`, `adminUsername`, `adminPassword`) VALUES
('ADM-0001', 'Margaretha', 'Lois', '$2y$10$mvc2I1bzgazacMR6brRpbeBqFynLkohDutyowCmDYRaX5WKUzDRvS'),
('ADM-0002', 'Clarissa', 'Agatha', '$2y$10$F9S/ntpSdShhRdfsxuzJOOZSXp5kxIrzd3S1HvPucsq/elfhTrdE6'),
('ADM-0003', 'Margaretha', 'Natalie', '$2y$10$KpuLf/zfXxJybJmyh3Wn0.44tLu0tk5EDIAhPM9pWwlQBn5.rpeyS'),
('ADM-0004', 'Kayla Joshepine', 'kayy', '$2y$10$eB7f/KtX1dbFU38Tos27S.h48/l7CHouUqXrg2MLweUqPBqvzgYB2'),
('ADM-0005', 'Sebastianus', 'Sebas', '$2y$10$rklXkxBcRCmY2xsBnsfDTOw4kVsxx.RLzx4xJNbXAGNE5vps5P6/u');

-- --------------------------------------------------------

--
-- Table structure for table `booking`
--

CREATE TABLE `booking` (
  `bookingID` varchar(20) NOT NULL,
  `bookingDate` date NOT NULL,
  `vehicleModel` varchar(50) NOT NULL,
  `customerID` varchar(20) NOT NULL,
  `employeeID` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `booking`
--

INSERT INTO `booking` (`bookingID`, `bookingDate`, `vehicleModel`, `customerID`, `employeeID`) VALUES
('BOOK-20250527094841-', '2025-05-27', 'N/A - Pembelian Ban', 'CUST-9v2kaZZDLs', '1008'),
('BOOK-20250527101227-', '2025-05-27', 'N/A - Pembelian Ban', 'CUST-9v2kaZZDLs', '1005'),
('BOOK-20250528013438-', '2025-05-28', 'N/A - Pembelian Ban', 'CUST-J1W1K1E6FT', '1008'),
('BOOK-20250528013646-', '2025-05-28', 'N/A - Pembelian Ban', 'CUST-J1W1K1E6FT', '1007'),
('BOOK-20250528013743-', '2025-05-28', 'N/A - Pembelian Ban', 'CUST-J1W1K1E6FT', '1004'),
('BOOK-20250603103609-', '2025-06-03', 'N/A - Pembelian Baterai', 'CUST-UEyUd8iClO', '1008'),
('BOOK-20250605124319-', '2025-06-05', 'N/A - Pembelian Ban', 'CUST-DEYO1S2Mst', '1001'),
('BOOK-20250605124359-', '2025-06-05', 'N/A - Pembelian Baterai', 'CUST-DEYO1S2Mst', '1003'),
('BOOK-20250605124417-', '2025-06-05', 'N/A - Pembelian Baterai', 'CUST-DEYO1S2Mst', '1006'),
('BOOK-20250605124613-', '2025-06-05', 'N/A - Pembelian Ban', 'CUST-YtEnHTeCCs', '1004'),
('BOOK-20250605124703-', '2025-06-05', 'N/A - Pembelian Ban', 'CUST-YtEnHTeCCs', '1010'),
('BOOK-20250605124748-', '2025-06-05', 'N/A - Pembelian Baterai', 'CUST-YtEnHTeCCs', '1009'),
('BOOK-20250605125049-', '2025-06-05', 'N/A - Pembelian Baterai', 'CUST-knLfL6DmlN', '1010'),
('BOOK-20250605125104-', '2025-06-05', 'N/A - Pembelian Ban', 'CUST-knLfL6DmlN', '1002'),
('BOOK-20250605125128-', '2025-06-05', 'N/A - Pembelian Ban', 'CUST-knLfL6DmlN', '1002'),
('BOOK-20250605125302-', '2025-06-05', 'N/A - Pembelian Baterai', 'CUST-knLfL6DmlN', '1005'),
('BOOK-20250605125319-', '2025-06-05', 'N/A - Pembelian Ban', 'CUST-knLfL6DmlN', '1001'),
('BOOK-20250605125422-', '2025-06-05', 'N/A - Pembelian Ban', 'CUST-svXqK94r9K', '1007'),
('BOOK-20250605125541-', '2025-06-05', 'N/A - Pembelian Ban', 'CUST-svXqK94r9K', '1008');

-- --------------------------------------------------------

--
-- Table structure for table `bookingservice`
--

CREATE TABLE `bookingservice` (
  `bookingID` varchar(20) NOT NULL,
  `serviceID` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `bookingservice`
--

INSERT INTO `bookingservice` (`bookingID`, `serviceID`) VALUES
('BOOK-20250527094841-', 2001),
('BOOK-20250527101227-', 2001),
('BOOK-20250528013438-', 2001),
('BOOK-20250528013646-', 2001),
('BOOK-20250528013743-', 2001),
('BOOK-20250603103609-', 2004),
('BOOK-20250605124319-', 2001),
('BOOK-20250605124359-', 2004),
('BOOK-20250605124417-', 2004),
('BOOK-20250605124613-', 2001),
('BOOK-20250605124703-', 2001),
('BOOK-20250605124748-', 2004),
('BOOK-20250605125049-', 2004),
('BOOK-20250605125104-', 2001),
('BOOK-20250605125128-', 2001),
('BOOK-20250605125302-', 2004),
('BOOK-20250605125319-', 2001),
('BOOK-20250605125422-', 2001),
('BOOK-20250605125541-', 2001);

-- --------------------------------------------------------

--
-- Stand-in structure for view `currentproductstock`
-- (See below for the actual view)
--
CREATE TABLE `currentproductstock` (
`productID` int(11)
,`productName` varchar(50)
,`productPrice` decimal(10,2)
,`initialStock` int(11)
,`totalSoldQuantity` decimal(32,0)
,`remainingStock` decimal(33,0)
);

-- --------------------------------------------------------

--
-- Table structure for table `customer`
--

CREATE TABLE `customer` (
  `customerID` varchar(20) NOT NULL,
  `customerName` varchar(50) NOT NULL,
  `customerPhone` int(15) NOT NULL,
  `customerPassword` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `customer`
--

INSERT INTO `customer` (`customerID`, `customerName`, `customerPhone`, `customerPassword`) VALUES
('CUST-9v2kaZZDLs', 'Sebas Pradipa', 987654321, '$2y$10$HXZOxyS2OX/uEu492oy3AOGahi4BZWhuaL27jPWtuMcyCKImlA/hO'),
('CUST-DEYO1S2Mst', 'Kay Jose', 2147483647, '$2y$10$q03S7feUnteYHAUPU.PbdOyDZXfFEKVxodqE1zoaDS5LPFm/K/k1W'),
('CUST-J1W1K1E6FT', 'Jennifer Lung', 0, '$2y$10$D5Frn3TCNOgXRHfaN13gUeag9VVBuYLc7IQ3fEftEZkK2hNnvtM9q'),
('CUST-knLfL6DmlN', 'jane neee', 2345678, '$2y$10$dNfOjE5wjWtXa2TSSRfX.uPNavoCO1SDAE/9vm3KfgIa8NRKrtzry'),
('CUST-MawgThvNQQ', 'Patricia Arlene', 2147483647, '$2y$10$Ymjzy2Vq75xVN3wM2Cyif.KarHExsUNqZBGj1iWZ9z3sOb8WCz5C6'),
('CUST-svXqK94r9K', 'Mindy Leanor', 4567890, '$2y$10$OmQNhEyTQkMdedB.WBiRGOvpSAaEIlwYw37hW0kxZLbddoZw4ArcO'),
('CUST-UEyUd8iClO', 'Natalie Saputra', 812345678, '$2y$10$sY51Su.c22SeQdJ46NYa6eUOoYL3Q3ppsCgK.OpNLMrYGt0YDtPfu'),
('CUST-YtEnHTeCCs', 'mandy adining', 12345678, '$2y$10$Y2WH.u9lgNzGrn6MJVOam..gyV7Yoi92Qr3.sQqNFpdqWTaW4gt5y');

-- --------------------------------------------------------

--
-- Table structure for table `employee`
--

CREATE TABLE `employee` (
  `employeeID` varchar(20) NOT NULL,
  `employeeName` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `employee`
--

INSERT INTO `employee` (`employeeID`, `employeeName`) VALUES
('1001', 'Jeffrey'),
('1002', 'Ardi'),
('1003', 'Budi'),
('1004', 'Taufik'),
('1005', 'Iwan'),
('1006', 'Chandra'),
('1007', 'Wawan'),
('1008', 'Reno'),
('1009', 'Rudi'),
('1010', 'Wira');

-- --------------------------------------------------------

--
-- Stand-in structure for view `highvaluetransaction`
-- (See below for the actual view)
--
CREATE TABLE `highvaluetransaction` (
`transactionID` varchar(20)
,`transactionDate` date
,`customerName` varchar(50)
,`totalProduct` decimal(42,2)
,`totalJumlah` decimal(12,2)
);

-- --------------------------------------------------------

--
-- Table structure for table `product`
--

CREATE TABLE `product` (
  `productID` int(11) NOT NULL,
  `productName` varchar(50) NOT NULL,
  `productPrice` decimal(10,2) NOT NULL,
  `stock` int(11) NOT NULL DEFAULT 0
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `product`
--

INSERT INTO `product` (`productID`, `productName`, `productPrice`, `stock`) VALUES
(1, 'Shell Helix HX6 10W-40 4L', 224000.00, 100),
(2, 'Shell Helix HX7 5W-40 4L', 258000.00, 100),
(3, 'Castrol GTX 5W-30 3.5L', 287000.00, 100),
(4, 'Total Quartz 9000 5W-30 4L', 338000.00, 100),
(5, 'FASTRON TECHNO 10W-40 4L', 286000.00, 100),
(6, 'Mobil Super 2000 X2 10W-40 4L', 416000.00, 100),
(7, 'Castrol Magnatec 5W30 SP 4L', 538000.00, 100),
(8, 'MOTUL TEKMA TURBO POWER 15W-40 5L', 280000.00, 100),
(9, 'GS Astra Premium NS40ZL (35 Ah)', 738000.00, 99),
(10, 'Yuasa New Pafecta NS40 (32 Ah)', 709000.00, 100),
(11, 'INCOE Premium NS40ZL (35 Ah)', 675000.00, 97),
(12, 'GS Astra MF NS60 (45 Ah) ', 1100000.00, 93),
(13, 'INCOE MF NS60 (45 Ah)', 930000.00, 96),
(14, 'Amaron HiLife 55B24L (45 Ah)', 1200000.00, 198),
(15, 'SP Comfort MAXX 050+', 1500000.00, 43),
(16, 'SP TOURING T1', 850000.00, 96),
(17, 'Direzza DZ102', 1700000.00, 89),
(18, 'Potenza Adrenalin RE003', 2000000.00, 100),
(19, 'GRANDTREK AT5', 1800000.00, 76),
(20, 'GRANDTREK MT2', 1900000.00, 79),
(21, 'Normal Tow Truck', 20000.00, 0),
(22, 'Premium Tow Truck', 30000.00, 0);

-- --------------------------------------------------------

--
-- Stand-in structure for view `rekappemesanan`
-- (See below for the actual view)
--
CREATE TABLE `rekappemesanan` (
`bookingID` varchar(20)
,`bookingDate` date
,`customerName` varchar(50)
,`employeeName` varchar(50)
,`Service` mediumtext
);

-- --------------------------------------------------------

--
-- Table structure for table `service`
--

CREATE TABLE `service` (
  `serviceID` int(11) NOT NULL,
  `serviceName` varchar(50) NOT NULL,
  `servicePrice` decimal(10,2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `service`
--

INSERT INTO `service` (`serviceID`, `serviceName`, `servicePrice`) VALUES
(2001, 'Wheel And Tire Service', 0.00),
(2002, 'Oil Service', 0.00),
(2003, 'Road Rent Emergency', 0.00),
(2004, 'Battery Service', 0.00);

-- --------------------------------------------------------

--
-- Table structure for table `transactionproduct`
--

CREATE TABLE `transactionproduct` (
  `transactionID` varchar(20) NOT NULL,
  `productID` int(11) NOT NULL,
  `productQuantity` int(11) NOT NULL,
  `productSubtotal` decimal(12,2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `transactionproduct`
--

INSERT INTO `transactionproduct` (`transactionID`, `productID`, `productQuantity`, `productSubtotal`) VALUES
('TRS-20250527094841-c', 15, 10, 15000000.00),
('TRS-20250527101227-1', 19, 20, 36000000.00),
('TRS-20250528013438-e', 15, 10, 15000000.00),
('TRS-20250528013646-7', 20, 10, 19000000.00),
('TRS-20250528013743-f', 17, 11, 18700000.00),
('TRS-20250603103609-e', 9, 1, 738000.00),
('TRS-20250605124319-5', 15, 10, 15000000.00),
('TRS-20250605124359-7', 11, 3, 2025000.00),
('TRS-20250605124417-c', 13, 4, 3720000.00),
('TRS-20250605124613-c', 20, 3, 5700000.00),
('TRS-20250605124703-a', 16, 4, 3400000.00),
('TRS-20250605124748-6', 14, 2, 2400000.00),
('TRS-20250605125049-a', 12, 3, 3300000.00),
('TRS-20250605125104-c', 20, 4, 7600000.00),
('TRS-20250605125128-7', 15, 3, 4500000.00),
('TRS-20250605125302-c', 12, 4, 4400000.00),
('TRS-20250605125319-a', 19, 4, 7200000.00),
('TRS-20250605125422-e', 20, 4, 7600000.00),
('TRS-20250605125541-d', 15, 4, 6000000.00);

-- --------------------------------------------------------

--
-- Table structure for table `transaction_tbl`
--

CREATE TABLE `transaction_tbl` (
  `transactionID` varchar(20) NOT NULL,
  `transactionDate` date NOT NULL,
  `totalAmount` decimal(12,2) NOT NULL,
  `paymentMethod` varchar(30) NOT NULL,
  `paymentStatus` varchar(30) NOT NULL,
  `customerID` varchar(20) NOT NULL,
  `bookingID` varchar(20) NOT NULL,
  `adminID` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `transaction_tbl`
--

INSERT INTO `transaction_tbl` (`transactionID`, `transactionDate`, `totalAmount`, `paymentMethod`, `paymentStatus`, `customerID`, `bookingID`, `adminID`) VALUES
('TRS-20250527094841-c', '2025-05-27', 15000000.00, 'Online Payment', 'Completed', 'CUST-9v2kaZZDLs', 'BOOK-20250527094841-', 'ADM-0005'),
('TRS-20250527101227-1', '2025-05-27', 36000000.00, 'Online Payment', 'Completed', 'CUST-9v2kaZZDLs', 'BOOK-20250527101227-', 'ADM-0001'),
('TRS-20250528013438-e', '2025-05-28', 15000000.00, 'Online Payment', 'Completed', 'CUST-J1W1K1E6FT', 'BOOK-20250528013438-', 'ADM-0004'),
('TRS-20250528013646-7', '2025-05-28', 19000000.00, 'Online Payment', 'Completed', 'CUST-J1W1K1E6FT', 'BOOK-20250528013646-', 'ADM-0002'),
('TRS-20250528013743-f', '2025-05-28', 18700000.00, 'Online Payment', 'Completed', 'CUST-J1W1K1E6FT', 'BOOK-20250528013743-', 'ADM-0003'),
('TRS-20250603103609-e', '2025-06-03', 738000.00, 'Online Payment', 'Completed', 'CUST-UEyUd8iClO', 'BOOK-20250603103609-', 'ADM-0002'),
('TRS-20250605124319-5', '2025-06-05', 15000000.00, 'Online Payment', 'Completed', 'CUST-DEYO1S2Mst', 'BOOK-20250605124319-', 'ADM-0001'),
('TRS-20250605124359-7', '2025-06-05', 2025000.00, 'Online Payment', 'Completed', 'CUST-DEYO1S2Mst', 'BOOK-20250605124359-', 'ADM-0001'),
('TRS-20250605124417-c', '2025-06-05', 3720000.00, 'Online Payment', 'Completed', 'CUST-DEYO1S2Mst', 'BOOK-20250605124417-', 'ADM-0003'),
('TRS-20250605124613-c', '2025-06-05', 5700000.00, 'Online Payment', 'Completed', 'CUST-YtEnHTeCCs', 'BOOK-20250605124613-', 'ADM-0002'),
('TRS-20250605124703-a', '2025-06-05', 3400000.00, 'Online Payment', 'Completed', 'CUST-YtEnHTeCCs', 'BOOK-20250605124703-', 'ADM-0005'),
('TRS-20250605124748-6', '2025-06-05', 2400000.00, 'Online Payment', 'Completed', 'CUST-YtEnHTeCCs', 'BOOK-20250605124748-', 'ADM-0004'),
('TRS-20250605125049-a', '2025-06-05', 3300000.00, 'Online Payment', 'Completed', 'CUST-knLfL6DmlN', 'BOOK-20250605125049-', 'ADM-0001'),
('TRS-20250605125104-c', '2025-06-05', 7600000.00, 'Online Payment', 'Completed', 'CUST-knLfL6DmlN', 'BOOK-20250605125104-', 'ADM-0002'),
('TRS-20250605125128-7', '2025-06-05', 4500000.00, 'Online Payment', 'Completed', 'CUST-knLfL6DmlN', 'BOOK-20250605125128-', 'ADM-0001'),
('TRS-20250605125302-c', '2025-06-05', 4400000.00, 'Online Payment', 'Completed', 'CUST-knLfL6DmlN', 'BOOK-20250605125302-', 'ADM-0002'),
('TRS-20250605125319-a', '2025-06-05', 7200000.00, 'Online Payment', 'Completed', 'CUST-knLfL6DmlN', 'BOOK-20250605125319-', 'ADM-0001'),
('TRS-20250605125422-e', '2025-06-05', 7600000.00, 'Online Payment', 'Completed', 'CUST-svXqK94r9K', 'BOOK-20250605125422-', 'ADM-0005'),
('TRS-20250605125541-d', '2025-06-05', 6000000.00, 'Online Payment', 'Completed', 'CUST-svXqK94r9K', 'BOOK-20250605125541-', 'ADM-0005');

-- --------------------------------------------------------

--
-- Structure for view `currentproductstock`
--
DROP TABLE IF EXISTS `currentproductstock`;

CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `currentproductstock`  AS SELECT `p`.`productID` AS `productID`, `p`.`productName` AS `productName`, `p`.`productPrice` AS `productPrice`, `p`.`stock` AS `initialStock`, coalesce(sum(`tp`.`productQuantity`),0) AS `totalSoldQuantity`, `p`.`stock`- coalesce(sum(`tp`.`productQuantity`),0) AS `remainingStock` FROM (`product` `p` left join `transactionproduct` `tp` on(`p`.`productID` = `tp`.`productID`)) GROUP BY `p`.`productID`, `p`.`productName`, `p`.`productPrice`, `p`.`stock` ORDER BY `p`.`stock`- coalesce(sum(`tp`.`productQuantity`),0) ASC ;

-- --------------------------------------------------------

--
-- Structure for view `highvaluetransaction`
--
DROP TABLE IF EXISTS `highvaluetransaction`;

CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `highvaluetransaction`  AS SELECT `t`.`transactionID` AS `transactionID`, `t`.`transactionDate` AS `transactionDate`, `c`.`customerName` AS `customerName`, sum(`tp`.`productQuantity` * `p`.`productPrice`) AS `totalProduct`, `t`.`totalAmount` AS `totalJumlah` FROM (((`transaction_tbl` `t` join `customer` `c` on(`t`.`customerID` = `c`.`customerID`)) join `transactionproduct` `tp` on(`t`.`transactionID` = `tp`.`transactionID`)) join `product` `p` on(`tp`.`productID` = `p`.`productID`)) GROUP BY `t`.`transactionID`, `t`.`transactionDate`, `c`.`customerName`, `t`.`totalAmount` HAVING sum(`tp`.`productQuantity` * `p`.`productPrice`) > (select avg(`sub_tp`.`productQuantity` * `sub_p`.`productPrice`) from ((`transaction_tbl` `sub_t` join `transactionproduct` `sub_tp` on(`sub_t`.`transactionID` = `sub_tp`.`transactionID`)) join `product` `sub_p` on(`sub_tp`.`productID` = `sub_p`.`productID`))) ;

-- --------------------------------------------------------

--
-- Structure for view `rekappemesanan`
--
DROP TABLE IF EXISTS `rekappemesanan`;

CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `rekappemesanan`  AS SELECT `b`.`bookingID` AS `bookingID`, `b`.`bookingDate` AS `bookingDate`, `c`.`customerName` AS `customerName`, `e`.`employeeName` AS `employeeName`, group_concat(`s`.`serviceName` order by `s`.`serviceName` ASC separator ', ') AS `Service` FROM ((((`booking` `b` join `customer` `c` on(`b`.`customerID` = `c`.`customerID`)) join `employee` `e` on(`b`.`employeeID` = `e`.`employeeID`)) join `bookingservice` `bs` on(`b`.`bookingID` = `bs`.`bookingID`)) join `service` `s` on(`bs`.`serviceID` = `s`.`serviceID`)) GROUP BY `b`.`bookingID`, `b`.`bookingDate`, `c`.`customerName`, `e`.`employeeName` ORDER BY `b`.`bookingDate` DESC, `b`.`bookingID` ASC ;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `admin`
--
ALTER TABLE `admin`
  ADD PRIMARY KEY (`adminID`);

--
-- Indexes for table `booking`
--
ALTER TABLE `booking`
  ADD PRIMARY KEY (`bookingID`),
  ADD KEY `customerID` (`customerID`),
  ADD KEY `employeeID` (`employeeID`);

--
-- Indexes for table `bookingservice`
--
ALTER TABLE `bookingservice`
  ADD PRIMARY KEY (`bookingID`,`serviceID`),
  ADD KEY `serviceID` (`serviceID`);

--
-- Indexes for table `customer`
--
ALTER TABLE `customer`
  ADD PRIMARY KEY (`customerID`);

--
-- Indexes for table `employee`
--
ALTER TABLE `employee`
  ADD PRIMARY KEY (`employeeID`);

--
-- Indexes for table `product`
--
ALTER TABLE `product`
  ADD PRIMARY KEY (`productID`);

--
-- Indexes for table `service`
--
ALTER TABLE `service`
  ADD PRIMARY KEY (`serviceID`);

--
-- Indexes for table `transactionproduct`
--
ALTER TABLE `transactionproduct`
  ADD PRIMARY KEY (`transactionID`,`productID`),
  ADD KEY `productID` (`productID`);

--
-- Indexes for table `transaction_tbl`
--
ALTER TABLE `transaction_tbl`
  ADD PRIMARY KEY (`transactionID`),
  ADD KEY `customerID` (`customerID`),
  ADD KEY `bookingID` (`bookingID`),
  ADD KEY `adminID` (`adminID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `product`
--
ALTER TABLE `product`
  MODIFY `productID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=23;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `booking`
--
ALTER TABLE `booking`
  ADD CONSTRAINT `booking_ibfk_1` FOREIGN KEY (`customerID`) REFERENCES `customer` (`customerID`),
  ADD CONSTRAINT `booking_ibfk_2` FOREIGN KEY (`employeeID`) REFERENCES `employee` (`employeeID`);

--
-- Constraints for table `bookingservice`
--
ALTER TABLE `bookingservice`
  ADD CONSTRAINT `bookingservice_ibfk_1` FOREIGN KEY (`bookingID`) REFERENCES `booking` (`bookingID`),
  ADD CONSTRAINT `bookingservice_ibfk_2` FOREIGN KEY (`serviceID`) REFERENCES `service` (`serviceID`);

--
-- Constraints for table `transactionproduct`
--
ALTER TABLE `transactionproduct`
  ADD CONSTRAINT `transactionproduct_ibfk_1` FOREIGN KEY (`transactionID`) REFERENCES `transaction_tbl` (`transactionID`),
  ADD CONSTRAINT `transactionproduct_ibfk_2` FOREIGN KEY (`productID`) REFERENCES `product` (`productID`);

--
-- Constraints for table `transaction_tbl`
--
ALTER TABLE `transaction_tbl`
  ADD CONSTRAINT `transaction_tbl_ibfk_1` FOREIGN KEY (`customerID`) REFERENCES `customer` (`customerID`),
  ADD CONSTRAINT `transaction_tbl_ibfk_2` FOREIGN KEY (`bookingID`) REFERENCES `booking` (`bookingID`),
  ADD CONSTRAINT `transaction_tbl_ibfk_3` FOREIGN KEY (`adminID`) REFERENCES `admin` (`adminID`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
