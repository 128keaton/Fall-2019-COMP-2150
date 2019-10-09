package mem.kbrleson.lecture3.supplemental;

public class DynamicBindingDemo2 {
    public static void main(String[] args) {

        Object o = new GraduateStudent1(); // implicit casting

        m(o);  // print Grad Student
        m(new GraduateStudent1()); // It points to studneprint No dynamic binding
        m(new Student1());  // print No dynamic binding
        m(new Person1()); // print person
        m(new Object());
    }

    private static void m(Object x) {
        System.out.println(x.toString()); // print the string from toString()
    }

    private static void m(Student1 s) {
        System.out.println(" No dynamic binding using toSting() ");
    }
}

class GraduateStudent1 extends Student1 {

} // no toSting() Here !! otherwise GraduateStudent1's toString will be called

class Student1 extends Person1 {
    public String toString() {
        return "Student (dynamic binding toString) ";
    }
}

class Person1 extends Object {
    public String toString() {
        return "Person (dynamic binding toString) ";
    }
}
