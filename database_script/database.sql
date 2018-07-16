-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Server version:               5.7.12-log - MySQL Community Server (GPL)
-- Server OS:                    Win64
-- HeidiSQL Version:             8.3.0.4694
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;

-- Dumping database structure for db_student
CREATE DATABASE IF NOT EXISTS `db_student` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `db_student`;


-- Dumping structure for table db_student.info
CREATE TABLE IF NOT EXISTS `info` (
  `rollnumber` int(11) NOT NULL,
  `firstname` varchar(255) DEFAULT NULL,
  `lastname` varchar(255) DEFAULT NULL,
  `city` varchar(255) DEFAULT NULL,
  `college` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`rollnumber`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- Dumping data for table db_student.info: 1 rows
/*!40000 ALTER TABLE `info` DISABLE KEYS */;
INSERT INTO `info` (`rollnumber`, `firstname`, `lastname`, `city`, `college`) VALUES
	(4, 'Mahesh', 'Deore', 'Nashik', 'PQR'),
	(1, 'Suraj', 'Soma', 'Aurangabad', 'JNEC');
/*!40000 ALTER TABLE `info` ENABLE KEYS */;
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
