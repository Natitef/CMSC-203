package patient;

public class Procedure {
	private String procedureName, procedureDate, practitionerName;
	private double charges;

	 Procedure() {
		
	}
	 Procedure(String procedureName, String procedureDate){
		 this.procedureName = procedureName;
		 this.procedureDate = procedureDate;
		 
	 }
	 Procedure(String procedureName, String procedureDate, String practitionerName, double charges ){
		 this.procedureName = procedureName;
		 this.procedureDate = procedureDate;
		 this.practitionerName = practitionerName;
		 this.charges = charges;
	 }
	 public String getprocedureName() {
			return this.procedureName;
		}
	 public String getprocedureDate() {
			return this.procedureDate;
		}
	 public String getpractitionerName() {
			return this.practitionerName;
		}
	 public double getcharges() {
			return this.charges;
		}
	 public void setprocedureName(String procedureName) {
			this.procedureName = procedureName;
	 	}
	public void setprocedureDate(String procedureDate) {
			 this.procedureDate = procedureDate;
		}
	public void setpractitionerName(String practitionerName) {
			this.practitionerName = practitionerName;
		}
	public void setcharges(double charges) {
			this.charges = charges;
		}
	public void printOut() {
		System.out.println("Procedure: "+this.procedureName+"\n"+"Procedure date: "+this.procedureDate+"\n"+"Practioner Name: "+this.practitionerName+"\n"+"Charges: $"+this.charges+"\n");
	}















}
