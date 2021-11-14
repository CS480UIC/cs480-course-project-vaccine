-- MySQL dump 10.13  Distrib 8.0.15, for Win64 (x86_64)
--
-- Host: localhost    Database: vaccine
-- ------------------------------------------------------
-- Server version	8.0.23

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
 SET NAMES utf8 ;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Temporary view structure for view `611`
--

DROP TABLE IF EXISTS `611`;
/*!50001 DROP VIEW IF EXISTS `611`*/;
SET @saved_cs_client     = @@character_set_client;
SET character_set_client = utf8mb4;
/*!50001 CREATE VIEW `611` AS SELECT 
 1 AS `order_id`,
 1 AS `vaccine_name`,
 1 AS `country_id`,
 1 AS `quantity`,
 1 AS `order_date`*/;
SET character_set_client = @saved_cs_client;

--
-- Temporary view structure for view `612`
--

DROP TABLE IF EXISTS `612`;
/*!50001 DROP VIEW IF EXISTS `612`*/;
SET @saved_cs_client     = @@character_set_client;
SET character_set_client = utf8mb4;
/*!50001 CREATE VIEW `612` AS SELECT 
 1 AS `vaccine_name`,
 1 AS `temperature`,
 1 AS `vaccine_quantity`,
 1 AS `cost`*/;
SET character_set_client = @saved_cs_client;

--
-- Temporary view structure for view `621`
--

DROP TABLE IF EXISTS `621`;
/*!50001 DROP VIEW IF EXISTS `621`*/;
SET @saved_cs_client     = @@character_set_client;
SET character_set_client = utf8mb4;
/*!50001 CREATE VIEW `621` AS SELECT 
 1 AS `country_id`,
 1 AS `country_name`,
 1 AS `id_country_name`*/;
SET character_set_client = @saved_cs_client;

--
-- Temporary view structure for view `622`
--

DROP TABLE IF EXISTS `622`;
/*!50001 DROP VIEW IF EXISTS `622`*/;
SET @saved_cs_client     = @@character_set_client;
SET character_set_client = utf8mb4;
/*!50001 CREATE VIEW `622` AS SELECT 
 1 AS `vaccine_name`,
 1 AS `temperature`,
 1 AS `vaccine_quantity`,
 1 AS `cost`*/;
SET character_set_client = @saved_cs_client;

--
-- Temporary view structure for view `631`
--

DROP TABLE IF EXISTS `631`;
/*!50001 DROP VIEW IF EXISTS `631`*/;
SET @saved_cs_client     = @@character_set_client;
SET character_set_client = utf8mb4;
/*!50001 CREATE VIEW `631` AS SELECT 
 1 AS `vaccine_name`,
 1 AS `vaccine_quantity`*/;
SET character_set_client = @saved_cs_client;

--
-- Temporary view structure for view `632`
--

DROP TABLE IF EXISTS `632`;
/*!50001 DROP VIEW IF EXISTS `632`*/;
SET @saved_cs_client     = @@character_set_client;
SET character_set_client = utf8mb4;
/*!50001 CREATE VIEW `632` AS SELECT 
 1 AS `country_name`,
 1 AS `state_name`*/;
SET character_set_client = @saved_cs_client;

--
-- Table structure for table `country`
--

DROP TABLE IF EXISTS `country`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `country` (
  `country_id` smallint NOT NULL,
  `vaccine_name` varchar(20) NOT NULL,
  `country_name` varchar(50) NOT NULL,
  `population` int NOT NULL,
  `cost` int NOT NULL,
  `percentage_vaccinated` float NOT NULL,
  PRIMARY KEY (`country_id`,`vaccine_name`),
  KEY `vaccine_name` (`vaccine_name`),
  KEY `cou_pop` (`population`),
  CONSTRAINT `country_ibfk_1` FOREIGN KEY (`vaccine_name`) REFERENCES `vaccine` (`vaccine_name`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `country`
--

LOCK TABLES `country` WRITE;
/*!40000 ALTER TABLE `country` DISABLE KEYS */;
INSERT INTO `country` VALUES (4,'Measles','Australia',898989,34,67),(12,'Covid_19','India',19191919,1234,88),(23,'Malaria','USA',929292,2344,45),(45,'Hepatitis_A','China',98989,12,90),(77,'Covid_19','NZ',898898,98,99);
/*!40000 ALTER TABLE `country` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `entity1`
--

DROP TABLE IF EXISTS `entity1`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `entity1` (
  `username` varchar(50) NOT NULL,
  `password` varchar(50) DEFAULT NULL,
  `email` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `entity1`
--

LOCK TABLES `entity1` WRITE;
/*!40000 ALTER TABLE `entity1` DISABLE KEYS */;
/*!40000 ALTER TABLE `entity1` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `person`
--

DROP TABLE IF EXISTS `person`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `person` (
  `person_id` varchar(50) NOT NULL,
  `vaccine_name` varchar(50) NOT NULL,
  `person_zip_code` mediumint NOT NULL,
  `vaccine_received` tinyint(1) DEFAULT NULL,
  `person_name` varchar(50) DEFAULT NULL,
  `person_age` smallint DEFAULT NULL,
  PRIMARY KEY (`person_id`,`vaccine_name`),
  KEY `person_zip_code` (`person_zip_code`,`vaccine_name`),
  KEY `per_age` (`person_age`),
  CONSTRAINT `person_ibfk_1` FOREIGN KEY (`person_zip_code`, `vaccine_name`) REFERENCES `zip_code` (`zip_code`, `vaccine_name`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `person`
--

LOCK TABLES `person` WRITE;
/*!40000 ALTER TABLE `person` DISABLE KEYS */;
INSERT INTO `person` VALUES ('123456780','Covid_19',10101,1,'Nobel priset',56),('123456789','Covid_19',60607,0,'Nobel priset',56),('123456789','Measles',60607,1,'Nobel priset',56),('234567891','Hepatitis_A',90947,1,'Alan Turing',34),('234567891','Malaria',10101,0,'Alan Turing',34);
/*!40000 ALTER TABLE `person` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `state`
--

DROP TABLE IF EXISTS `state`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `state` (
  `state_id` smallint NOT NULL,
  `vaccine_name` varchar(50) NOT NULL,
  `country_id` smallint DEFAULT NULL,
  `state_name` varchar(50) DEFAULT NULL,
  `population` bigint NOT NULL,
  `percentage` float DEFAULT NULL,
  PRIMARY KEY (`state_id`,`vaccine_name`),
  KEY `country_id` (`country_id`,`vaccine_name`),
  KEY `sta_id` (`state_id`),
  CONSTRAINT `state_ibfk_1` FOREIGN KEY (`country_id`, `vaccine_name`) REFERENCES `country` (`country_id`, `vaccine_name`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `state`
--

LOCK TABLES `state` WRITE;
/*!40000 ALTER TABLE `state` DISABLE KEYS */;
INSERT INTO `state` VALUES (1,'Covid_19',12,'Jharkhand',15640321,16.32),(2,'Hepatitis_A',45,'Guangdong',1651321,97.15),(2,'Malaria',23,'Illinois',63516544,48.91),(3,'Measles',4,'Victoria',654987351,56.15),(7,'Covid_19',77,'Auckland',9846516,34.25);
/*!40000 ALTER TABLE `state` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `user` (
  `username` varchar(50) NOT NULL,
  `password` varchar(50) DEFAULT NULL,
  `email` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `vaccine`
--

DROP TABLE IF EXISTS `vaccine`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `vaccine` (
  `vaccine_name` varchar(20) NOT NULL,
  `temperature` float NOT NULL,
  `vaccine_quantity` int NOT NULL,
  `cost` double NOT NULL,
  PRIMARY KEY (`vaccine_name`),
  KEY `vac_cost` (`cost`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `vaccine`
--

LOCK TABLES `vaccine` WRITE;
/*!40000 ALTER TABLE `vaccine` DISABLE KEYS */;
INSERT INTO `vaccine` VALUES ('Covid_19',4,5000,1000),('Hepatitis_A',-20,1999,999),('Malaria',15,2000,1234),('Measles',-8,439478,3737),('Mumps',-2,292929,100);
/*!40000 ALTER TABLE `vaccine` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `vaccine_order`
--

DROP TABLE IF EXISTS `vaccine_order`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `vaccine_order` (
  `order_id` mediumint NOT NULL,
  `vaccine_name` varchar(20) NOT NULL,
  `country_id` smallint DEFAULT NULL,
  `quantity` int NOT NULL,
  `order_date` date NOT NULL,
  PRIMARY KEY (`order_id`,`vaccine_name`),
  KEY `country_id` (`country_id`,`vaccine_name`),
  KEY `vaccine_name` (`vaccine_name`),
  KEY `vorder_id` (`order_id`),
  CONSTRAINT `vaccine_order_ibfk_1` FOREIGN KEY (`country_id`, `vaccine_name`) REFERENCES `country` (`country_id`, `vaccine_name`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `vaccine_order_ibfk_2` FOREIGN KEY (`vaccine_name`) REFERENCES `vaccine` (`vaccine_name`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `vaccine_order`
--

LOCK TABLES `vaccine_order` WRITE;
/*!40000 ALTER TABLE `vaccine_order` DISABLE KEYS */;
/*!40000 ALTER TABLE `vaccine_order` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `zip_code`
--

DROP TABLE IF EXISTS `zip_code`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `zip_code` (
  `zip_code` mediumint NOT NULL,
  `vaccine_name` varchar(50) NOT NULL,
  `state_id` smallint NOT NULL,
  `percentage` float NOT NULL,
  `num_vaccination_center` smallint NOT NULL,
  PRIMARY KEY (`zip_code`,`vaccine_name`),
  KEY `state_id` (`state_id`,`vaccine_name`),
  KEY `zip_id` (`zip_code`),
  CONSTRAINT `zip_code_ibfk_1` FOREIGN KEY (`state_id`, `vaccine_name`) REFERENCES `state` (`state_id`, `vaccine_name`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `zip_code`
--

LOCK TABLES `zip_code` WRITE;
/*!40000 ALTER TABLE `zip_code` DISABLE KEYS */;
INSERT INTO `zip_code` VALUES (10101,'Covid_19',7,15.79,64),(10101,'Malaria',2,98.15,64),(60607,'Covid_19',1,56.19,31),(60607,'Measles',3,37.45,19),(90947,'Hepatitis_A',2,97.45,31);
/*!40000 ALTER TABLE `zip_code` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Final view structure for view `611`
--

/*!50001 DROP VIEW IF EXISTS `611`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8mb4 */;
/*!50001 SET character_set_results     = utf8mb4 */;
/*!50001 SET collation_connection      = utf8mb4_0900_ai_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`%` SQL SECURITY DEFINER */
/*!50001 VIEW `611` AS select `vaccine_order`.`order_id` AS `order_id`,`vaccine_order`.`vaccine_name` AS `vaccine_name`,`vaccine_order`.`country_id` AS `country_id`,`vaccine_order`.`quantity` AS `quantity`,`vaccine_order`.`order_date` AS `order_date` from `vaccine_order` where (`vaccine_order`.`quantity` > 100) order by `vaccine_order`.`country_id` */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;

--
-- Final view structure for view `612`
--

/*!50001 DROP VIEW IF EXISTS `612`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8mb4 */;
/*!50001 SET character_set_results     = utf8mb4 */;
/*!50001 SET collation_connection      = utf8mb4_0900_ai_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`%` SQL SECURITY DEFINER */
/*!50001 VIEW `612` AS select `vaccine`.`vaccine_name` AS `vaccine_name`,`vaccine`.`temperature` AS `temperature`,`vaccine`.`vaccine_quantity` AS `vaccine_quantity`,`vaccine`.`cost` AS `cost` from `vaccine` where (`vaccine`.`cost` > 1000) order by `vaccine`.`cost` */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;

--
-- Final view structure for view `621`
--

/*!50001 DROP VIEW IF EXISTS `621`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8mb4 */;
/*!50001 SET character_set_results     = utf8mb4 */;
/*!50001 SET collation_connection      = utf8mb4_0900_ai_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`%` SQL SECURITY DEFINER */
/*!50001 VIEW `621` AS select `country`.`country_id` AS `country_id`,`country`.`country_name` AS `country_name`,concat(`country`.`country_id`,' ',`country`.`country_name`) AS `id_country_name` from `country` group by `country`.`country_id` */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;

--
-- Final view structure for view `622`
--

/*!50001 DROP VIEW IF EXISTS `622`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8mb4 */;
/*!50001 SET character_set_results     = utf8mb4 */;
/*!50001 SET collation_connection      = utf8mb4_0900_ai_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`%` SQL SECURITY DEFINER */
/*!50001 VIEW `622` AS select `vaccine`.`vaccine_name` AS `vaccine_name`,`vaccine`.`temperature` AS `temperature`,`vaccine`.`vaccine_quantity` AS `vaccine_quantity`,`vaccine`.`cost` AS `cost` from `vaccine` where (abs(`vaccine`.`cost`) > 1000) */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;

--
-- Final view structure for view `631`
--

/*!50001 DROP VIEW IF EXISTS `631`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8mb4 */;
/*!50001 SET character_set_results     = utf8mb4 */;
/*!50001 SET collation_connection      = utf8mb4_0900_ai_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`%` SQL SECURITY DEFINER */
/*!50001 VIEW `631` AS select `vaccine`.`vaccine_name` AS `vaccine_name`,`vaccine`.`vaccine_quantity` AS `vaccine_quantity` from `vaccine` where (`vaccine`.`temperature` > (select avg(`vaccine`.`temperature`) from `vaccine`)) */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;

--
-- Final view structure for view `632`
--

/*!50001 DROP VIEW IF EXISTS `632`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8mb4 */;
/*!50001 SET character_set_results     = utf8mb4 */;
/*!50001 SET collation_connection      = utf8mb4_0900_ai_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`%` SQL SECURITY DEFINER */
/*!50001 VIEW `632` AS select `a`.`country_name` AS `country_name`,`b`.`state_name` AS `state_name` from (`country` `a` join `state` `b` on((`a`.`country_id` = `b`.`country_id`))) */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-11-13 22:29:21
