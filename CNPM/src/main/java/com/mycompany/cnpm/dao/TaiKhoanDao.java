package com.mycompany.cnpm.dao;
import com.mycompany.cnpm.entities.User;
import java.util.List;
public interface TaiKhoanDao {
	
	int themTaiKhoan ( User u);
	 List<User> allTaiKhoan();
	 void xoaTaiKhoan(User u);
	 User get ( String id);

}
