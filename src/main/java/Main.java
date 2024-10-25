package main.java;

public class Main {
    public static void main(String[] args) {
        StringBuilder ans = new StringBuilder();

        for (int i = 1; i <= 100; i++) {
            ans.append(i);
            if (i % 10 == 0) {
                ans.append("\n");
            } else {
                ans.append(", ");
            }
        }
        System.out.println(ans.toString());
        System.out.println(ans.toString());
    }
}