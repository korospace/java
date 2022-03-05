public class ForEach{
    public static void main(String[] args) {
        String[] murid = {
          "Muhammad","Akbar","Bagas","Koro"
        };

        /*
        * non forEach
        */
        for (int index = 0;index < murid.length;index++) {
            System.out.println(murid[index]);
        }

        /*
        * forEach
        */
        for (var m : murid) {
            System.out.println(m);
        }
    }
}
