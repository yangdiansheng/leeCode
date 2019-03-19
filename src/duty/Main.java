package duty;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Main {
    public static void main(String[] args){
//        ProcessingObject<String> p1 = new HeaderTextProcessing();
//        ProcessingObject<String> p2 = new SpellCheckerProcessing();
//        p1.setSuccessor(p2);
//        String result = p1.handle("contet");
//        System.out.println(result);


        UnaryOperator<String> headprocessing = text -> "HeaderTextProcessing:" + text;
        UnaryOperator<String> spellCheckerrocessing = text -> "SpellCheckerProcessing:" + text;
        Function<String,String> pipeline = headprocessing.andThen(spellCheckerrocessing);
        String result = pipeline.apply("content");
        System.out.println(result);

    }
}
