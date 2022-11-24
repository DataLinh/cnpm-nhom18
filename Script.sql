CREATE TABLE `Nganh`  (
  `maNganh` varchar(255) NOT NULL,
  `tenNganh` varchar(255) NULL,
  PRIMARY KEY (`maNganh`)
);


CREATE TABLE `LoaiDeTai`  (
  `maLoaiDeTai` varchar(255) NOT NULL,
  `tenLoaiDeTai` varchar(255) NULL,
  `hocKy` varchar(255) NULL,
  `Nam` varchar(255) NULL,
  `maNganh` varchar(255) NULL,
  PRIMARY KEY (`maLoaiDeTai`),
  INDEX `fk_loaiDeTai_Nganh`(`maNganh`),
  CONSTRAINT `fk_loaiDeTai_Nganh` FOREIGN KEY (`maNganh`) REFERENCES `Nganh` (`manganh`) ON DELETE RESTRICT ON UPDATE RESTRICT
);


CREATE TABLE `Users`  (
  `Id` varchar(255) NOT NULL,
  `maNganh` varchar(255) NULL,
  `password` varchar(255) NULL,
  `fullname` varchar(255) NULL,
  `email` varchar(255) NULL,
  `birthday` datetime NULL DEFAULT NULL,
  `schoolyear` varchar(255) NULL,
  `phone` varchar(255) NULL,
	`role` varchar(255) NULL,
  PRIMARY KEY (`Id`),
	INDEX `fk_Users_Nganh`(`maNganh`),
  CONSTRAINT `fk_Users_Nganh` FOREIGN KEY (`maNganh`) REFERENCES `Nganh` (`manganh`) ON DELETE RESTRICT ON UPDATE RESTRICT
);



