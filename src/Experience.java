import java.util.ArrayList;

public class Experience {
    ArrayList<String> jobTitle;
    ArrayList<String> jobLocation;
    ArrayList<String> dateofJob;
    ArrayList<String> DutyOne;

    public Experience(){
        this.jobTitle = new ArrayList<>();
        this.jobLocation = new ArrayList<>();
        this.dateofJob = new ArrayList<>();
        this.DutyOne = new ArrayList<>();
    }
    public ArrayList<String> getJobTitle(){
        return jobTitle;
    }
    public void setJobTitle(ArrayList<String> jobTitle){
        this.jobTitle = jobTitle;
    }
    public ArrayList<String> getJobLocation(){
        return jobLocation;
    }
    public void setJobLocation(ArrayList<String> jobLocation){
        this.jobLocation = jobLocation;
    }
    public ArrayList<String> getDateofJob(){
        return dateofJob;
    }
    public void setDateofJob(ArrayList<String> dateofJob){
        this.dateofJob = dateofJob;
    }
    public ArrayList<String> getDutyOne(){
        return DutyOne;
    }
    public void setDutyOne(ArrayList<String> DutyOne){
        this.DutyOne = DutyOne;
    }
    public String toString(){
        String display = " ";
        for (int u = 0; u < jobTitle.size(); u++){
            display += jobTitle.get(u)+"\n"+jobLocation.get(u)+", " + dateofJob.get(u)+ "\n" +"-- Duty One: , "+ DutyOne.get(u)+"\n\n";
        }
        return display;
    }
}
