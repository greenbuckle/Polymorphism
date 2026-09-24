public class Student extends BSU_Member {
    double gpa;//attribute

    Course [] enrolled_courses;

    Student(){//default constructor
        this.gpa=0;
        this.enrolled_courses = new Course[6];
        this.status = "Student";
    }

    //lab work: create a getter method for the enrolled_courses attribute
    public Course[] get_Enrolled_Courses(){
       return this.enrolled_courses;
    }

@Override
    public void display_information(){
        System.out.println("Inside Student---Status: " + status);
    }

}
