package Equipment;

public class Main {
    public static void main(String[] args) {
        Computer[] computers = new Computer[5];
        computers[0] = new Computer("Aser");
        computers[1] = new Computer("Asus");
        computers[2] = new Computer("HP");
        computers[3] = new Computer("Dell");
        computers[4] = new Computer("IBM");

        for(int i = 0; i < 5; ++i) {
            System.out.println(computers[i].getName());
        }
    }
}
