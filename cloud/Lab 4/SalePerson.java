public class SalePerson implements Comparable{
    private String firstName, lastName;
    private int totalSales;

    SalePerson (String firstName, String lastName, int totalSales) {
        this.firstName = firstName;
		this.lastName = lastName;
		this.totalSales = totalSales;
    }

    public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public int getTotalSales() {
		return totalSales;
    }
    
    public String toString() {
        String temp = lastName + ", " +  firstName + " : " + totalSales;
		return temp;
    }

    public boolean equals(Object o) {
		if (this.getClass() == o.getClass()) {
			SalePerson person1 = (SalePerson) o;
			if ((firstName == person1.getFirstName()) && (lastName == person1.getLastName()))
				return true;
			else 
				return false;
		}
		else 
			return false;
	}

    public int compareTo(Object o) {
		if (this.getClass() == o.getClass()) {
			SalePerson person1 = (SalePerson) o;
			if ((totalSales == person1.getTotalSales())) {
				return (person1.getLastName()).compareTo(lastName);
			}
			else
				return totalSales-person1.getTotalSales();
		}
        else
			return 0;
    }
}

