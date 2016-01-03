public class Main {

    public static void main(String[] args) {


        new States("qa");
        new States("q0");
        States.setCurrentState(new States("qs"));
        new Alphabet("1");
        new Alphabet("0");

        new Transitions("qs","-","q0","-","left");
        new Transitions("qs","0","qs","g","right");
        new Transitions("qs","1","qa","G","right");

        new Tape("00000001100010");
        new Steps(0);

    }
}
