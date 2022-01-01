import java.util.ArrayList;

public class ProtocolDroid extends Droid {
    public ProtocolDroid(String serial, String type, String purpose, ArrayList<Tool> tool) {
        super(serial, type, purpose, tool);
    }
    public String speak() {
        return "We'll Hello there!";
    }
}
