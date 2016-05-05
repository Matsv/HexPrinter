package nl.matsv.hexprinter;

/**
 * Created by Mats on 3-5-16.
 */
public class Print {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("No args given");
            exit(1);
        }

        for (String s : args){
            try {
                Byte i = Byte.parseByte(s);
                System.out.println(String.format("%d => %02X", i, i));
            } catch (Exception e){
                System.out.println(String.format("ERROR while parsing %s: %s", s, e.getLocalizedMessage()));
            }
        }
    }

    private static void exit(int num){
        System.exit(num);
    }
}
