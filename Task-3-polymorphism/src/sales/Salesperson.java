package sales;

public class Salesperson implements Comparable <Salesperson> {
    private String firstName, lastName;
    private int totalSales;
    
    public Salesperson (String first, String last, int sales) {
        firstName = first;
        lastName = last;
        totalSales = sales;
    }
    
    public String toString() {
        return lastName + ", " + firstName + ": \t" + totalSales;
    }
    
    public boolean equals(Object other) {
        if (other == null || getClass() != other.getClass()) {
            return false;
        }
        Salesperson otherSalesperson = (Salesperson) other;
        return lastName.equals(otherSalesperson.getLastName()) && firstName.equals(otherSalesperson.getFirstName());
    }

    public int compareTo(Salesperson other) {
        if (this.totalSales != other.totalSales) {
            return other.totalSales - this.totalSales;
        } else {
            return other.lastName.compareTo(this.lastName);
        }
    }
    
    public String getFirstName() {
        return firstName;
    }
    
    public String getLastName() {
        return lastName;
    }
    
    public int getSales() {
        return totalSales;
    }
}
