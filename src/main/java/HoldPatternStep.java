public class HoldPatternStep extends Step{
    private int time;//time in minutes
    private double temperature;
    //add min/max temp?
    public HoldPatternStep(int time, double temperature) {
        this.time = time;
        this.temperature = temperature;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }
}
