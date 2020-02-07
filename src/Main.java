import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void a(String s){
        System.out.println(s);
    }

    public static void main(String[] args) {

        Person person = new Person();
        Scanner sc = new Scanner(System.in);
        String name = "", email_address = "";

        ArrayList<String> univ = new ArrayList();
        ArrayList<String> degree = new ArrayList();
        ArrayList<Integer> date = new ArrayList();

        ArrayList<String> title = new ArrayList();
        ArrayList<String> location = new ArrayList();
        ArrayList<String> date1 = new ArrayList();
        ArrayList<String> firstDuty = new ArrayList();

        HashMap<String,String> skills = new HashMap<>();

        a("Please enter your name: ");
        name = sc.nextLine();
        a("Please enter your email address: ");
        email_address = sc.nextLine();

        educationAdd(univ,degree,date);
        workListAdd(title,location,date1,firstDuty);
        skillsListAdd(skills);

        person.setName(name);
        person.setEmail_address(email_address);

        person.education.setUniversity(univ);
        person.education.setDegree(degree);
        person.education.setDateOfGraduation(date);

        person.jobs.setJobTitle(title);
        person.jobs.setJobLocation(location);
        person.jobs.setDateofJob(date1);
        person.jobs.setDutyOne(firstDuty);

        person.skill.setSkills(skills);

        a(person.toString());

        a("Education:\n");
        a(person.education.toString());
        a("Experience:\n");
        a(person.jobs.toString());
        a("Skills:\n");
        a(person.skill.toString());

    }
    public static void educationAdd(ArrayList<String> univ, ArrayList<String> degree, ArrayList<Integer> date){

        Scanner sc = new Scanner(System.in);
        Person person = new Person();
        String option = " ";
        int count =1;
        a("Please enter your Education History"+"\n");
        do{
            a("Please enter your degree: ");
            String degrees = sc.nextLine();
            a("Please enter the name of your university: ");
            String universityName = sc.nextLine();
            a("Please enter the year of Graduation: ");
            int dates = sc.nextInt();
            sc.nextLine();

            degree.add(degrees);
            univ.add(universityName);
            date.add(dates);

            count++;
            a("Do you want to add another one (Y/N)");
            option = sc.nextLine();
            a("=================================================================================");
        }while(!option.equalsIgnoreCase("n") && count <=1 );
    }
    public static void workListAdd(ArrayList<String> title, ArrayList<String> location, ArrayList<String> dates, ArrayList<String> firstDuty){

        Scanner sc = new Scanner(System.in);
        Person person = new Person();
        String option = " ";
        int count = 1;
        a("Please enter your work experience"+"\n");
        do{
            a("Please enter your Job Title: ");
            String title1 = sc.nextLine();
            a("Please enter the name of the Company that you worked for: ");
            String location1 = sc.nextLine();
            a("Please enter the duration of your job: ");
            String dates1 = sc.nextLine();
            a("Please enter your Primary Duty: ");
            String DutyOne = sc.nextLine();

            title.add(title1);
            location.add(location1);
            dates.add(dates1);
            firstDuty.add(DutyOne);

            count++;
            a("Do you want to enter another experience (Y/N)");
            option = sc.nextLine();
            a("===================================================================================");
        }while(!option.equalsIgnoreCase("n") && count <=1 );
    }
    public static void skillsListAdd(HashMap<String, String> skills){

        Scanner sc = new Scanner(System.in);
        Person person = new Person();
        String option = " ";
        int count = 1;
        a("Skills");
        do{
            a("Please enter your skill: ");
            String skill1 = sc.nextLine();
            a("Please enter your proficiency level of the skill (Novice / Fundamental / Intermediate / Advance / Expert");
            String level = sc.nextLine();

            skills.put(skill1,level);

            count++;
            a("Do you want to enter another skill (Y/N)");
            a("====================================================================================");
        }while(!option.equalsIgnoreCase("n") && count <=1);
    }
}
