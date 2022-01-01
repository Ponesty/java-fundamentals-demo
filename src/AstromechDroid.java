import java.util.ArrayList;

public class AstromechDroid extends Droid implements Defender{
    public AstromechDroid(String serial, String type, String purpose, ArrayList<Tool> tool) {
        super(serial, type, purpose, tool);
    }

    public void repairStarShip(){
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

    }

    @Override
    public void defend() {
        System.out.println("Droid shocked the enemy");
    }
}
