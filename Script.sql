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

CREATE TABLE `HoiDong`  (
  `id` varchar(255) NOT NULL,
  `giaoVien1` varchar(255) NULL,
  `giaoVien2` varchar(255) NULL,
  `giaoVien3` varchar(255) NULL,
  `giaoVien4` varchar(255) NULL,
  `giaoVien5` varchar(255) NULL,
	FOREIGN KEY (giaoVien1) REFERENCES Users(id),
	FOREIGN KEY (giaoVien2) REFERENCES Users(id),
	FOREIGN KEY (giaoVien3) REFERENCES Users(id),
	FOREIGN KEY (giaoVien4) REFERENCES Users(id),
	FOREIGN KEY (giaoVien5) REFERENCES Users(id),
  PRIMARY KEY (`id`)
);

CREATE TABLE `DeTai` (
  `maDeTai` varchar(255) NOT NULL,
  `loaiDeTai` varchar(255) NULL,
  `maNganh` varchar(255) NULL,
  `gvHuongDan` varchar(255) NULL,
  `gvPhanBien` varchar(255) NULL,
  `hoiDongPhanBien` varchar(255) NULL,
	FOREIGN KEY (loaiDeTai) REFERENCES LoaiDeTai(maLoaiDeTai),
	FOREIGN KEY (maNganh) REFERENCES Nganh(maNganh),
	FOREIGN KEY (gvHuongDan) REFERENCES Users(id),
	FOREIGN KEY (gvPhanBien) REFERENCES Users(id),
	FOREIGN KEY (hoiDongPhanBien) REFERENCES HoiDong(id),
  PRIMARY KEY (`maDeTai`)
);

