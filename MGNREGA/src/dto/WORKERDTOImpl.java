package dto;

public class WORKERDTOImpl implements WORKERDTO{
	
	private int aadhar;
	private String name;
	private String dob;
	private String gender;
	private String panchayat_code;
	public WORKERDTOImpl(int aadhar, String name, String dob, String gender, String panchayat_code) {
		super();
		this.aadhar = aadhar;
		this.name = name;
		this.dob = dob;
		this.gender = gender;
		this.panchayat_code = panchayat_code;
	}
	@Override
	public int getAadhar() {
		return aadhar;
	}
	@Override
	public void setAadhar(int aadhar) {
		this.aadhar = aadhar;
	}
	@Override
	public String getName() {
		return name;
	}
	@Override
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String getDob() {
		return dob;
	}
	@Override
	public void setDob(String dob) {
		this.dob = dob;
	}
	@Override
	public String getGender() {
		return gender;
	}
	@Override
	public void setGender(String gender) {
		this.gender = gender;
	}
	@Override
	public String getPanchayat_code() {
		return panchayat_code;
	}
	@Override
	public void setPanchayat_code(String panchayat_code) {
		this.panchayat_code = panchayat_code;
	}

}
