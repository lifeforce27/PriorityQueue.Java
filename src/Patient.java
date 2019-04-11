//Author Jonathan Smart
public class Patient {

	private String name;
	private String Injury;
	private int Arrival;
	private int Priority;
	private int Month;
	private int day;
	
	public Patient(String name, String injury, int arrival, int priority, int Month , int day) {
		super();
		this.name = name;
		this.Injury = injury;
		this.Arrival = arrival;
		this.Priority = priority;
		this.Month = Month;
		this.day = day;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getInjury() {
		return Injury;
	}


	public void setInjury(String injury) {
		Injury = injury;
	}


	public int getArrival() {
		return Arrival;
	}


	public void setArrival(int arrival) {
		Arrival = arrival;
	}


	public int getPriority() {
		return Priority;
	}


	public void setPriority(int priority) {
		Priority = priority;
	}


	@Override
	public String toString() {
		return "Patient Info: \nName: " + name + "\nInjury: " + Injury + "\nArrival time: " + Arrival + " min \nPriority level: " + Priority
				+ "\nBirthDay: " + Month + "/" + day;
	}
	
	
	
	
	
	
	
	
	
	
}
