import java.util.ArrayList;
import java.util.Random;

public class BankSimulation {
	private int simulationLength;
	private int numTellers;
	private int arrivalLow;
	private int arrivalHigh;
	private int serviceLow;
	private int serviceHigh;
	private static int numCustomers = 0;
	private int totalWaitTime;
	private int nextArrival;
	private int nextOpening;
	private int nextDeparture;
	private Random rnd;
	
	public BankSimulation(int simulationLength, int numTellers,
			int arrivalLow,int arrivalHigh, int serviceLow, int serviceHigh) {
		this.simulationLength = simulationLength;
		this.numTellers = numTellers;
		this.arrivalLow = arrivalLow;
		this.arrivalHigh = arrivalHigh;
		this.serviceLow = serviceLow;
		this.serviceHigh = serviceHigh;
	}
	
	public BankSimulation() {
		
	}
	
	public void startSimulation() {
		int tellCount = 0;
		int tellNum = 0; // teller number
		int timer = 0;
		ArrayList<Teller> tellers = new ArrayList<Teller>();
		ArrayList<Customer> custData = new ArrayList<Customer>();
		ArrayList<Customer> serviceCust = new ArrayList<Customer>();
		for(int i=0;i<numTellers;i++){
			tellers.add(new Teller(i+1,0,0));
		}
		
		LinkedQueue customers = new LinkedQueue();
				
		while(timer < simulationLength){
			
		
			
			int randCustNum = randomTime(0,1);
			
			
			for(int i=0;i<randCustNum;i++){
				Customer myCust = new Customer();
				for(int j = 0; j < tellers.size(); j++){
					if (tellers.get(j).getNumCustServ() == 0 && myCust.getTellerNumber() == 0){
						tellNum = tellers.get(j).getTellerNum();
						myCust.setTellerNumber(tellNum);
						tellers.get(j).increment();
					}
				}
				ArrivalEvent arrival = new ArrivalEvent(timer + randomTime(arrivalLow, arrivalHigh, ));
				customers.enqueue(new Customer(numCustomers, ));
				numCustomers++;
				
			}
			//timer++;
		}
	}
	
	public void inputParameters() {
		
	}
	
	public void displayResults() {
		
	}
	
	public int randomTime(int min, int max) { 
		int randomNum = 0;
		randomNum = (int) (Math.random() * max + min);
		return randomNum;
	}
}
