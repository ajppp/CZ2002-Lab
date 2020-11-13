public class SalePerson implements Comparable{
    private String firstName;
    private String lastName;
    private int totalSales;

    public SalePerson(String first, String last, int total){
        firstName = first;
        lastName = last;
        totalSales = total;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public int getTotalSales(){
        return totalSales;
    }

    public String toString(){
        return firstName + ", " + lastName +": " + totalSales;
    }

    public boolean equals(Object o){
       return (((SalePerson) o).getFirstName().equals(firstName) && ((SalePerson) o).getLastName().equals(lastName));
    }

    public int compareTo(Object o){
        if(totalSales < ((SalePerson) o).getTotalSales())
            return -1;
        else if(totalSales > ((SalePerson) o).getTotalSales())
            return 1;
        else{
            if (lastName.compareTo(((SalePerson) o).getLastName()) > 0)
                return 1;
            else
                return -1;
        }
    }
}
