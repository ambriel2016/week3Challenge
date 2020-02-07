public class Person {
    private String name;
    private String email_address;
    Education education;
    Experience jobs;
    Skills skill;

    public Person(){

    }
    public Person(String name, String email_address, Education education, Experience jobs, Skills skill){
        this.name = name;
        this.email_address = email_address;
        this.education = new Education();
        this.jobs = new Experience();
        this.skill = new Skills();
    }
    public String getName(String s){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getEmail_address(String s){
        return this.email_address;
    }
    public void setEmail_address(String email_address){
        this.email_address = email_address;
    }
    public Education getEducation() {
        return education;
    }
    public void setEducation(Education education) {
        this.education = education;
    }
    public Experience getJobs() {
        return jobs;
    }
    public void setJobs(Experience jobs) {
        this.jobs = jobs;
    }
    public Skills getSkill() {
        return skill;
    }
    public void setSkill(Skills skill) {
        this.skill = skill;
    }

    public String toString(){
        String display = " ";
        display = name + "\n"+ email_address +"\n"+"\n\n";
        return display;
    }
}



