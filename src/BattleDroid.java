import java.util.ArrayList;

public class BattleDroid extends Droid {
    public BattleDroid(String serial, String type, String purpose, ArrayList<Tool> tool) {
        super(serial, type, purpose, tool);
    }
    public void shootEnemy(){
        int i =0;
        while(i< this.tools.size()){
            if(this.tools.get(this.tools.size()-1).getDurability() == 0){
                System.out.println("Out of ammo.");
                break;
            }
            else if(this.tools.get(i).getToolType() == ToolType.RIFLES && this.tools.get(i).getDurability() > 0){
                System.out.println("Enemy has been shot.");
                this.tools.get(i).useTool();
                i = this.tools.size();
            } else{
                i++;
            }
        }

    }
}
