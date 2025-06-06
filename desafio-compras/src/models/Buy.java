package models;

public class Buy implements Comparable<Buy>{

    private String description;
    private double value;

    public Buy(String description, double value) {
        this.description = description;
        this.value = value;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }
    @Override
    public String toString() {
        return description + " - " + value + "\n";
    }
    @Override
    public int compareTo(Buy o) {
        return Double.compare(this.getValue(), o.getValue());
    }
}
