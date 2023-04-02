package dao;

import java.util.List;

import dto.BDODTO;
import dto.GPMDTO;
import exception.NoRecordFoundException;
import exception.SomethingWentWrongException;

public interface GPMDAO {
	public void addGPMDAO (GPMDTO gpm) throws SomethingWentWrongException;
	public List<GPMDTO> viewGPMDAO() throws SomethingWentWrongException, NoRecordFoundException;
	

}
