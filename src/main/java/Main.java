public class Main {
    public static void main(String[] args) {
        MashingProcess testProcess1 = new MashingProcess();
        Step step1 = new HeatingStep(50); //initial heating
        Step step2 = new HeatingStep(67); // malt insertion, heating to mashing temp
        Step step3 = new HoldPatternStep(1, 68); // mashing
        Step step4 = new HeatingStep(80); //mashout, heating before filtration

        testProcess1.addStepToProcess(step1);
        testProcess1.addStepToProcess(step2);
        testProcess1.addStepToProcess(step3);
        testProcess1.addStepToProcess(step4);

        ProcessManager.runProcess(testProcess1);
    }
}
