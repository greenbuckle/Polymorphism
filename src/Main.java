

public class Main{
    public static void main(String[]args){
      Course c1 =new Course();
      c1.display_course_information();

      COSC113 section1= new COSC113();
      section1.display_course_information();

      //Polymorphism
      Course cosc214 = new Course();//refernce of course
      Course section2 = new COSC113();//reference of cosc113-both are objects and are course
      //The relationship is: IS-A relationship between Course and COSC113

        cosc214.display_course_information();
        section2.display_course_information();

        //Student Object
        Student arturo=new Student();
        Course math141 = new Course();
        Course frac = new Course();
        Course cosc107 = new Course();//cosc107 is a course reference
        Course eng102 = new Course();
        Course soc101= new Course();

        arturo.enrolled_courses[0] = math141;
        //Lab-Work: populate index 1-4 with the other course references

        BSU_Member []members = new BSU_Member[10];

        BSU_Member b1, b2;
        //Creating an object of Student type and storing the reference in a BSU_Member tyoe variable
        b1 = new Student();
        b2 = new Instructor();

        members[0] = b1;
        members[1] = b2;//polymorphism

        System.out.println("_________________________");
        for(int i=2;i<10;i++){
            members[i] = new BSU_Member();
        }

        System.out.println("_________________________");

        for(int i=0;i<10;i++){
            members[i].display_information();
        }

    }
}