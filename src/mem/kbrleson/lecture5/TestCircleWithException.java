package mem.kbrleson.lecture5;

public class TestCircleWithException {
    public static void main(String[] args) {

        int i = 0;
        try {
            System.out.println(" building object number " + ++i);
            CircleWithException c1 = new CircleWithException(5);
            System.out.println(" done with object " + i + "/\n building object number " + ++i);
            CircleWithException c3 = new CircleWithException(0);
            System.out.println(" done with object " + i + "/\n building object number " + ++i);
            CircleWithException c2 = new CircleWithException(-5);
            // throw an exception; message from inside setRadius(..) with throws and throw..!!
            System.out.println(" done with object " + i + " building object number " + ++i);

            CircleWithException c4 = new CircleWithException(6);
        } catch (IllegalArgumentException ex) {
            System.out.println(" ------- inside the catch ");
            System.out.println(ex);
        }
//		catch (Exception ey) {
//			System.out.println(ey);
//		}
//		
        finally {
            System.out.println(" \n inside finally \nNumber of objects created: " + CircleWithException.getNumberOfObjects());
        }

    }
}
