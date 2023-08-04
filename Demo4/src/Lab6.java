import java.io.FileReader;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

public class Lab6 {
	public static void main(String[] args) throws Exception {
		ScriptEngineManager engineManager = new ScriptEngineManager();
		ScriptEngine engine = engineManager.getEngineByName("nashorn");
		engine.eval("function sum(a, b) { return a + b; }");
		System.out.println(engine.eval("sum(1, 2);"));
		engine.eval(new FileReader("src/hello.js"));
	}
}
