public class Tool {
    private final ToolType toolType;
    private int durability;
    public Tool(ToolType toolType){
        this.toolType = toolType;
        this.durability = 3;
    }

    public int getDurability(){
        return this.durability;
    }
    public void useTool(){
        this.durability--;
    }
    public ToolType getToolType(){
        return this.toolType;
    }

}
