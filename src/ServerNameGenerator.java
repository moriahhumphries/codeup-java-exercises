import java.util.Random;

public class ServerNameGenerator {
    public static String[] adjectives = {"happy", "lazy", "quick", "slow", "glittery", "matte", "slippery", "smelly", "bright", "rough"};
    public static String[] nouns = {"cat", "garden", "tissue", "cup", "flashlight", "pillow", "cord", "shoe", "milk", "plant"};
    public static void main(String[] args) {
        System.out.println(getWord(adjectives) + "-" + getWord(nouns));
    }

    public static String getWord(String[] choices) {
        Random random = new Random();
        int randomNumber = random.nextInt(choices.length);
        return choices[randomNumber];
    }
}
