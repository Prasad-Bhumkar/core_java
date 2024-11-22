package instanceOf;

public class Developer extends Employee {
    private int nightAllowance; // Night allowance for the developer

    // Constructor with night allowance parameter
    public Developer(int basicSal, int hra, int da, int nightAllowance) {
        super(basicSal, hra, da); // Call to superclass constructor
        this.nightAllowance = nightAllowance; // Initialize night allowance
    }

    // Constructor without night allowance, uses default value
    public Developer(int basicSal, int hra, int da) {
        super(basicSal, hra, da); // Call to superclass constructor
        this.nightAllowance = 3500; // Default night allowance
    }

    // Getter for night allowance
    public int getNightAllowance() {
        return this.nightAllowance;
    }

    // Setter for night allowance
    public void setNightAllowance(int nightAllowance) {
        this.nightAllowance = nightAllowance;
    }

    // Calculate total salary including night allowance
    @Override
    public int calculateSalary() {
        return super.calculateSalary() + this.nightAllowance; // Calculate total salary
    }
}