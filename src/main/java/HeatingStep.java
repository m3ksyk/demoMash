public class HeatingStep extends Step {
    private double temperature;

    public HeatingStep(double temperature) {
        this.temperature = temperature;

    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }
}
