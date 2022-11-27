/*
 Navicat Premium Data Transfer

 Source Server         : b8of1k7Mep
 Source Server Type    : MySQL
 Source Server Version : 80013
 Source Host           : remotemysql.com:3306
 Source Schema         : b8of1k7Mep

 Target Server Type    : MySQL
 Target Server Version : 80013
 File Encoding         : 65001

 Date: 27/11/2022 18:54:29
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for DeTai
-- ----------------------------
DROP TABLE IF EXISTS `DeTai`;
CREATE TABLE `DeTai`  (
  `maDeTai` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `loaiDeTai` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL,
  `maNganh` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL,
  `gvHuongDan` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL,
  `gvPhanBien` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL,
  `maSinhVien` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL,
  PRIMARY KEY (`maDeTai`) USING BTREE,
  INDEX `loaiDeTai`(`loaiDeTai`) USING BTREE,
  INDEX `maNganh`(`maNganh`) USING BTREE,
  INDEX `gvHuongDan`(`gvHuongDan`) USING BTREE,
  INDEX `gvPhanBien`(`gvPhanBien`) USING BTREE,
  INDEX `maDeTai`(`maDeTai`) USING BTREE,
  INDEX `maDeTai_2`(`maDeTai`) USING BTREE,
  CONSTRAINT `DeTai_ibfk_1` FOREIGN KEY (`loaiDeTai`) REFERENCES `LoaiDeTai` (`maloaidetai`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `DeTai_ibfk_2` FOREIGN KEY (`maNganh`) REFERENCES `Nganh` (`manganh`) ON DELETE RESTRICT ON UPDATE RESTRICT,
	  CONSTRAINT `DeTai_ibfk_5` FOREIGN KEY (`maSinhVien`) REFERENCES `Users` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT,

  CONSTRAINT `DeTai_ibfk_3` FOREIGN KEY (`gvHuongDan`) REFERENCES `Users` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `DeTai_ibfk_4` FOREIGN KEY (`gvPhanBien`) REFERENCES `Users` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_unicode_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of DeTai
-- ----------------------------
INSERT INTO `DeTai` VALUES ('DT001', 'DACNTT', 'CNTT', '2', '3', '4');
INSERT INTO `DeTai` VALUES ('DT002', 'KHKT', 'CNTT', '3', '2', '4');

-- ----------------------------
-- Table structure for HoiDong
-- ----------------------------
DROP TABLE IF EXISTS `HoiDong`;
CREATE TABLE `HoiDong`  (
  `maDeTai` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `maGiangVien` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  PRIMARY KEY (`maGiangVien`, `maDeTai`) USING BTREE,
  INDEX `maDeTai`(`maDeTai`) USING BTREE,
  CONSTRAINT `HoiDong_ibfk_1` FOREIGN KEY (`maGiangVien`) REFERENCES `Users` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `HoiDong_ibfk_2` FOREIGN KEY (`maDeTai`) REFERENCES `DeTai` (`madetai`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_unicode_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of HoiDong
-- ----------------------------
INSERT INTO `HoiDong` VALUES ('DT001', '1');
INSERT INTO `HoiDong` VALUES ('DT001', '2');
INSERT INTO `HoiDong` VALUES ('DT001', '3');
INSERT INTO `HoiDong` VALUES ('DT002', '2');
INSERT INTO `HoiDong` VALUES ('DT002', '3');

-- ----------------------------
-- Table structure for LoaiDeTai
-- ----------------------------
DROP TABLE IF EXISTS `LoaiDeTai`;
CREATE TABLE `LoaiDeTai`  (
  `maLoaiDeTai` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `tenLoaiDeTai` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL,
  `hocKy` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL,
  `nam` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL,
  PRIMARY KEY (`maLoaiDeTai`) USING BTREE,
  INDEX `maLoaiDeTai`(`maLoaiDeTai`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_unicode_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of LoaiDeTai
-- ----------------------------
INSERT INTO `LoaiDeTai` VALUES ('DACNTT', 'Đồ án CNTT', '1', '2022');
INSERT INTO `LoaiDeTai` VALUES ('DAECO', 'Đồ án khoa Kinh Tế', '1 ', '2022');
INSERT INTO `LoaiDeTai` VALUES ('KHKT', 'Khoa học kỹ thuật', '2 ', '2022');

-- ----------------------------
-- Table structure for Nganh
-- ----------------------------
DROP TABLE IF EXISTS `Nganh`;
CREATE TABLE `Nganh`  (
  `maNganh` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `tenNganh` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL,
  PRIMARY KEY (`maNganh`) USING BTREE,
  INDEX `maNganh`(`maNganh`) USING BTREE,
  INDEX `maNganh_2`(`maNganh`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_unicode_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of Nganh
-- ----------------------------
INSERT INTO `Nganh` VALUES ('0', 'Khác');
INSERT INTO `Nganh` VALUES ('CNTT', 'Công nghệ thông tin');
INSERT INTO `Nganh` VALUES ('ECO', 'Kinh tế');
INSERT INTO `Nganh` VALUES ('EDU', 'Giáo dục');
INSERT INTO `Nganh` VALUES ('MKT', 'Marketing');

-- ----------------------------
-- Table structure for Users
-- ----------------------------
DROP TABLE IF EXISTS `Users`;
CREATE TABLE `Users`  (
  `Id` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `maNganh` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL,
  `password` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL,
  `fullname` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL,
  `email` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL,
  `birthday` datetime NULL DEFAULT NULL,
  `schoolyear` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL,
  `phone` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL,
  `role` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL,
  PRIMARY KEY (`Id`) USING BTREE,
  INDEX `fk_Users_Nganh`(`maNganh`) USING BTREE,
  INDEX `Id`(`Id`) USING BTREE,
  INDEX `Id_2`(`Id`) USING BTREE,
  INDEX `Id_3`(`Id`) USING BTREE,
  CONSTRAINT `fk_Users_Nganh` FOREIGN KEY (`maNganh`) REFERENCES `Nganh` (`manganh`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_unicode_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of Users
-- ----------------------------
INSERT INTO `Users` VALUES ('1', '0', '1', 'Admin', NULL, NULL, NULL, NULL, 'Admin');
INSERT INTO `Users` VALUES ('2', 'CNTT', '2', 'Trưởng bộ môn CNTT', NULL, NULL, NULL, NULL, 'TruongBoMon');
INSERT INTO `Users` VALUES ('3', 'CNTT', '3', 'Giảng Viên', NULL, NULL, NULL, NULL, 'GiangVien');
INSERT INTO `Users` VALUES ('4', 'CNTT', '4', 'Sinh Viên', NULL, NULL, NULL, NULL, 'SinhVien');

SET FOREIGN_KEY_CHECKS = 1;
