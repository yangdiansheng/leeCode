package duty;

public class SpellCheckerProcessing extends ProcessingObject<String>{
    @Override
    protected String handleWork(String input) {
        return "SpellCheckerProcessing:" + input;
    }
}

