import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<Tool> r2Tools = new ArrayList<>();
        ArrayList<Tool> b1Tools = new ArrayList<>();
        ArrayList<Tool> OOM9Tools = new ArrayList<>();
        ArrayList<Tool> C3POTools = new ArrayList<>();


        Tool repairTool1 = new Tool(ToolType.STARSHIP_REPAIR);
        Tool repairTool2 = new Tool(ToolType.STARSHIP_REPAIR);
        Tool repairTool3 = new Tool(ToolType.STARSHIP_REPAIR);
        r2Tools.add(repairTool1);
        r2Tools.add(repairTool2);
        r2Tools.add(repairTool3);

        Tool weapon1 = new Tool(ToolType.RIFLES);
        Tool weapon2 = new Tool(ToolType.RIFLES);
        b1Tools.add(weapon1);
        OOM9Tools.add(weapon2);

        AstromechDroid R2 = new AstromechDroid("R2D2", ModelFactory.getModel(1), "Starship repair/support", r2Tools);
        BattleDroid B1 = new BattleDroid("B1", ModelFactory.getModel(3), "Combat", b1Tools);

        BattleDroid OOM9 = new BattleDroid("OOM-9",ModelFactory.getModel(3),"Combat",OOM9Tools);

        ProtocolDroid C3PO = new ProtocolDroid("C3PO",ModelFactory.getModel(2),"Translation",C3POTools);

        ArrayList<Droid> droidArrayList = new ArrayList<>();
        droidArrayList.add(R2);
        droidArrayList.add(OOM9);
        droidArrayList.add(C3PO);

        System.out.println(R2.getPurpose());
        System.out.println(R2.speak());
        System.out.println(R2.toString());
        System.out.println(R2.getType());
        System.out.println(R2.getTools());

        for (int i = 0; i < 11; i++) {
            R2.repairStarShip();
        }


    }
}
