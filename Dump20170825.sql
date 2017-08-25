CREATE DATABASE  IF NOT EXISTS `progra3db` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `progra3db`;
-- MySQL dump 10.13  Distrib 5.7.17, for Win64 (x86_64)
--
-- Host: localhost    Database: progra3db
-- ------------------------------------------------------
-- Server version	5.7.19-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `historial`
--

DROP TABLE IF EXISTS `historial`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `historial` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `Name` varchar(100) DEFAULT NULL,
  `Type` varchar(100) DEFAULT NULL,
  `Date` datetime DEFAULT NULL,
  `Speed` int(64) DEFAULT NULL,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `historial`
--

LOCK TABLES `historial` WRITE;
/*!40000 ALTER TABLE `historial` DISABLE KEYS */;
INSERT INTO `historial` VALUES (1,'MergeSort Simple','Lista Simple','2017-08-25 08:57:42',431786),(2,'MergeSort Circular','Lista Circular','2017-08-25 08:57:43',424960),(3,'HeapSort','Pila','2017-08-25 08:57:44',410282),(4,'InsertionSort','Cola','2017-08-25 08:57:45',205824),(5,'BrickSort','Lista Simple','2017-08-25 08:57:46',358058),(6,'MergeSort Circular','Lista Circular','2017-08-25 09:14:09',495274),(7,'MergeSort Circular','Lista Circular','2017-08-25 09:20:37',534187),(8,'HeapSort','Pila','2017-08-25 09:20:38',326655),(9,'InsertionSort','Cola','2017-08-25 09:20:39',203093),(10,'BrickSort','Lista Simple','2017-08-25 09:20:39',512683),(11,'MergeSort Simple','Lista Simple','2017-08-25 09:20:40',248491),(12,'MergeSort Circular','Lista Circular','2017-08-25 09:20:41',212991),(13,'HeapSort','Pila','2017-08-25 09:20:41',127658),(14,'InsertionSort','Cola','2017-08-25 09:20:42',88405),(15,'BrickSort','Lista Simple','2017-08-25 09:20:42',268288);
/*!40000 ALTER TABLE `historial` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-08-25  9:32:22
