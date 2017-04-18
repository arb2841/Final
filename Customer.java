
public class Customer {
	
	private int custNum;
	private ArrivalEvent arrival;
	private ServiceEvent service;
	private DepartureEvent depart;
	private static int tellerNumber = 0;
	
	public Customer(int cN, int tN, ArrivalEvent a, ServiceEvent s, DepartureEvent d){
		custNum = cN;
		arrival = a;
		service = s;
		depart = d;
		tellerNumber = tN;
	}
	
	public static int getTellerNumber() {
		return tellerNumber;
	}

	public static void setTellerNumber(int tellerNumber) {
		Customer.tellerNumber = tellerNumber;
	}

	public Customer(){
		
	}
	
	public String toString(){
		return ("Customer #" + custNum);
	}

	public int getCustNum() {
		return custNum;
	}

	public void setCustNum(int custNum) {
		this.custNum = custNum;
	}

	public ArrivalEvent getArrival() {
		return arrival;
	}

	public void setArrival(ArrivalEvent arrival) {
		this.arrival = arrival;
	}

	public ServiceEvent getService() {
		return service;
	}

	public void setService(ServiceEvent service) {
		this.service = service;
	}

	public DepartureEvent getDepart() {
		return depart;
	}

	public void setDepart(DepartureEvent depart) {
		this.depart = depart;
	}
	
	
}
