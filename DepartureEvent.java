public class DepartureEvent extends Event{

	private int tellerNum;
	
	public DepartureEvent(int time, int tNum){
		super(time);
		
		tellerNum = tNum;
	}
	
	public String toString(){
		return "Departs at " + super.getTime() + " after being served by teller #" + tellerNum;
	}

	public int getTellerNum() {
		return tellerNum;
	}

	public void setTellerNum(int tellerNum) {
		this.tellerNum = tellerNum;
	}
	

}
