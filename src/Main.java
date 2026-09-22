

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
    }
}