
public class Variables {

    public static void main(String[] args) {


        binaryToDecimal(); //ignore
        binaryToDecimal(); //ignore
        binaryToHex(); //ignore

    }


    public static void binaryToDecimal() {

        String binary = "1010";
        binaryToHex();
        String b = Integer.toString(Integer.parseInt(binary));
        System.out.println(b);

    }

    public static void binaryToOctal() {

        String binary = "1010";
//太难了，不会做


    }

    public static void binaryToHex() {

        String binary = "1010";
    }
}