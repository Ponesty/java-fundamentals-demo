import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Tool repair = new Tool(ToolType.STARSHIP_REPAIR);
        ArrayList<Tool> newTool = new ArrayList<>();
        newTool.add(repair);
        newTool.add(repair);
        newTool.add(repair);
        Droid R2 = new Droid("R2D2", ModelFactory.getModel(1), "Starship repair/support", newTool);
//        Droid B1 = new Droid("B1", ModelFactory.getModel(3), "Combat", List<String>);
        System.out.println(R2.getPurpose());
        System.out.println(R2.speak());
        System.out.println(R2.toString());
        System.out.println(R2.getType());
        System.out.println(R2.getTools());
        R2.repairStarShip();

    }
}
