package application;

public class Property {
	private String propertyName;
	private String city;
	private double rentAmount;
	private String owner;
	private Plot plot;
	public Property() {
		this.propertyName="";
		this.city="";
		this.rentAmount=0.0;
		this.owner="";
		
	}
	public Property(String propertyName, String city, double rentAmount, String owner) {
		this.propertyName=propertyName;
		this.city=city;
		this.rentAmount=rentAmount;
		this.owner=owner;
		this.plot = new Plot();
	}
	public Property(String propertyName,String city,double rentAmount,String owner,int x,int y,int width,int depth) {
		this.propertyName=propertyName;
		this.city=city;
		this.rentAmount=rentAmount;
		this.owner=owner;
		this.plot = new Plot(x,y,width,depth);
	}
	public Property(Property otherProperty) {
		this.propertyName = otherProperty.propertyName;
        this.city = otherProperty.city;
        this.rentAmount = otherProperty.rentAmount;
        this.owner = otherProperty.owner;
        this.plot = new Plot(otherProperty.plot.getX(), otherProperty.plot.getY(), otherProperty.plot.getWidth(), otherProperty.plot.getDepth());
    	}
	public String getCity() {
		return this.city;
	}
	public String getOwner() {
		return this.owner;
	}
	public Plot getPlot() {
		return this.plot;
	}
	
	
	public String getPropertyName() {
		return this.propertyName;
	}
	public double getRentAmount() {
		return this.rentAmount;
	}
	public String toString() {
		return propertyName + "," + city + "," + owner + "," + rentAmount;
	}
	
	 

}
