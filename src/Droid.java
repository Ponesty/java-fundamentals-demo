import java.util.ArrayList;
import java.util.List;

public class Droid {
    String serial, type, purpose;
    List<String> tools = new ArrayList<>();

    public Droid(String serial, String type, String purpose, List<String> tools) {
        this.serial = serial;
        this.type = type;
        this.purpose = purpose;
        this.tools = tools;
    }

    public String getSerial() {
        return serial;
    }

    public String getType() {
        return type;
    }

    public String getPurpose() {
        return purpose;
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

    @Override
    public String toString(){
        return "Droid{" + "serial=" + serial + ", type=" + type + ", purpose=" + purpose + "}";
    }
}
