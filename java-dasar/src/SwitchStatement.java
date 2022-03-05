public class SwitchStatement {
    public static void main(String[] args) {
        char nilai = 'C';

        switch (nilai){
            case 'A':
                System.out.println("Perfect!");
                break;
            case 'B':
                System.out.println("nice");
                break;
            default:
                System.out.println("Holly cow!");
        }

        /*
        * Switch lamda
        * Suport in java >= 14
        */
        String student = "bagas";

        switch (student) {
            case "asyam" -> System.out.println("Leader");
            case "bagas","ariel" -> System.out.println("Sekretaris");
            default -> {
                System.out.println("Not Found");
                System.out.println("Please, Hire someone!");
            }
        }

        /*
        * Switch yield
        */
        String kataKata;
        Character nilai1 = 'A';

        kataKata = switch (nilai1) {
            case 'A': yield "Woww amazing!";
            case 'B': yield "Woww very good!";
            default: yield "Holly coww!";
        };

        System.out.println(kataKata);
    }
}
