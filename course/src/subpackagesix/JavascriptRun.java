package course.src.subpackagesix;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

public class JavascriptRun {

    public static void main(String[] args) {
        
        ScriptEngineManager scriptEngineManager = new ScriptEngineManager();
        ScriptEngine engine = scriptEngineManager.getEngineByExtension("nashorn");

        String script = " var name='test js code'; name;";

        try {
            Object result = engine.eval(script);
            System.out.println(result);
        } catch( Exception e) {
            System.out.println("Error : " + e.getMessage());
        }
    }
}