//prog: use of startswith and endswith
public class StringDemo1 {
    public static void main(String[] args) {
        String[] mon = { "January", "February", "March", "April", "May", "June", "July", "August", "September",
                "October", "November", "December" };
        System.out.println("Month name Start with J");
        for (int i = 0; i < mon.length; i++) {
            if (mon[i].startsWith("J"))
                System.out.println(mon[i]);
        }
        System.out.println("Month name end  with ber");
        for (int i = 0; i < mon.length; i++) {
            if (mon[i].endsWith("ber"))
                System.out.println(mon[i]);
        }
    }

}
