public class Teller {
	private int tellerNum;
	private static int backService;
	private static int totalService;
	private static int numCustServ = 0;
	
	public Teller(int tN,  int tS, int bS) { //int backService,
		tellerNum = tN;
		backService = bS;
		totalService = tS;
	}
	
	public void increment(){
		numCustServ++;
	}
	
	public String toString() {
		return "";
	}

	public boolean isFree(){
		if (numCustServ > 0)
			return false;
		else
			return true;
	}
	public int getTellerNum() {
		return tellerNum;
	}

	public void setTellerNum(int tellerNum) {
		this.tellerNum = tellerNum;
	}


	public static int getBackService() {
		return backService;
	}

	public static void setBackService(int backService) {
		Teller.backService = backService;
	}

	public static int getNumCustServ() {
		return numCustServ;
	}

	public static void setNumCustServ(int numCustServ) {
		Teller.numCustServ = numCustServ;
	}

	public int getTotalService() {
		return totalService;
	}

	public void setTotalService(int totalService) {
		this.totalService = totalService;
	}
}
