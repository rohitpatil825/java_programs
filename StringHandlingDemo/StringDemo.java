

//prog: String Demo
public class StringDemo {
    public static void main(String[] arg) {
        String msg = "Jay Shri Ram";
        System.out.println(msg);
        System.out.println("Length of " + msg + " is : " + msg.length());
        System.out.println("Character at 9th location in " + msg + " is : " + msg.charAt(9));
        char[] ch = new char[msg.length() + 1];
        msg.getChars(3, 9, ch, 0);
        System.out.println(new String(ch));
        //byte[] b = new byte[msg.length() + 1];
        //msg.getBytes(3, 9, b, 0);
       // System.out.println(new String(b));
        System.out.println("Substring from character 4 : " + msg.substring(4));
        System.out.println("Substring from character 3 to 12 is  : " + msg.substring(3, 12));
        char[] c = msg.toCharArray();
        System.out.println(new String(c));
    }
}
