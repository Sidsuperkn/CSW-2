package question3;

public class SimCard {
	private String simType;
	
	public String getSimType() {
		return this.simType;
	}
	public void setSimType(String simType) {
		this.simType = simType;
	}
	
	@Override
    public String toString() {
        return "Sim Type: " + simType;
    }
}
