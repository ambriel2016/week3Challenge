import java.util.HashMap;

public class Skills {
    HashMap<String, String> skills;

    public Skills(){
        skills = new HashMap<>();
    }
    public HashMap<String, String> getSkills(){
        return skills;
    }
    public void setSkills(HashMap<String, String> skills){
        this.skills = skills;
    }

    public String toString(){
        String display = " ";
        for( String sk: skills.keySet()){
            display += sk+", "+skills.get(sk)+"\n";
        }
        return display;
    }
}
