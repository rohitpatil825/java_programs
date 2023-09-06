

// prog: String Comparision Demo

public class StringCompare {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "hello";
        if (str1.equals(str2)) {
            System.out.println("Both string are same ");
        } else {
            System.out.println("Both string are diffrent");
            ;
        }
        if (str1.equalsIgnoreCase(str2)) {
            System.out.println(" Both string are Same");
        } else {
            System.out.println(" Both String are Diffrent");
        }
        if (str1 == str2) {
            System.out.println("Both object points to same Location");
        } else {
            System.out.println("Both object points to diffrent Location");
        }
        String str3 = "Hello";
        if (str1 == str3) {
            System.out.println("Both object points to same Location");
        } else {
            System.out.println("Both object points to diffrent Location");
        }
        if (str1.startsWith("Hell")) {
            System.out.println(str1 + " start with Hell");
        } else {
            System.out.println(str1 + " not start with Hell");
        }
        if (str1.startsWith("llo", 2)) {
            System.out.println(str1 + " Start with llo from second location");
        } else {
            System.out.println(str1 + " not Start with llo from second location");
        }
        if (str1.endsWith("lo")) {
            System.out.println(str1 + " ends with lo");
        } else {
            System.out.println(str1 + " not ends with lo ");
        }
        if (str1.compareTo(str2) < 0) {
            System.out.println(str1 + " is smaller than " + str2);
        } else if (str1.compareTo(str2) > 0) {
            System.out.println(str1 + " is grater than " + str2);
        } else {
            System.out.println("Both " + str1 + " and " + str2 + " are same");
        }
    }
}
