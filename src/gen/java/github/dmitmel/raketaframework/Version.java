package github.dmitmel.raketaframework;

public class Version {
    private Version() {}

    public static String id() {
        return "1.1";
    }

    public static void main(String[] args) {
        System.out.println(id());
    }
}