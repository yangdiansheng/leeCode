package duty;

public class HeaderTextProcessing extends ProcessingObject<String>{

    @Override
    protected String handleWork(String input) {
        return "HeaderTextProcessing:" + input;
    }
}
