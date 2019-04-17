public class PokerHandFlush {
    public static boolean CheckIfFlush(String[] cards){ //поиск флеш комбинации
        for (int i = 1; i < cards.length ; i++) {
            if (cards[0].charAt(cards[0].length()-1) != cards[i].charAt(cards[i].length()-1)) return false;
        }
        return true;
    }
}
