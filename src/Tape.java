/**
 * Created by Gehad Essam on 02/01/2016.
 */
public class Tape {
    static String t;

    public Tape(String tp) {
        t=tp;
    }

    public static String getT() {
        return t;
    }

    public static void setT(String t) {
        Tape.t = t;
    }

    public static void newT(Transitions t, int p) {
     Tape.setT(Tape.getT().substring(0, p) + t.getT4() + Tape.getT().substring(p + 1));
    }


}
