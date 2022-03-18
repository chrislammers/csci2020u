package lab05;

public class StudentRecord {
  private String studentID;
  private float midterm;
  private float assignments;
  private float finalExam;
  private float finalMark;
  private char letterGrade;

  public StudentRecord(String sID, float mid, float a, float finalE) {
    this.studentID = sID;
    this.midterm = mid;
    this.assignments = a;
    this.finalExam = finalE;

    System.out.println("TEST! sturec");

    this.finalMark = (this.midterm*0.30f) + (this.assignments*0.20f) + (this.finalExam*0.50f);

    if (80.0f <= this.finalMark && this.finalMark  <= 100.0f) {
      this.letterGrade = 'A';
    }
    if (70.0f <= this.finalMark && this.finalMark < 80.0f) {
      this.letterGrade = 'B';
    }
    if (60.0f <= this.finalMark && this.finalMark < 70.0f) {
      this.letterGrade = 'C';
    }
    if (50.0f <= this.finalMark && this.finalMark < 60.0f) {
      this.letterGrade = 'D';
    }
    if (0.0f <= this.finalMark && this.finalMark < 50.0f) {
      this.letterGrade = 'F';
    }
  }
  public String getStudentID() { return this.studentID; }
  public String getMidterm() { return String.valueOf(this.midterm); }
  public String getAssignments() { return String.valueOf(this.assignments); }
  public String getFinalExam() { return String.valueOf(this.finalExam); }
  public String getFinalMark() {return String.valueOf(this.finalMark); }
  public String getLetterGrade() {return String.valueOf(this.letterGrade); }
}
