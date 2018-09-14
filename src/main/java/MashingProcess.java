import java.util.ArrayList;
import java.util.List;

public class MashingProcess {
    private List<Step> processSteps;

    public MashingProcess(List<Step> processSteps) {

        this.processSteps = new ArrayList<Step>();
    }
    public MashingProcess() {

    }
    public List<Step> getProcessSteps() {
        if (processSteps == null){
            processSteps = new ArrayList<>();
        }
        return processSteps;
    }

    public void setProcessSteps(List<Step> processSteps) {
        this.processSteps = processSteps;
    }

    public void addStepToProcess(Step ms){
        List<Step> processSteps= this.getProcessSteps();
        processSteps.add(ms);
        this.setProcessSteps(processSteps);
    }
    //TODO remove step from process?

}

