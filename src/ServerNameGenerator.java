public class ServerNameGenerator {
    private String[] adjectives = {"stringy", "wild", "excruciating", "blissful", "manic", "dark", "shadowy", "bizarre", "willful", "unobtrusive"};
    private String[] nouns = {"galaxy", "ansible", "ship", "lightsaber", "droid", "revenant", "discussion", "browser", "mural", "fortress"};

    public String[] getAdjectives() {
        return adjectives;
    }

    public String[] getNouns() {
        return nouns;
    }

    private static String getString(String[] stringArray){
        return stringArray[(int) Math.ceil(Math.random() * stringArray.length -1)];
    }

    public static void main(String[] args) {
        ServerNameGenerator serverNameGenerator = new ServerNameGenerator();
        System.out.println("Here is your server name:");
        String noun = getString(serverNameGenerator.getNouns());
        String adjective = getString(serverNameGenerator.getAdjectives());
        System.out.printf("%s-%s", adjective, noun);
    }
}
