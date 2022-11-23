SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

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
-- Table structure for Users
-- ----------------------------
DROP TABLE IF EXISTS `Users`;
CREATE TABLE `Users`  (
  `Id` varchar(128) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `address` text CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL,
  `password` longtext CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL,
  `fullname` longtext CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL,
  `email` longtext CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL,
  `birthday` datetime NULL DEFAULT NULL,
  `schoolyear` int(11) NOT NULL,
  `phone` text CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
	`role` longtext CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL,
  PRIMARY KEY (`Id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_unicode_ci ROW_FORMAT = DYNAMIC;

SET FOREIGN_KEY_CHECKS = 1;
