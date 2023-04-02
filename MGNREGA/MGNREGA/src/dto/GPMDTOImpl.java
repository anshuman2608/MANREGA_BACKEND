package dto;

public class GPMDTOImpl implements GPMDTO{
	
	private int aadhar;
	private String panchayat_code;
	private String dob;
	private String gender;
	private String district;
	private String state;
	private String user_id;
	private String password;
	public GPMDTOImpl(int aadhar, String panchayat_code, String dob, String gender, String district, String state,
			String user_id, String password) {
		super();
		this.aadhar = aadhar;
		this.panchayat_code = panchayat_code;
		this.dob = dob;
		this.gender = gender;
		this.district = district;
		this.state = state;
		this.user_id = user_id;
		this.password = password;
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
	public String getPanchayat_code() {
		return panchayat_code;
	}
	@Override
	public void setPanchayat_code(String panchayat_code) {
		this.panchayat_code = panchayat_code;
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
	public String getDistrict() {
		return district;
	}
	@Override
	public void setDistrict(String district) {
		this.district = district;
	}
	@Override
	public String getState() {
		return state;
	}
	@Override
	public void setState(String state) {
		this.state = state;
	}
	@Override
	public String getUser_id() {
		return user_id;
	}
	@Override
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	@Override
	public String getPassword() {
		return password;
	}
	@Override
	public void setPassword(String password) {
		this.password = password;
	}
	

}
