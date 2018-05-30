/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50717
Source Host           : localhost:3306
Source Database       : test

Target Server Type    : MYSQL
Target Server Version : 50717
File Encoding         : 65001

Date: 2018-05-04 21:16:23
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `student`
-- ----------------------------
DROP TABLE IF EXISTS `student`;
CREATE TABLE `student` (
  `id` int(5) NOT NULL AUTO_INCREMENT,
  `name` varchar(10) DEFAULT NULL,
  `age` int(5) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=37 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of student
-- ----------------------------
INSERT INTO `student` VALUES ('1', '张三', '21');
INSERT INTO `student` VALUES ('2', '李四', '22');
INSERT INTO `student` VALUES ('3', '王五', '23');
INSERT INTO `student` VALUES ('4', '赵六', '24');
INSERT INTO `student` VALUES ('5', '大张三', '23');
INSERT INTO `student` VALUES ('6', '小张三', '23');
INSERT INTO `student` VALUES ('8', '张三三', '23');
INSERT INTO `student` VALUES ('11', '赵四', '24');
