package main.java.string;

public class ManipularString {
    public static void main(String[] args) {
        String s = "fj11";
        s.replaceAll("1", "2");
        System.out.println(s);

        System.out.println(s.replaceAll("1", "2"));

        System.out.println(s.contains(("f")));
        System.out.println(s.trim());
        System.out.println(s.isEmpty());
        System.out.println(s.length());

    }
}
