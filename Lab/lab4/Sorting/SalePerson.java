package Lab.lab4.Sorting;

// SalePerson Class implement Comparable Interface of type <SalePerson>
public class SalePerson implements Comparable<SalePerson>{
    // Attributes
    private String firstName;
    private String lastName;
    private int totalSales;

    // Constructor
    public SalePerson(String firstName, String lastName, int totalSales) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.totalSales = totalSales;
    }

    // Methods
    public String toString() {
        return this.lastName + " , " + this.firstName + " : " + this.totalSales;
    }

    public boolean equals(SalePerson o) {
        if (o.firstName == this.firstName && o.lastName == this.lastName) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int compareTo(SalePerson o) {
        if (this.totalSales == o.totalSales) {
            return o.lastName.compareTo(this.lastName);
        } else {
            return this.totalSales - o.totalSales;
        }
    }

    // Setters/ Getters
    public String getFirstName() {
        return firstName;
    }

    public String getLasttName() {
        return lastName;
    }

    public int getTotalSales() {
        return totalSales;
    }
}
