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

 Date: 21/11/2022 23:16:44
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for GiangVien
-- ----------------------------
DROP TABLE IF EXISTS `GiangVien`;
CREATE TABLE `GiangVien`  (
  `userId` varchar(128) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `tenGiangVien` text CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL,
  `loaiGiangVien` text CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL,
  PRIMARY KEY (`userId`) USING BTREE,
  CONSTRAINT `fk_accountTeacher` FOREIGN KEY (`userId`) REFERENCES `Users` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_unicode_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Table structure for LoaiDeTai
-- ----------------------------
DROP TABLE IF EXISTS `LoaiDeTai`;
CREATE TABLE `LoaiDeTai`  (
  `maLoaiDeTai` int(11) NOT NULL,
  `tenLoaiDeTai` text CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL,
  `hocKy` int(11) NULL DEFAULT NULL,
  `Nam` text CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL,
  `maNganh` int(11) NULL DEFAULT NULL,
  PRIMARY KEY (`maLoaiDeTai`) USING BTREE,
  INDEX `fk_loaiDeTai_Nganh`(`maNganh`) USING BTREE,
  CONSTRAINT `fk_loaiDeTai_Nganh` FOREIGN KEY (`maNganh`) REFERENCES `Nganh` (`manganh`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_unicode_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Table structure for Nganh
-- ----------------------------
DROP TABLE IF EXISTS `Nganh`;
CREATE TABLE `Nganh`  (
  `maNganh` int(11) NOT NULL,
  `tenNganh` text CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL,
  `truongBoMon` varchar(128) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL,
  PRIMARY KEY (`maNganh`) USING BTREE,
  INDEX `fk_truongBoMon`(`truongBoMon`) USING BTREE,
  CONSTRAINT `fk_truongBoMon` FOREIGN KEY (`truongBoMon`) REFERENCES `GiangVien` (`userid`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_unicode_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Table structure for Roles
-- ----------------------------
DROP TABLE IF EXISTS `Roles`;
CREATE TABLE `Roles`  (
  `Id` varchar(128) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `Name` text CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  PRIMARY KEY (`Id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_unicode_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Table structure for SinhVien
-- ----------------------------
DROP TABLE IF EXISTS `SinhVien`;
CREATE TABLE `SinhVien`  (
  `userId` varchar(128) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `MSSV` int(11) NULL DEFAULT NULL,
  `tenSinhVien` text CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL,
  `maNganh` int(11) NULL DEFAULT NULL,
  PRIMARY KEY (`userId`) USING BTREE,
  INDEX `fk_sinhVien_Nganh`(`maNganh`) USING BTREE,
  CONSTRAINT `fk_accountStudent` FOREIGN KEY (`userId`) REFERENCES `Users` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `fk_sinhVien_Nganh` FOREIGN KEY (`maNganh`) REFERENCES `Nganh` (`manganh`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_unicode_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Table structure for UserRoles
-- ----------------------------
DROP TABLE IF EXISTS `UserRoles`;
CREATE TABLE `UserRoles`  (
  `UserId` varchar(128) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `RoleId` varchar(128) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  PRIMARY KEY (`UserId`, `RoleId`) USING BTREE,
  INDEX `FK_dbo.UserRoles_dbo.Roles_RoleId`(`RoleId`) USING BTREE,
  CONSTRAINT `FK_dbo.UserRoles_dbo.Roles_RoleId` FOREIGN KEY (`RoleId`) REFERENCES `Roles` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `FK_dbo.UserRoles_dbo.Users_UserId` FOREIGN KEY (`UserId`) REFERENCES `Users` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_unicode_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Table structure for Users
-- ----------------------------
DROP TABLE IF EXISTS `Users`;
CREATE TABLE `Users`  (
  `Id` varchar(128) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `Email` text CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL,
  `EmailConfirmed` tinyint(4) NOT NULL,
  `PasswordHash` longtext CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL,
  `SecurityStamp` longtext CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL,
  `PhoneNumber` longtext CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL,
  `PhoneNumberConfirmed` tinyint(4) NOT NULL,
  `TwoFactorEnabled` tinyint(4) NOT NULL,
  `LockoutEndDateUtc` datetime NULL DEFAULT NULL,
  `LockoutEnabled` tinyint(4) NOT NULL,
  `AccessFailedCount` int(11) NOT NULL,
  `UserName` text CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  PRIMARY KEY (`Id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_unicode_ci ROW_FORMAT = DYNAMIC;

SET FOREIGN_KEY_CHECKS = 1;
