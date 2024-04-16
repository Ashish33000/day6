import java.util.*;
import java.io.*;
public class Four{
    public static void main(String[] args) {
       
       List<Student> students = new ArrayList<>();
        students.add(new Student("Aman", 1001));
        students.add(new Student("Bablu", 1002));
        students.add(new Student("Chandan", 1003));
        students.add(new Student("Sima", 1004));
        students.add(new Student("Mohit", 1005));
        students.add(new Student("Chandu", 1006));

      FileOutputStream fo=new FileOutputStream("D:");
      ObjectOutputStream oos = new ObjectOutputStream(fo);

       try{
        oos.writeObject(students);
        System.out.println("Serialization successful.");
       } catch (Exception e) {
            e.printStackTrace();
        }finally{
            System.out.println("ThankYou");
        }

       
        
    }
   
}

class Student implements Serializable {
    private String name;
    private int studentId;

    public Student(String name, int studentId) {
        this.name = name;
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public int getStudentId() {
        return studentId;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", studentId=" + studentId +
                '}';
    }
}

 


