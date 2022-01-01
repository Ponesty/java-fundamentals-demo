import java.util.ArrayList;
import java.util.List;

abstract class Droid {
    final String serial;
    String type, purpose;
    List<Tool> tools = new ArrayList<Tool>();

    public Droid(String serial, final String type, String purpose, final ArrayList<Tool> tool) {
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
            toolTypes.add(tool.getToolType());
        }
        return toolTypes;
    }

    public void setTools(Tool tool){
        tools.add(tool);
    }

   /* public void repairStarShip(){
        int i =0;
        while(i< this.tools.size()){
            if(this.tools.get(this.tools.size()-1).getDurability() == 0){
                System.out.println("Cannot repair starship.");
                break;
            }
            else if(this.tools.get(i).getToolType() == ToolType.STARSHIP_REPAIR && this.tools.get(i).getDurability() > 0){
                System.out.println("Starship repaired.");
                this.tools.get(i).useTool();
                i = this.tools.size();
            } else{
                i++;
            }
        }

    }*/


    @Override
    public String toString(){
        return "Droid{" + "serial=" + serial + ", type=" + type + ", purpose=" + purpose + "}";
    }
}
