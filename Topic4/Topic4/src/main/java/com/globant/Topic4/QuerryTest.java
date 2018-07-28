package com.globant.Topic4;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class QuerryTest {

	public static void main(String[] args) {
		String sql = "SELECT T.'Last Name', T.'First Name', S.'DayOfWeek', S.'StartTime', S.'EndTime', C.'Name' FROM 'high-school'.'Teacher' T JOIN 'high-school'.'Course' C ON T.idTeacher = C.Teacher JOIN 'high-school'.'AssingedTime' A ON C.idCourse = A.idCourse JOIN 'high-school'.'Schedule' S ON A.idSchedule = S.idSchedule WHERE T.idTeacher = 3 ORDER BY S.DayOfWeek, S.StartTime ASC;";
		Connection con = null;

		try {
			con = DBConnection.getInstance().getConnection();
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				System.out.println(rs.getString(rs.getRow()));
			}
			rs.close();
			ps.close();

		} catch (ClassNotFoundException | SQLException e){
			e.printStackTrace();
		}
	}
	
}
