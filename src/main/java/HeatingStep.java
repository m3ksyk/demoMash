public class HeatingStep implements Step {
    private double targetTemperature;

    public HeatingStep(double targetTemperature) {
        this.targetTemperature = targetTemperature;

    }

    public double getTargetTemperature() {
        return targetTemperature;
    }

    public void setTargetTemperature(double targetTemperature) {
        this.targetTemperature = targetTemperature;
    }

    @Override
    public void performStep() {
        System.out.println("Step target temperature " + this.getTargetTemperature());
                double currentTemp = ProcessManager.getTemperature();
                while(currentTemp < this.getTargetTemperature()){
                    System.out.println("Temperature too low. HEATING");
                    currentTemp = ProcessManager.getTemperature();
//                    if (!isHeating){
//                        turnOnHeater();
//                    }
                }
                //keep heating/turn heating on logic
                System.out.println("Finishing heating pattern");

    }
}
