//Super/Base/Parent class: Course
//Sub/Derived/Child Class: COSC113
public class COSC113 extends Course {
    //Public, default, protected attributes are inherited
    //Not inherited,
    String syllabus;
    String coding_language;
    Instructor i1;
    Student[] Students;

    COSC113(){
        this.syllabus = "Java";
        this.coding_language = "Java";
        this.i1 = null;
        this.Students = null;
        this.course_number = 113;
        this.credit = 4;
        this.name = "COSC113";
    }

    //Parent class Constructors are not inherited, but can be invoked/called
    COSC113(int course_number, int credit, String name){
        //super() will invoke the parent class's default constructor - Course()
        //super();-super has to be the first thing in a constructor

        super(course_number, credit, name);
        this.syllabus = "Java";
        this.coding_language = "Java";
        this.i1 = null;
        this.Students = null;
    }

    //Methods: Public, default, protected methods are inherited
    //Setters and Getters-Lab work 4- for all the attributed in COSC113

    //Method Overriding: Defining a method with the same method signature from the parent class
    @Override
    public void display_course_information (){
        //Lab work- use super attributes_name inside a print statement
        super.display_course_information();
        System.out.println(" Syllabus:" + this.syllabus + " language: "+ this.coding_language+
            " Instructor: " + this.i1 + " Students: " + this.Students);
    }





    //Package: java files under the same folder are considered to be in a same package
}
