package application;


/*CMSC 203*/
public class ManagementCompany extends Object {
	static final int MAX_PROPERTY = 5;
	static final int MGMT_DEPTH = 10;
	static final int MGMT_WIDTH = 10;
	private int count = 0;
	private String name;
	private String taxID;
	private double mgmFee;
	
	private Property[]properties;
	private Plot plot;
	
	
	
	public ManagementCompany() {
		this.plot = new Plot();
		this.properties = new Property[MAX_PROPERTY];
		this.name = "";
		this.mgmFee = 0;
		this.taxID = "";
	}
	public ManagementCompany(String name, String taxID, double mgmFee) {
		this.name = name;
		this.taxID = taxID;
		this.mgmFee = mgmFee;
		this.plot = new Plot(0,0,MGMT_WIDTH, MGMT_DEPTH);
		this.properties = new Property[MAX_PROPERTY];
		
	}
	public ManagementCompany(String name, String taxID, double mgmFee, int x, int y, int width, int depth) {
		this.name = name;
		this.taxID = taxID;
		this.mgmFee = mgmFee;
		this.plot = new Plot(x,y,width, depth);
		this.properties = new Property[MAX_PROPERTY];
		
	}
	
	public ManagementCompany(ManagementCompany otherCompany) {
		this.name = otherCompany.name;
		this.taxID = otherCompany.taxID;
		this.mgmFee = otherCompany.mgmFee;
		this.properties = otherCompany.properties;
		this.plot = otherCompany.plot;
	}
	public int addProperty(String name, String city, double rent, String owner) {
        if(count == MAX_PROPERTY) {
        	return -1;
        }
        properties[count] = new Property(name, city, rent, owner);
        
        count+=1;
        
        return count-1;
        
    }

    public int addProperty(String name, String city, double rent, String owner, int x, int y, int width, int depth) {
    	if(count == MAX_PROPERTY) {
        	return -1;
        }
    	 
        Property property = new Property(name, city, rent, owner, x, y, width, depth);
        
        
        
        
        if (!plot.encompasses(property.getPlot())) {
            return -3;
        }

        for (int i = 0; i < count; i++) {
         
              if (properties[i].getPlot().overlaps(property.getPlot())) {
                    return -4;
                }}
        
             
                properties[count] = property;
                count+=1;
                
            
        return count-1;

        
    }
        
        
    

    public int addProperty(Property property) {
        if (property == null) {
            return -2;
        }

        if (count == MAX_PROPERTY) {
            return -1;
        }

        if (!plot.encompasses(property.getPlot())) {
            return -3;
        }

        for (int i = 0; i < count; i++) {
           
                if (property.getPlot().overlaps(properties[i].getPlot())) {
                    return -4;
                }}
             
                properties[count] = new Property(property);
                count+=1;
                
            
        return count-1;

        
    }
	public double getTotalRent() {
		double total = 0.0;
		for(int i = 0; i<properties.length;i++) {
			total+=properties[i].getRentAmount();
		}
		return total;
	}
	public Property getHighestRentPropperty() {
		double max = properties[0].getRentAmount();
		Property prop = new Property();
		for(int i=1; i<count; i++) {
			if(properties[i].getRentAmount()>max) {
				prop = properties[i];
				
			}
			
		}return prop;
		
	}
	public Property[] removeLastProperty() {
		Property [] newProp = new Property[properties.length-1];
		for(int i = 0;i<newProp.length;i++) {
			newProp[i]=properties[i];
		}
		return newProp;
		
	}
	
	public boolean isPropertiesFull() {
		if(count == MAX_PROPERTY) {
			return true;
		}
		else {return false;}
	}
	public int getPropertiesCount() {
		
		
		return this.count;
	}
	public boolean isManagementFeeValid() {
		if(mgmFee>0&&mgmFee<=100) {
			return true;
		}
		else {return false;}
	}

	public String getName() {
		return this.name;
	}
	public String getTaxID() {
		return this.taxID;
	}
	public Property[]getProperties(){
		return this.properties;
	}
	public double getMgmFeePer() {
		return this.mgmFee;
	}
	public Plot getPlot() {
		return plot;
	}
	public String toString() {
		 String result = "List of the properties for " + name + ", taxID: " + taxID + "\n";
	        result += "__________________________________________\n";

	        for (int i=0;i<count;i++) {
	            
	                result += properties[i].getPropertyName() + "," + properties[i].getCity() + "," + properties[i].getOwner() + "," + properties[i].getRentAmount() + "\n";
	            
	        }
	        result += "__________________________________________\n";
	        result += "total management Fee: " + mgmFee;

	        return result;
	    }	
		
	}
	
	
	
	

