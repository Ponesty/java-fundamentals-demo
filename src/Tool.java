public class Tool {
    ToolType toolType;
    int durability;
    public Tool(ToolType toolType){
        this.toolType = toolType;
        this.durability = 3;
    }

    public int getDurability(){
        return this.durability;
    }
    public void setDurability(int durability){
        this.durability = durability;
    }
//    public ToolType getToolType(){
//        return this.toolType;
//    }

}
