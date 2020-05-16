-- MySQL dump 10.13  Distrib 8.0.20, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: kodilla_course
-- ------------------------------------------------------
-- Server version	8.0.19

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `issues`
--

DROP TABLE IF EXISTS `issues`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `issues` (
  `ID` bigint unsigned NOT NULL AUTO_INCREMENT,
  `ISSUESLIST_ID` bigint unsigned NOT NULL,
  `SUMMARY` varchar(100) DEFAULT NULL,
  `DESCRIPTION` varchar(1024) DEFAULT NULL,
  `USER_ID_ASSIGNEDTO` bigint unsigned NOT NULL,
  PRIMARY KEY (`ID`),
  UNIQUE KEY `ID` (`ID`),
  KEY `ISSUESLIST_ID` (`ISSUESLIST_ID`),
  KEY `USER_ID_ASSIGNEDTO` (`USER_ID_ASSIGNEDTO`),
  CONSTRAINT `issues_ibfk_1` FOREIGN KEY (`ISSUESLIST_ID`) REFERENCES `issueslist` (`ID`),
  CONSTRAINT `issues_ibfk_2` FOREIGN KEY (`USER_ID_ASSIGNEDTO`) REFERENCES `users` (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `issues`
--

LOCK TABLES `issues` WRITE;
/*!40000 ALTER TABLE `issues` DISABLE KEYS */;
INSERT INTO `issues` VALUES (1,1,'Pranie','Wlozyc rzeczy do pralki',1),(2,1,'Prasowanie','Uprasować rzeczy',1),(3,1,'Podlewanie','Podlać kwiatki',1),(4,1,'Grzybobranie','iśc na grzyby',1),(5,1,'Czytanie','przeczytać książkę',1),(6,2,'Angielski','Zrobić pracę domową z angielskiego',1),(7,2,'Kodilla moduł 16','Skończyć Moduł 16',1),(8,2,'Git','Skończyć kurs',1),(9,2,'java fx','Skończyć kurs javy fx na yt',1),(10,2,'kółko i krzyżyk','skończyć projekt gry',1),(11,3,'Kodilla moduł 11','Skończyć Moduł 11',1),(12,3,'Kodilla moduł 12','Skończyć Moduł 12',1),(13,3,'Kodilla moduł 13','Skończyć Moduł 13',1),(14,3,'Kodilla moduł 14','Skończyć Moduł 14',1),(15,3,'Kodilla moduł 15','Skończyć Moduł 15',1);
/*!40000 ALTER TABLE `issues` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-05-16 13:21:55
