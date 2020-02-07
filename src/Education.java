import java.lang.reflect.Array;
import java.util.ArrayList;

public class Education {
    ArrayList<String> degree;
    ArrayList<String> University;
    ArrayList<Integer> dateOfGraduation;

    public Education(){
        this.degree = new ArrayList<>();
        this.University = new ArrayList<>();
        this.dateOfGraduation = new ArrayList<>();
    }
    public ArrayList<String> getDegree(){
        return degree;
    }
    public void setDegree(ArrayList<String> degree){
        this.degree = degree;
    }
    public ArrayList<String> getUniversity(){
        return University;
    }
    public void setUniversity(ArrayList<String> University){
        this.University = University;
    }
    public ArrayList<Integer> getDateOfGraduation(){
        return dateOfGraduation;
    }
    public void setDateOfGraduation(ArrayList<Integer> dateOfGraduation){
        this.dateOfGraduation = dateOfGraduation;
    }

    public String toString(){
        String display = " ";
        for (int u = 0; u < University.size(); u++){
            display += degree.get(u)+","+"\n"+University.get(u) +", " + dateOfGraduation.get(u)+"\n\n";
        }
        return display;
    }
}
