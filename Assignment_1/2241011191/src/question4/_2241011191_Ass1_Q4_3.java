package question4;

class SimCard{
	private String simType;
	SimCard(String simType){
		this.simType = simType;
	}
	
	@Override
	public String toString() {
		return "Sim Type: " + simType;
	}
}

class MobileApp{
	private SimCard simCard;
	
	MobileApp(String simType){
		this.simCard = new SimCard(simType);
	}
	
	public void displaySimType() {
        if (simCard != null) {
            System.out.println("Sim Card Details: \n" + simCard);
        } else {
            System.out.println("Sim Card details not set.");
        }
    }
	
	@Override
    public String toString() {
        return "MobileApp: " + simCard;
    }
}

public class _2241011191_Ass1_Q4_3 {

	public static void main(String[] args) {
		MobileApp mobileApp = new MobileApp("Airtel");
	    mobileApp.displaySimType();
	}

}
