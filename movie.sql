/*
Navicat MySQL Data Transfer

Source Server         : root
Source Server Version : 50717
Source Host           : localhost:3306
Source Database       : movie

Target Server Type    : MYSQL
Target Server Version : 50717
File Encoding         : 65001

Date: 2020-03-19 18:53:36
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for catelog
-- ----------------------------
DROP TABLE IF EXISTS `catelog`;
CREATE TABLE `catelog` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `catelog_name` varchar(255) DEFAULT NULL,
  `catelog_desc` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of catelog
-- ----------------------------
INSERT INTO `catelog` VALUES ('1', '动作片', null);
INSERT INTO `catelog` VALUES ('2', '爱情片', null);
INSERT INTO `catelog` VALUES ('3', '恐怖片', null);
INSERT INTO `catelog` VALUES ('4', '历史片', null);
INSERT INTO `catelog` VALUES ('5', '科幻片', null);
INSERT INTO `catelog` VALUES ('6', '动画片', null);
INSERT INTO `catelog` VALUES ('7', '伦理片', null);
INSERT INTO `catelog` VALUES ('8', '悬疑片', null);
INSERT INTO `catelog` VALUES ('9', '战争片', null);
INSERT INTO `catelog` VALUES ('10', '灾难片', null);
INSERT INTO `catelog` VALUES ('11', '喜剧片', null);
INSERT INTO `catelog` VALUES ('12', '警匪片', null);
INSERT INTO `catelog` VALUES ('13', '冒险片', null);
INSERT INTO `catelog` VALUES ('14', '武侠片', null);
INSERT INTO `catelog` VALUES ('15', '灾难片', null);
INSERT INTO `catelog` VALUES ('16', '犯罪片', null);

-- ----------------------------
-- Table structure for movie
-- ----------------------------
DROP TABLE IF EXISTS `movie`;
CREATE TABLE `movie` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `movie_name` varchar(255) DEFAULT NULL,
  `movie_desc` text,
  `movie_pic` varchar(255) DEFAULT NULL,
  `movie_flag` int(11) DEFAULT NULL,
  `movie_catelog_id` int(11) NOT NULL,
  `movie_zone_id` int(11) NOT NULL,
  `movie_time` date DEFAULT NULL,
  `movie_yingting_id` int(11) NOT NULL,
  `movie_price` int(11) NOT NULL,
  `movie_piaofang` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `movie_catelog_id` (`movie_catelog_id`),
  KEY `movie_zone_id` (`movie_zone_id`),
  KEY `movie_yingting_id` (`movie_yingting_id`),
  CONSTRAINT `movie_ibfk_1` FOREIGN KEY (`movie_catelog_id`) REFERENCES `catelog` (`id`),
  CONSTRAINT `movie_ibfk_4` FOREIGN KEY (`movie_zone_id`) REFERENCES `zone` (`id`),
  CONSTRAINT `movie_ibfk_5` FOREIGN KEY (`movie_yingting_id`) REFERENCES `yingting` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of movie
-- ----------------------------
INSERT INTO `movie` VALUES ('1', '神奇女侠', '好看啊', '/img/qiantai/1.png', '1', '1', '1', '2020-02-02', '1', '120', '20');
INSERT INTO `movie` VALUES ('2', '超能灭赌师', null, '/img/qiantai/超能灭赌师.png', '1', '1', '1', '2020-02-01', '1', '98', '10');
INSERT INTO `movie` VALUES ('3', '新灰姑娘', null, '/img/qiantai/新灰姑娘.png', '1', '1', '1', '2020-02-03', '1', '92', '0');
INSERT INTO `movie` VALUES ('12', '圆梦巨人', '好看', '/img/qiantai/圆梦巨人.png', '1', '5', '2', '2020-02-03', '1', '63', null);
INSERT INTO `movie` VALUES ('13', '大嫂', '好看', '/img/qiantai/大嫂.png', '1', '2', '1', '2020-02-03', '1', '120', null);
INSERT INTO `movie` VALUES ('14', '画皮新娘', '发', '/img/qiantai/画皮新娘.png', '1', '3', '1', '2020-02-03', '1', '78', null);
INSERT INTO `movie` VALUES ('15', '我们的爱情', '的', '/img/qiantai/我们的爱情.png', '1', '1', '1', '2020-02-03', '1', '110', null);

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_age` int(11) DEFAULT NULL,
  `user_flag` int(11) DEFAULT NULL,
  `user_name` varchar(255) DEFAULT NULL,
  `user_password` varchar(255) DEFAULT NULL,
  `user_tel` varchar(255) DEFAULT NULL,
  `user_email` varchar(255) DEFAULT NULL,
  `user_sex` varchar(255) DEFAULT NULL,
  `user_qq` varchar(255) DEFAULT NULL,
  `user_img` varchar(255) DEFAULT NULL,
  `user_realName` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', '23', '1', 'wang', '123456', '18333603843', null, '男', '1506773471', null, null);
INSERT INTO `user` VALUES ('2', '23', '1', 'zzzz', '123456', '18333603813', '1506773471@qq.com', '男', '1506773471', '/img/qiantai/login.png', '泽泽');

-- ----------------------------
-- Table structure for yingting
-- ----------------------------
DROP TABLE IF EXISTS `yingting`;
CREATE TABLE `yingting` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `number` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of yingting
-- ----------------------------
INSERT INTO `yingting` VALUES ('1', '1');
INSERT INTO `yingting` VALUES ('2', '2');
INSERT INTO `yingting` VALUES ('3', '3');
INSERT INTO `yingting` VALUES ('4', '4');
INSERT INTO `yingting` VALUES ('5', '5');
INSERT INTO `yingting` VALUES ('6', '6');
INSERT INTO `yingting` VALUES ('7', '7');
INSERT INTO `yingting` VALUES ('8', '8');
INSERT INTO `yingting` VALUES ('9', '9');
INSERT INTO `yingting` VALUES ('10', '10');

-- ----------------------------
-- Table structure for zone
-- ----------------------------
DROP TABLE IF EXISTS `zone`;
CREATE TABLE `zone` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `zone_name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of zone
-- ----------------------------
INSERT INTO `zone` VALUES ('1', '美国');
INSERT INTO `zone` VALUES ('2', '法国');
INSERT INTO `zone` VALUES ('3', '英国');
INSERT INTO `zone` VALUES ('4', '德国');
INSERT INTO `zone` VALUES ('5', '中国');
INSERT INTO `zone` VALUES ('6', '韩国');
INSERT INTO `zone` VALUES ('7', '日本');
