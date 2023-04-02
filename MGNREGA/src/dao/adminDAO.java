package dao;

import java.util.List;

import dto.BDODTO;
import exception.NoRecordFoundException;
import exception.SomethingWentWrongException;

public interface adminDAO {
	//public void login(String username, String password) throws SomethingWentWrongException, NoRecordFoundException;
	//public void logout();
	public void addBDODAO (BDODTO bdo) throws SomethingWentWrongException;
	public List<BDODTO> viewBDODAO() throws SomethingWentWrongException, NoRecordFoundException;
	

}
