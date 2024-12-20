package lab9.task16;

public class Task16 {
    public static void main(String[] args) {
        for (Suit suit : Suit.values()) {
            for (Rank rank : Rank.values()) {
                System.out.print(rank + " ");
                System.out.println(suit);
            }
        }
    }
}