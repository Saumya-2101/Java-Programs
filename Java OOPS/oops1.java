class Student{
    
    // data members 
    int studentId;
    String studentName;
    String studentCity;

    public Student(){

        System.out.println("creating object : non-p");
    }
    
    // behaviour 
    public void study(){

        System.out.println(studentName + " is studying");

    }
    public void showFullDetails(){

        System.out.println("My name is "+ studentName);
        System.out.println("My id is "+ studentId);
        System.out.println("My city is "+ studentCity);
    }
}
public class oops1{

    public static void main(String[]args){

        Student st1 = new Student();

        st1.studentName = " ram ";
        st1.studentCity = " delhi ";
        st1.studentId = 123;

        st1.study();
        st1.showFullDetails();

        Student st2 = new Student();

        st2.studentName = " shyam ";
        st2.studentCity = " mumbai ";
        st2.studentId = 128;

        st2.study();
        st2.showFullDetails();
    }
}