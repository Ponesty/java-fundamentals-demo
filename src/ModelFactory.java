import java.util.HashMap;
import java.util.Map;

public class ModelFactory {
    final public static Map<Integer, String> droidModels;
    static{
        droidModels = new HashMap<>();
        droidModels.put(1,"Astromech");
        droidModels.put(2,"Seeker");
        droidModels.put(3, "Battle");

    }

    public static String getModel(int key){
        return droidModels.get(key);
    }


}
