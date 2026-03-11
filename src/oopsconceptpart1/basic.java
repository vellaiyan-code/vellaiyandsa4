package oopsconceptpart1;

import java.util.Arrays;

public class basic {
    public static void main(String[] args) {
        //store 5 roll nos
        int[] num = new int[5];
        // stores 5 names
        String[] names = new String[5];

        // data of 5 student (roll no,names ,marks)
        int[] rno = new int[5];
        String[] name = new String[5];
        float[] marks = new float[5];

        Student[]students=new Student[5];

        //in one line

        Student praveen=new Student();
        Student dinesh=new Student(44,"dinesh",85.5f);

//        praveen.rno=10;
//        praveen.name="praveen";
//        praveen.marks=90.5f;
//        S

        Student random=new Student(praveen);
        System.out.println(random.name);

//      praveen.greeting();
//      praveen.changename("dinesh");




    }
}
 // create a class for combined three in one
        // for an every single student
        class Student{
            int rno;
            String name;
            float marks;

            // we need a way to add the value of the above
          // properties object
           // we need one word for every access

         void greeting(){
             System.out.println("hello my namme is"+this.name);

     }
     void changename(String newname){
             name=newname;
     }
         Student(){// it is an constructor calls
             this.rno=10;
             this.name="vellaiyan";
             this.marks=10.0f;
         }
         Student
             ( int rno, String name,float marks){
                 this.rno = rno;
                 this.name = name;
                 this.marks = marks;
             }
             Student(Student other){
             this.name=other.name;
             this.marks=other.marks;
             }
         }



