public class Instructor extends BSU_Member{
    String department;

    Instructor(){
        this.department = "C.S";
        this.status = "Faculty";
    }

    Instructor(char gender, int id){
        this.gender='?';
        this.id=0;
    }
    //Task: Create a display method that will print the department and status
    @Override
    public void display_information(){
        System.out.println("Inside Instructor------Department: " + this.department + " " + " Faculty: " + this.status);
    }
}
