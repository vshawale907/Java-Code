// Question:
// Create a class having two display methods with different parameters.
// If the method does not have any argument, then print "no arg parameter".
// If the argument is a string, then print the name.


package cong;
import java.util.*;

class Main4 {

    public String print(String s) {
        return s;
    }

    public String print() {
        return "no arg parameter";
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        Main4 d = new Main4();
        System.out.println(d.print(s));
        System.out.println(d.print());
    }
}
