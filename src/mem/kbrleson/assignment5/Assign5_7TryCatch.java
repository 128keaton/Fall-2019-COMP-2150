package mem.kbrleson.assignment5;

//exceptions/Assign5_7TryCatch.java

/* follow the steps in  write up to exercise this program
 * exception.
 */


public class Assign5_7TryCatch {
    private static Integer i = null;

    public static void main(String[] args) {
        // leads to NullPointerException:
        // System.out.println(i.toString()); // step 3:
        try {
            System.out.println(i.toString());
        } catch (NullPointerException e) {
            System.err.println(" ^^^^ Caught NullPointerException 1111");
            e.printStackTrace(); // step 4
        }
        try {
            // Step 8: add code int y = 9/0 after putting Step 7 back to the right order y =9/0;
            // step 5: add code i = 100, run it; change i = null
            int y = 9 / 0;
            i = 100;
            System.out.println(i.toString());
        }

        // step 6: add the extra catch here.
        catch (Exception x) {
            System.err.println(" I am Exception !!! ");
            x.printStackTrace();
        }

        //	step 7; Change order with Exception X
        /*catch (NullPointerException e) {
            System.err.println("***** Caught NullPointerException 2222 ");
            e.printStackTrace();
        }*/ finally {
            System.out.println("I am here....Got through it");
        }
    }
}
