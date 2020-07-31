package VehicleCatalogue;

public class Truck {
    private String type, model, color;
    private int horsepower;

    public Truck(String model, String color, int horsepower) {
        this.model = model;
        this.color = color;
        this.horsepower = horsepower;
        this.type = "Truck";
    }

    public int getHorsepower() {
        return this.horsepower;
    }

    public String getModel() {
        return this.model;
    }

    @Override
    public String toString() {
        return String.format("Type: %s%n" +
                "Model: %s%n" +
                "Color: %s%n" +
                "Horsepower: %d", this.type, this.model, this.color, this.horsepower);
    }
}
