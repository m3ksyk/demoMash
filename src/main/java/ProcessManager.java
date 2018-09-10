import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

public class ProcessManager {
    //need to debug
    public static void runProcess(MashingProcess mp){
        ArrayList<Step> steps = (ArrayList<Step>) mp.getProcessSteps();
        for(Step s : steps){
            s.performStep();
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