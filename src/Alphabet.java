import java.util.Vector;

/**
 * Created by Gehad Essam on 02/01/2016.
 */
public class Alphabet {
    String a;

    static Vector<Alphabet> aa=new Vector<>();

    public Alphabet(String a) {
        this.a = a;
        aa.add(this);
    }

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    public static Vector<Alphabet> getAa() {
        return aa;
    }

    public static void setAa(Vector<Alphabet> aa) {
        Alphabet.aa = aa;
    }

}
