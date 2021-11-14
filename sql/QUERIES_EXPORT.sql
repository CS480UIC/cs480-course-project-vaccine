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

-- Dump completed on 2021-11-13 22:34:11
