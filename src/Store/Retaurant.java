package Store;

public class Retaurant extends Store {
    private int numberPersonPerYear;
    private double costPerPerson;

    public Retaurant(String name,int numberPersonPerYear,double costPerPerson) {
        super(name);
        this.costPerPerson=costPerPerson;
        this.numberPersonPerYear=numberPersonPerYear;
    }
    public int getNumberPersonPerYear() {
        return numberPersonPerYear;
    }
    public void setNumberPersonPerYear(int numberPersonPerYear) {
        this.numberPersonPerYear = numberPersonPerYear;
    }
    public double getCostPerPerson() {
        return costPerPerson;
    }
    public void setCostPerPerson(double costPerPerson) {
        this.costPerPerson = costPerPerson;
    }
    @Override
    public String toString() {
        return "Restaurant{name + " + getName()+
                ", numberPersonPerYear=" + numberPersonPerYear +
                ", costPerPerson=" + costPerPerson +
                "} ";
    }
    public double tax(){
        return numberPersonPerYear*costPerPerson*SALESJAXJATE;
    }
}
