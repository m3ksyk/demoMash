import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

public class ProcessManager {
    //need to debug
    public static void runProcess(MashingProcess mp){
        ArrayList<Step> steps = (ArrayList<Step>) mp.getProcessSteps();
        for(Step s : steps){
            if (s instanceof HeatingStep){
                System.out.println("Step target temperature " + s.getTemperature());
                double currentTemp = getTemperature();
                while(currentTemp < s.getTemperature()){
                    System.out.println("Temperature too low. HEATING");
                    currentTemp = getTemperature();
//                    if (!isHeating){
//                        turnOnHeater();
//                    }
                }
                //keep heating/turn heating on logic
                System.out.println("Finishing heating pattern");

            } else if(s instanceof HoldPatternStep){
                LocalDateTime current = LocalDateTime.now();
                LocalDateTime endTime = LocalDateTime.now().plusMinutes(((HoldPatternStep) s).getTime());
                System.out.println("Step target temperature " + s.getTemperature());
                System.out.println("Step target time " + ((HoldPatternStep) s).getTime());
                System.out.println("Current time " + current);
                System.out.println("Expected end time " + endTime);
                while (LocalDateTime.now().isBefore(endTime)){
                    double currentTemp = getTemperature();
                    if(currentTemp < s.getTemperature()){
                        //+/- 0.5?
                        System.out.println("Temperature too low. HEATING ON");
    //                    if (!isHeating){
    //                        turnOnHeater();
    //                    }
                    } else if (currentTemp < s.getTemperature()){
                        System.out.println("Temperature too HIGH. HEATING Off");
                        //                    if (!isHeating){
                        //                        turnOnHeater();
                        //                    }
                    } else {
                        System.out.println("OK, continuing. Current time" + LocalDateTime.now());
                    }
                }
                System.out.println("Finishing holding pattern");

            }
        }


//        //valve operating logic here
}

    public static void turnOnHeater(){
        System.out.println("Heater turned on");
        // isHeating == true;
    }

    public static void turnOffHeater(){
        System.out.println("Heater turned off");
        // isHeating == false;
    }

    // gets temperature from the probe (currently random mockup)
    public static double getTemperature(){
        double temp = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sensor temp reading simulation:");
        temp = Double.parseDouble(scanner.next());
        //simulating sensor lag
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return temp;
    }
}