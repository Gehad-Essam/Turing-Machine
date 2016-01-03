/**
 * Created by Gehad Essam on 02/01/2016.
 */
public class Steps {
        int p=0;

    public Steps(int pp) {
        p=pp;
        if(go()){
            System.out.println(Tape.getT());
            System.out.println("Braavoooo GEGE! WE DID IT :D");
        }else{
            System.out.println("SHIT !! What Happened ??!!! 3mlty a ya bashm. MARAM -_- !!");
        }
    }

    private boolean go() {
        while ( !(States.getCurrentState().equals(("qa"))) && !(States.getCurrentState().equals("qr"))) {
            Transitions t= Transitions.findTS(States.getCurrentState(),Tape.getT(),p);
            if (t != null) {
                States.newCState(t);
                Tape.newT(t,p);
            } else break;
            p += (t.getT5().contains("right")) ? 1 : -1;
            if (p < 0) p = 0;
            while (Tape.getT().length() <= p) Tape.setT(Tape.getT()+"-");

            System.out.println(Tape.getT());
        }
        if(States.getCurrentState().getS().contains("a")){
            return true;
        }else{
            return false;
        }
    }

    public int getP() {
        return p;
    }

    public void setP(int p) {
        this.p = p;
    }
}

