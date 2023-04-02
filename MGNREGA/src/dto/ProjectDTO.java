package dto;

import java.time.LocalDate;

public interface ProjectDTO {
	public String getProj_id();
	public void setProj_id(String proj_id);
	public String getPanchayat_code();
	public void setPanchayat_code(String panchayat_code);
	public LocalDate getStart_date();
	public void setStart_date(LocalDate start_date);
	public LocalDate getEnd_date();
	public void setEnd_date(LocalDate end_date);
	public int getNoOfWorker();
	public void setNoOfWorker(int noOfWorker);
	public double getPer_day_wages();
	public void setPer_day_wages(double per_day_wages);
	public boolean isAssigned();
	public void setAssigned(boolean assigned);

}
