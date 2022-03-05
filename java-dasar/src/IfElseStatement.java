public class IfElseStatement {
    public static void main(String[] args) {
        int absen = 70;
        int nilai = 80;

        if(absen >= 75 && nilai >= 75) {
            System.out.println("Selamat anda lulus dengan baik!");
        }
        else if(absen <= 75 && nilai >= 75) {
            System.out.println("Anda lulus dengan syarat!");
        }
        else {
            System.out.println("Maaf anda tidak lulus!");
        }
    }
}
