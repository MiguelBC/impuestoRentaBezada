CREATE DATABASE  IF NOT EXISTS `impuestos` 
USE `impuestos`;

 SET NAMES utf8 ;

DROP TABLE IF EXISTS `sueldo`;

 SET character_set_client = utf8mb4 ;
CREATE TABLE `salary` (
  `idsalary` int(11) NOT NULL AUTO_INCREMENT COMMENT '\n',
  `dni` int(8) DEFAULT NULL,
  `nombre` varchar(100) DEFAULT NULL,
  `sueldo` decimal(12,2) DEFAULT NULL,
  `uit` decimal(9,4) DEFAULT NULL,
  `impuesto_total` decimal(12,2) DEFAULT NULL,
  `bruto_total` decimal(12,2) DEFAULT NULL,
  `neta_total` decimal(12,2) DEFAULT NULL,
  `retencion_mensual` int(5) DEFAULT NULL,
  `max_5` decimal(12,2) DEFAULT NULL,
  `afecto_5` decimal(12,2) DEFAULT NULL,
  `imp_5` decimal(12,2) DEFAULT NULL,
  `max_20` decimal(12,2) DEFAULT NULL,
  `afecto_20` decimal(12,2) DEFAULT NULL,
  `imp_20` decimal(12,2) DEFAULT NULL,
  `max_35` decimal(12,2) DEFAULT NULL,
  `afecto_35` decimal(12,2) DEFAULT NULL,
  `imp_35` decimal(12,2) DEFAULT NULL,
  `max_45` decimal(12,2) DEFAULT NULL,
  `afecto_45` decimal(12,2) DEFAULT NULL,
  `imp_45` decimal(12,2) DEFAULT NULL,
  `max_46` varchar(100) DEFAULT NULL,
  `afecto_46` decimal(12,2) DEFAULT NULL,
  `imp_46` decimal(12,2) DEFAULT NULL,
  `total_afecto` decimal(12,2) DEFAULT NULL,
  `descontable_uit` decimal(12,2) DEFAULT NULL,
  PRIMARY KEY (`idsueldo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


LOCK TABLES `sueldo` WRITE;

UNLOCK TABLES;

