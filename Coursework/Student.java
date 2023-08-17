public class Student {
  //class to create a student
  private String studentName;
  private int studentID;
  private int grade;

  public Student (String name, int ID, int g){
    studentName = name;
    studentID = ID;
    grade = g;
  }
  
  public String toString(){
    return studentName + " (" + studentID + "): " + grade;
  }
  
}
