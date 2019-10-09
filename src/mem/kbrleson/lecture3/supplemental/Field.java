package mem.kbrleson.lecture3.supplemental;

public class Field {

    private String first;    // private
    protected String last;  // This one is protected

    public Field() {
        first = last = "";
    }

    public Field(String first, String last) {
        this.first = first;
        this.last = last;
    }

    public void setFirst(String s) {
        first = s;
    }

    public void setLast(String s) {
        last = s;
    }

    public String getFirst() {
        return first;
    }

    public String getLast() {
        return last;
    }

    public String toString() {
        return first + " " + last;
    }
}
