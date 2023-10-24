package patient;

public class PatientDriverApp {

	static Procedure proc = new Procedure("X-ray","9/26/2023","Dr Nathan",500);
	static Procedure proc1 = new Procedure("Physical Therapy","9/26/2023","Dr James",200.65);
	static Procedure proc2 = new Procedure("Surgery","9/26/2023","Dr John",329);
	static Patient pat = new Patient("John", "David", "Smith", "123 Main St", "New York", "NY", "10001",
            "301-123-4567", "Jane Doe", "555-555-5555");
	
	
	
public static void main(String[] args) {
	
		
		displayPatient();
		displayProcedure();
		calculateCharges();
		
	}
public static void displayPatient() {
	pat.printOut();
}
public static void displayProcedure() {
	proc.printOut();
	proc1.printOut();
	proc2.printOut();
}

public static void calculateCharges() {
	double total;
	total = proc.getcharges()+proc1.getcharges()+proc2.getcharges();
	System.out.println("Total charges: $"+total);
	
	System.out.println("\nStudent Name: Nathan Tefera\nMC#: M21133476\nDue Date: 09/26/2023");
	
}
	
}
