import java.util.Vector;

/**
 * Created by Gehad Essam on 02/01/2016.
 */
public class Transitions {
    String t1,t2,t3,t4,t5;
    static Vector<Transitions> ts=new Vector<>();
    public Transitions(String t1, String t2, String t3, String t4, String t5) {
        this.t1 = t1;
        this.t2 = t2;
        this.t3 = t3;
        this.t4 = t4;
        this.t5 = t5;
        ts.add(this);
    }

    public String getT1() {
        return t1;
    }

    public void setT1(String t1) {
        this.t1 = t1;
    }

    public String getT2() {
        return t2;
    }

    public void setT2(String t2) {
        this.t2 = t2;
    }

    public String getT3() {
        return t3;
    }

    public void setT3(String t3) {
        this.t3 = t3;
    }

    public String getT4() {
        return t4;
    }

    public void setT4(String t4) {
        this.t4 = t4;
    }

    public String getT5() {
        return t5;
    }

    public void setT5(String t5) {
        this.t5 = t5;
    }

    public static Vector<Transitions> getTs() {
        return ts;
    }

    public static void setTs(Vector<Transitions> ts) {
        Transitions.ts = ts;
    }

    public static Transitions findTS(States s , String t, int p) {

        for (Transitions tt:getTs()
             ) {
            if(s.getS().contains(tt.getT1()))
                if(tt.getT2().contains(Character.toString(t.charAt(p))))
                    return tt;
        }
return null;
    }


}
