# springEmail
springboot项目（邮件群发器）

# 主要功能
    实现分组的私人邮件群发器
# 数据库建表语句
-- ----------------------------
## Table structure for data_email
-- ----------------------------
    DROP TABLE IF EXISTS `data_email`;
    CREATE TABLE `data_email`  (
      `id` int NOT NULL AUTO_INCREMENT,
      `Email_number` varchar(22) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
      `friend_name` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
      `My_group` varchar(12) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
      `extends_gird` varchar(12) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
      PRIMARY KEY (`id`) USING BTREE,
      UNIQUE INDEX `data_email_id_uindex`(`id`) USING BTREE
    ) ENGINE = InnoDB AUTO_INCREMENT = 20 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;
# 运行
    java -jar [springboot运行出来的jar包]
