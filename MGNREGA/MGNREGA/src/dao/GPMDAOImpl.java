package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

import dto.GPMDTO;
import exception.NoRecordFoundException;
import exception.SomethingWentWrongException;

public class GPMDAOImpl {
	public void addGPMDAO (GPMDTO gpm) throws SomethingWentWrongException{
		Connection conn = null;
		try {
			conn = DBUtils.getConnectionTodatabase();
			String query = "INSERT INTO employee (aadhar, panchayat_code, dob,gender,district,state,user_id,password) VALUES (?, ?, ?, ?,?,?,?,?)";
			PreparedStatement ps = conn.prepareStatement(query);
			ps.setInt(1, gpm.getAadhar());
			ps.setString(2, gpm.getPanchayat_code());
			ps.setDouble(3, Double.valueOf(gpm.getSalary()));
			ps.setDate(4, Date.valueOf(gpm.getDob()));
			ps.executeUpdate();
		}catch(ClassNotFoundException | SQLException ex) {
			throw new SomethingWentWrongException("Unable to insert the record now, try again later");
		}finally {
			try {
				DBUtils.closeConnection(conn);					
			}catch(SQLException ex) {
				
			}
		}
	}
	public List<GPMDTO> viewGPMDAO() throws SomethingWentWrongException, NoRecordFoundException{
		
	}

}
