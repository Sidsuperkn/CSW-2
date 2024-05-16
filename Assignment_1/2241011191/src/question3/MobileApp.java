package question3;

public class MobileApp {
	private SimCard simCard;
	
	public void setSimCard(String simType) {
		if(simCard == null) simCard = new SimCard();
		simCard.setSimType(simType);
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
