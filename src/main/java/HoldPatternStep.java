import java.time.LocalDateTime;

public class HoldPatternStep implements Step{
    private int time;//time in minutes
    private double targetTemperature;

    public HoldPatternStep(int time, double targetTemperature) {
        this.time = time;
        this.targetTemperature = targetTemperature;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public double getTargetTemperature() {
        return targetTemperature;
    }

    public void setTargetTemperature(double targetTemperature) {
        this.targetTemperature = targetTemperature;
    }

    @Override
    public void performStep() {
                LocalDateTime current = LocalDateTime.now();
                LocalDateTime endTime = LocalDateTime.now().plusMinutes(this.getTime());
                System.out.println("Step target temperature " + this.getTargetTemperature());
                System.out.println("Step target time " + this.getTime());
                System.out.println("Current time " + current);
                System.out.println("Expected end time " + endTime);
                while (LocalDateTime.now().isBefore(endTime)){
                    double currentTemp = ProcessManager.getTemperature();
                    if(currentTemp < this.getTargetTemperature()){
                        //+/- 0.5?
                        System.out.println("Temperature too low. HEATING ON");
    //                    if (!isHeating){
    //                        turnOnHeater();
                    } else if (currentTemp < this.getTargetTemperature()){
                        System.out.println("Temperature too high. HEATING Off");
                        //                    if (isHeating){
                        //                        turnOffHeater();
                    } else {
                        System.out.println("OK.");
                    }
                }
    }
}
