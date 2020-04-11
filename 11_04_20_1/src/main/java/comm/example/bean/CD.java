package comm.example.bean;


public class CD {
	private String cdID;
	private String cdTitle;
	private int cdYear;
	public CD() {
		super();
	}
	public CD(String cdTitle, int cdYear) {
		super();
		this.cdTitle = cdTitle;
		this.cdYear = cdYear;
	}
	public String getCdID() {
		return cdID;
	}
	public void setCdID(String cdID) {
		this.cdID = cdID;
	}
	public String getCdTitle() {
		return cdTitle;
	}
	public void setCdTitle(String cdTitle) {
		this.cdTitle = cdTitle;
	}
	public int getCdYear() {
		return cdYear;
	}
	public void setCdYear(int cdYear) {
		this.cdYear = cdYear;
	}
	
	public void getDetails()
	{
		System.out.printf("CD_ID: %s CD_NAME: %s CD YEAR %d\n", getCdID(),getCdTitle(),getCdYear());
	}

}
