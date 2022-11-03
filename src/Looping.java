public class Looping {

    String[] bands = {"Joywave", "Gorillaz","Imagine Dragons","Metallica",
            "Iron Maiden","Led Zeppelin"};

    int[] pwr2 = {1,2,4,6,16,32,64,128,256,512,1024};

    boolean[] bools = {true,false,true,false,false,false,true};



    public static void main(String[] args) {


        //hileloop(); //ignore
        //forLoop(); //ignore
        //forEnhancedLoop(); //ignore
        Days();

    }

    private static void forEnhancedLoop() {



    }
    private static void Days() {
        String week[] = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        for (int i = 0; i < week.length; i++)
            System.out.println(week[i]);




    }

    private static void forLoop() {

        String[] bands = {"Joywave", "Gorillaz","Imagine Dragons","Metallica",
                "Iron Maiden","Led Zeppelin"};

        int[] pwr2 = {1,2,4,6,16,32,64,128,256,512,1024};

        boolean[] bools = {true,false,true,false,false,false,true};

        for (int i = 0; i < bools.length; i++){
            System.out.println(bools[i]);
        }

    }

    private static void whileloop() {

        int i = 0;
        int[] pwr2 = {1,2,4,6,16,32,64,128,256,512,1024};

        while(i < pwr2.length){
            System.out.println(pwr2[i]);
            i += 1;
        }

    }
}
