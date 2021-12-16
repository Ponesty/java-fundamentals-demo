import java.util.ArrayList;
import java.util.List;

public class Droid {
    String serial, type, purpose;
    List<Tool> tools = new ArrayList<Tool>();

    public Droid(String serial, String type, String purpose, ArrayList<Tool> tool) {
        this.serial = serial;
        this.type = type;
        this.purpose = purpose;
        this.tools = tool;
    }

    public String getSerial() {
        return this.serial;
    }

    public String getType() {
        return this.type;
    }

    public String getPurpose() {
        return this.purpose;
    }

    public void setSerial(String newSerial){
        this.serial = newSerial;
    }

    public void setType(String newType) {
        this.type = newType;
    }

    public void setPurpose(String newPurpose) {
        this.purpose = newPurpose;
    }

    public String speak() {
        return "Beepboopbop";
    }

    public List<ToolType> getTools(){
        List<ToolType> toolTypes = new ArrayList<>();
        for (Tool tool: this.tools) {
            toolTypes.add(tool.toolType);
        }
        return toolTypes;
    }

    public void setTools(Tool tool){
        tools.add(tool);
    }

    public void repairStarShip(){
        for (Tool tool: this.tools) {
            if(tool.toolType == ToolType.STARSHIP_REPAIR && tool.durability > 0){
                tool.durability --;
                System.out.println("Starship repaired");
                break;
            }
        }
    }


    @Override
    public String toString(){
        return "Droid{" + "serial=" + serial + ", type=" + type + ", purpose=" + purpose + "}";
    }
}
