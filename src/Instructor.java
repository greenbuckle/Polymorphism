public class Instructor extends BSU_Member{
    String department;

    Instructor(){
        this.department = "C.S";
        this.status = "Faculty";
    }

    //Task: Create a display method that will print the department and status
    @Override
    public void display_information(){
        System.out.println("INside Instructor------Department: " + this.department + " " + " Faculty: " + this.status);
    }
}
