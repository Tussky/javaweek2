package exercise3;

public class Student {
    private String title;
    private String firstName;
    private String lastName;
    private long ID;
    private int dayBirth;
    private int monthBirth;
    private int yearBirth;

    private int assignment1;
    private int assignment2;
    private short weeklyPractical;
    private int finalExamination;

    private int overallMark;
    private String finalGrade;

    public void overallMark(){
        int assigments_total = this.assignment1 + this.assignment2;
        double overallMark = .40*(double) assigments_total + .10*(double) this.weeklyPractical + 0.50*(double) this.finalExamination;
        System.out.println("Overall mark: "+overallMark);
    }
    public void finalGrade(){
        if (this.overallMark >= 80){
            finalGrade = "HD";
        } else if (this.overallMark >= 70){
            finalGrade = "D";
        } else if (this.overallMark >= 60){
            finalGrade = "C";
        } else if (this.overallMark >= 50){
            finalGrade = "P";
        } else if (this.overallMark < 50){
            finalGrade = "N";
        }
    }
    public printinf
}
