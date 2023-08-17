import java.util.ArrayList;

public class Course{

private ArrayList<Student> Students = new ArrayList<>(); 
private ArrayList<String> studentNames = new ArrayList<>();
private ArrayList<Integer> studentGrades = new ArrayList<>();

//I made new ArrayLists to store student names and grades separately, made methods that adds new strings/integers to the ArrayList that the user inputs.
public void addStudentNames(String name){
  studentNames.add(name);
}

public void addStudentGrades(int grade){
  studentGrades.add(grade);
} 
  
//method that stores added students from the user into an arraylist
public void addStudent(Student student){
  Students.add(student);
}

//displays everything currently in the Students arraylist
public void listAllStudents(){
	for (int i = 0; i < Students.size(); i++){ 	
	  System.out.println((i + 1) + ". " + Students.get(i)); 		
	}   
}
  
//I compare the string name to the names I stored in the studentNames arraylist. If the name matches to a name in the ArrayList, I then get that position in the Student arraylist and return that. 
public String findStudentByName(String name){
  for(int i = 0; i < studentNames.size(); i++){
    if(name.equals(studentNames.get(i))){
      return (i + 1) + ". " + Students.get(i) + " (" + name + " was found in position " + (i + 1) + ")";   
    } 
  }
  return "No matching results.";
}

//Similar to how I did findStudentsByName, I compare the inputted grade to the grades stored in the studentGrades arraylist. For each grade that's greater than or equal to the user input grade, it prints the position and Student arraylist.
public void findAllStudentsAboveGrade(int grade){
  for(int i = 0; i < Students.size(); i ++){
    if(studentGrades.get(i) >= grade){
      System.out.println((i + 1) + ": " + Students.get(i));
    }
  }
}

}
