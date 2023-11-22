class Student{
    int rollno;
    String studentName;
}
public class ClassesAndObjects{
public static void main(String[] args){
    Student s1 = new Student();
    Student s2 = new Student();
    System.out.println(s1.rollno + ", " + s1.studentName);
    s2.rollno=23;
    s2.studentName="ErenYeager";
    System.out.println(s2.rollno + ", " + s2.studentName);
}
}