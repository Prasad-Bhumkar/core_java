package instanceOf;

public class Manager extends Employee {
    private int incentive; // Incentive for the manager

    // Constructor with incentive parameter
    public Manager(int basicSal, int hra, int da, int incentive) {
        super(basicSal, hra, da); // Call to superclass constructor
        this.incentive = incentive; // Initialize incentive
    }

    // Constructor without incentive, uses default value
    public Manager(int basicSal, int hra, int da) {
        super(basicSal, hra, da); // Call to superclass constructor
        this.incentive = 3446; // Default incentive
    }

    // Getter for incentive
    public int getIncentive() {
        return this.incentive; // Return the incentive value
    }

    // Calculate total salary including incentive
    @Override
    public int calculateSalary() {
        return super.calculateSalary() + this.incentive; // Calculate total salary
    }
}