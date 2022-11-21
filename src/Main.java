import java.util.*;
public class Main {
    static final String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do" +
            "eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut" +
            "enim ad minim veniam, quis nostrud exercitation ullamco" +
            "laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure" +
            "dolor in reprehenderit in voluptate velit esse cillum dolore eu" +
            "fugiat nulla pariatur. Excepteur sint occaecat cupidatat non" +
            "proident, sunt in culpa qui officia deserunt mollit anim id est" +
            "laborum.";
    public static int min = Integer.MAX_VALUE;
    public static int max = Integer.MIN_VALUE;

    public static void main(String[] args) {
            Map<Character, Integer> letters = new HashMap<>();
            for (int i = 0; i < text.length(); i++) {
                char key = text.charAt(i);
                if (Character.isLetter(key)) {
                    if (letters.containsKey(key)) {
                        int value = letters.get(key);
                        letters.put(key, value + 1);
                    } else {
                        letters.put(key, 1);
                    }
                }
            }
            System.out.println("Буква " + min(letters) + " написана в тексте наименьшее количество раз");
            System.out.println("Буква " + max(letters) + " написана в тексте наибольшее количество раз");
        }
        public static char min(Map<Character, Integer> letters) {
            char сurrent = 0;
            for (Map.Entry<Character, Integer> ch : letters.entrySet()) {
                if (min > ch.getValue()) {
                    min = ch.getValue();
                    сurrent = ch.getKey();
                }
            }
            return сurrent;
        }
        public static char max(Map<Character, Integer> letters) {
            char сurrent = 0;
            for (Map.Entry<Character, Integer> ch : letters.entrySet()) {
                if (max < ch.getValue()) {
                    max = ch.getValue();
                    сurrent = ch.getKey();
                }
            }
            return сurrent;
        }
    }