--資料庫
CREATE DATABASE IF NOT EXISTS gooseTrip; /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;

--資料表
CREATE TABLE IF NOT EXISTS person_info (
  id varchar(45) NOT NULL,
  user_name varchar(45) NOT NULL,
  user_age int DEFAULT '0',
  city varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;