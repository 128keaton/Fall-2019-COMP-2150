package mem.kbrleson.assignment1;

// kbrleson@memphis.edu
// Sept 8th, 2019

public class Question2 {
    // Class variable is the same for all objects that are created from the class Question2
    // If this was not a final variable, any number assigned to a class variable will change that same variable on each of the objects
    private static final int CLASS_VARIABLE = 99;

    // An instance variable could be different for each object created from the class Question2
    // When this variable is changed, the class's instance of this variable is only changed, unlike the class variable
    private int instanceVariable;

    private Question2() {
        instanceVariable = 10;
        System.out.println("instance variable = " + instanceVariable);
    }

    public static void main(String[] args) {
        Question2 question2 = new Question2();
        question2.showMethodVariable();

        System.out.println("Class variable = " + CLASS_VARIABLE);
    }

    private void showMethodVariable() {
        // A method variable only exists inside that method. You cannot access this variable outside of this method.
        // The only way you can change this variable is inside this method's context
        int methodVariable = 80;
        System.out.println("local variable from method = " + methodVariable);
    }
}
