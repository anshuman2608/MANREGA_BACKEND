package dao;

import exception.NoRecordFoundException;
import exception.SomethingWentWrongException;

public interface adminDAO {
	public void login(String username, String password) throws SomethingWentWrongException, NoRecordFoundException;
	public void logout();
	public void addBDO(BDODTO bdo) throws SomethingWentWrongException;
	public List<bdo> getBDO() throws SomethingWentWrongException, NoRecordFoundException;

}
