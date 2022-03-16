import java.util.UUID;

public class UUIDClass {
    public static void main(String[] args) {
        for (int i = 1; i<=100; i++) {
            UUID uuid = UUID.randomUUID();
            System.out.println(uuid);
        }
    }
}
