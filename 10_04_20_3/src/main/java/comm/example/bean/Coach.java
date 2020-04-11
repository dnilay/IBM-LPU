package comm.example.bean;

public class Coach {
	
	private String eamil;
	private String team;
	public String getEamil() {
		return eamil;
	}
	public void setEamil(String eamil) {
		this.eamil = eamil;
	}
	public String getTeam() {
		return team;
	}
	public void setTeam(String team) {
		this.team = team;
	}
	@Override
	public String toString() {
		return "Coach [eamil=" + eamil + ", team=" + team + "]";
	}
	
	
public void initializeBean()
{
	System.out.println("bean initialized..");
}

public void finalizedBean()
{
	System.out.println("bean is going to destroy");
}
}
