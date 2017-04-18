public class ServiceEvent extends Event{

	private int tellerNum;
	private int serviceTime;
	
	
	public ServiceEvent(int t, int tN, int sT){
		super(t);
		tellerNum = tN;
		serviceTime = sT;
		
	}

	public String toString(){
		return "Begins service at " + super.getTime() + " by teller #" + tellerNum + " and is served in " + serviceTime + " minutes.";
	}
	
	public int getTellerNum() {
		return tellerNum;
	}


	public void setTellerNum(int tellerNum) {
		this.tellerNum = tellerNum;
	}


	public int getServiceTime() {
		return serviceTime;
	}


	public void setServiceTime(int serviceTime) {
		this.serviceTime = serviceTime;
	}
	
	
}
