public class ArrivalEvent extends Event{
	private int waitTime;
	
	public ArrivalEvent(int t, int wT){
		
		super(t);
		waitTime = wT;
	}
	
	public String toString(){
		
		return "Arrives at " + super.getTime() + " and waits for " + waitTime + " minutes.";
	}

	public int getWaitTime() {
		return waitTime;
	}

	public void setWaitTime(int waitTime) {
		this.waitTime = waitTime;
	}
	
	
}
