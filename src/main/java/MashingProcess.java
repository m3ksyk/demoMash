import java.util.ArrayList;
import java.util.List;

public class MashingProcess {
    private List<Step> processSteps;

    public MashingProcess(List<Step> processSteps) {

        this.processSteps = new ArrayList<Step>();
    }

    public List<Step> getProcessSteps() {
        return processSteps;
    }

    public void setProcessSteps(List<Step> processSteps) {
        this.processSteps = processSteps;
    }

    public MashingProcess() {

    }
    public void addStepToProcess(Step ms){
        List<Step> processSteps= this.getProcessSteps();
        if (processSteps == null){
            processSteps = new ArrayList<>();
        }
        processSteps.add(ms);
        this.setProcessSteps(processSteps);
    }

}

