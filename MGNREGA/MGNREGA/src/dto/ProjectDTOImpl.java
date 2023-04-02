package dto;

import java.time.LocalDate;

public class ProjectDTOImpl implements ProjectDTO {
	
	private String proj_id ;
	private String panchayat_code;
	private LocalDate start_date;
	private LocalDate  end_date;
	private int NoOfWorker;
	private double per_day_wages;
	private boolean assigned;
	public ProjectDTOImpl(String proj_id, String panchayat_code, LocalDate start_date, LocalDate end_date, int noOfWorker,
			double per_day_wages, boolean assigned) {
		super();
		this.proj_id = proj_id;
		this.panchayat_code = panchayat_code;
		this.start_date = start_date;
		this.end_date = end_date;
		NoOfWorker = noOfWorker;
		this.per_day_wages = per_day_wages;
		this.assigned = assigned;
	}
	@Override
	public String getProj_id() {
		return proj_id;
	}
	@Override
	public void setProj_id(String proj_id) {
		this.proj_id = proj_id;
	}
	@Override
	public String getPanchayat_code() {
		return panchayat_code;
	}
	@Override
	public void setPanchayat_code(String panchayat_code) {
		this.panchayat_code = panchayat_code;
	}
	@Override
	public LocalDate getStart_date() {
		return start_date;
	}
	@Override
	public void setStart_date(LocalDate start_date) {
		this.start_date = start_date;
	}
	@Override
	public LocalDate getEnd_date() {
		return end_date;
	}
	@Override
	public void setEnd_date(LocalDate end_date) {
		this.end_date = end_date;
	}
	@Override
	public int getNoOfWorker() {
		return NoOfWorker;
	}
	@Override
	public void setNoOfWorker(int noOfWorker) {
		NoOfWorker = noOfWorker;
	}
	@Override
	public double getPer_day_wages() {
		return per_day_wages;
	}
	@Override
	public void setPer_day_wages(double per_day_wages) {
		this.per_day_wages = per_day_wages;
	}
	@Override
	public boolean isAssigned() {
		return assigned;
	}
	
	public void setAssigned(boolean assigned) {
		this.assigned = assigned;
	}

}
