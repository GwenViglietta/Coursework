import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    displayMenu(); 
    
  }

static void displayMenu(){
  Scanner sc = new Scanner (System.in);
  Course c = new Course();

  int option;
  
  do{
    //menu
    System.out.println();
    System.out.println("1. Add a Student");
    System.out.println("2. List All Students");
    System.out.println("3. Find Student (by name)");
    System.out.println("4. Find All Students Above a Grade");
    System.out.println("5. Quit");
    System.out.println();
    System.out.println("Enter an option: ");
            //checks if the option the user inputs is an integer or not. If it's not, it exits the program.
    if(!sc.hasNextInt()){
      System.out.println("Not an available option.");
      System.exit(0); 
        }
    option = sc.nextInt();

    switch(option){
        //after the chosen case is fullfilled, it repeats the menu and asks for the user input again.
      case 1://add a student to an array list method
        System.out.println();
        System.out.println("Enter the student's name: ");
        String name = sc.next();
        System.out.println("Enter the student's ID: ");
        if(!sc.hasNextInt()){
                    System.out.println("Invalid ID."); 
        break;
          }
        int ID = sc.nextInt();
        System.out.println("Enter the student's grade: ");
        int grade = sc.nextInt();
        if(grade < 0 || grade > 100){//checks if the grade is between 0 and 100. If it's not, it breaks and goes back to the menu.
        System.out.println("Invalid grade.");
        break;
        }
        Student s = new Student(name, ID, grade);
        c.addStudent(s);//Student ArrayList
        c.addStudentNames(name);//studentNames ArrayList
        c.addStudentGrades(grade);//studentGrades ArrayList
        System.out.println("Okay, " + s + " was sucessfully added to the course!"); 
        break;
  
      case 2://list all students method
        System.out.println();
        c.listAllStudents();
        break;
          
      case 3://find student by name method
        System.out.println("Type in the student you would like to search for: ");
        String studentName = sc.next(); 
        System.out.println(); System.out.println(c.findStudentByName(studentName));
        break;
          
      case 4://find students above a grade method
        System.out.println();
        System.out.println("Enter in a grade: ");
        int studentGrade = sc.nextInt();
        if(studentGrade < 0 || studentGrade > 100){
          System.out.println("Invalid grade.");
          break;
          }
        System.out.println();
        c.findAllStudentsAboveGrade(studentGrade); 
      }
    }
    
    while(option != 5);
    //exits the program if the option is 5
    System.out.println();
    System.out.println("Have a nice day!");
    sc.close();
    System.exit(0);
    //if the options are less than 0 or greater than 5, the menu repeats and the user can input an option again.
}
  
  
}