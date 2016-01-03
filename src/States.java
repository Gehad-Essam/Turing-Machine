import java.util.Vector;

/**
 * Created by Gehad Essam on 02/01/2016.
 */
public class States {
    String s;
   static Vector<States> ss=new Vector<>();
    static States currentState;
    public States(String s) {
        this.s = s;
        ss.add(this);
    }

    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }

    public static Vector<States> getSs() {
        return ss;
    }

    public static void setSs(Vector<States> ss) {
        States.ss = ss;
    }

    public static States getCurrentState() {
        return currentState;
    }

    public static void setCurrentState(States currentState) {
        States.currentState = currentState;
    }

    public static void newCState(Transitions Transitions) {
        for (States state:ss
             ) {
            if (state.getS().contains(Transitions.getT3()))
                setCurrentState(state);
        }
    }


}
