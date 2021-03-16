CREATE TABLE `admin`  (
  `admin_id` int(11) NOT NULL AUTO_INCREMENT,
  `admin_type` int(255) NOT NULL DEFAULT 0,
  `user_name` varchar(255) NOT NULL,
  `real_name` varchar(255) NULL,
  `phone` varchar(255) NULL,
  `password` varchar(255) NOT NULL,
  `sex` varchar(255) NULL,
  `birthday` date NULL,
  `build_time` datetime(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0),
  `state` int(255) NOT NULL DEFAULT 1,
  `note` varchar(255) NULL,
  PRIMARY KEY (`admin_id`)
) ENGINE = InnoDB AUTO_INCREMENT = 1025 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = DYNAMIC;

CREATE TABLE `dish`  (
  `dish_id` int(11) NOT NULL AUTO_INCREMENT,
  `dish_name` varchar(255) NOT NULL,
  `dish_price` decimal(10, 2) NULL,
  `discount` decimal(10, 2) NULL,
  `description` varchar(255) NULL,
  `type` varchar(255) NULL,
  `quantity` int(255) NULL DEFAULT 0,
  `state` int(255) NOT NULL DEFAULT 0,
  `picture` varchar(255) NULL,
  PRIMARY KEY (`dish_id`)
) ENGINE = InnoDB AUTO_INCREMENT = 1025 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = DYNAMIC;

CREATE TABLE `order`  (
  `order_id` int(11) NOT NULL AUTO_INCREMENT,
  `build_time` datetime(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0),
  `settlement_time` datetime(0) NULL,
  `user_id` int(11) NOT NULL,
  `table_id` int(11) NOT NULL DEFAULT 0,
  `state` int(255) NOT NULL DEFAULT 0,
  `total_price` decimal(10, 2) NULL,
  `discount` decimal(10, 2) NULL,
  `note` varchar(255) NULL,
  `user_name` varchar(255) NULL,
  PRIMARY KEY (`order_id`),
  INDEX `user_id`(`user_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1025 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = DYNAMIC;

CREATE TABLE `order_dish`  (
  `order_dish_id` int(11) NOT NULL AUTO_INCREMENT,
  `order_id` int(11) NOT NULL,
  `dish_id` int(11) NOT NULL,
  `dish_num` int(0) NOT NULL DEFAULT 0,
  `dish_state` int(255) NOT NULL DEFAULT 0,
  `note` varchar(255) NULL,
  `dish_name` varchar(255) NULL,
  `dish_price` decimal(10, 2) NULL,
  PRIMARY KEY (`order_dish_id`),
  INDEX `order_id`(`order_id`) USING BTREE,
  INDEX `dish_id`(`dish_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1025 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = DYNAMIC;

CREATE TABLE `user`  (
  `user_id` int(11) NOT NULL AUTO_INCREMENT,
  `user_name` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  `phone` varchar(255) NULL,
  `sex` varchar(255) NULL,
  `birthday` date NULL,
  `build_time` datetime(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0),
  `state` int(255) NOT NULL DEFAULT 1,
  `picture` varchar(255) NULL,
  `note` varchar(255) NULL,
  PRIMARY KEY (`user_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1025 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

ALTER TABLE `order` ADD CONSTRAINT `user_id` FOREIGN KEY (`user_id`) REFERENCES `user` (`user_id`) ON DELETE RESTRICT ON UPDATE RESTRICT;
ALTER TABLE `order_dish` ADD CONSTRAINT `order_id` FOREIGN KEY (`order_id`) REFERENCES `order` (`order_id`) ON DELETE RESTRICT ON UPDATE RESTRICT;
ALTER TABLE `order_dish` ADD CONSTRAINT `dish_id` FOREIGN KEY (`dish_id`) REFERENCES `dish` (`dish_id`) ON DELETE RESTRICT ON UPDATE RESTRICT;

