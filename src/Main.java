import java.awt.*;
import java.text.NumberFormat;
import java.util.*;

public class Main {

    public static void main(String[] args){
//        HashMap<String, String> phoneBook = new HashMap<>();
//        phoneBook.put("charles", "01234567890");
//        phoneBook.put("xiaomei", "187365828937");
//        phoneBook.put("aping", "81236875635");
//        phoneBook.put("xiaoxin", "235235235");
//        phoneBook.put("helle", "98729385923");
//
//        String phoneNumber = phoneBook.get("xiaomei");
//        System.out.println(phoneNumber);




//        ArrayList<String> names = new ArrayList<>();
//        names.add("Xiaomei");
//        names.add("Jimmy");
//        names.add("aping");
//        names.add("xiaoxin");
//        names.remove("Xiaomei");
//        System.out.println(names.get(0));
//        System.out.println(names.indexOf("Jimmy"));
//        System.out.println(names.contains("aping"));


//        BankAccount1 b = new BankAccount1("Alice",10.2,true);
//        b.name = "hello";
//        System.out.println(b.open);
//        BankAccount1 c = new BankAccount1(false);
//        System.out.println(c.name);



//        String[] people = new String[3];
        //people[0] = "hello";

//        System.out.println(people);




//        String[] people = {"小新", "小美", "阿平"};
//        int i;
//        for(i = 0; i < people.length; i++)
//            System.out.println(people[i]);
//        System.out.println(i-1);

//        for (String person : people)//for each loop缺点是不能改变顺序
//            System.out.println(person);


//        String[] like = {"小新" , "小美"};
//        Random r = new Random();
//        int i = r.nextInt(2);
//        System.out.println(like[i]);




//        String input = "";
//        Scanner scanner = new Scanner(System.in);
//        //while (!input.equals("quit")){  //与for loop相比 我们不需要知道需要循环多少次
//        while (true){//dangerous,确保语句里面有break
//            System.out.print("Input: ");
//            input = scanner.next().toLowerCase();
//            if (input.equals("pass"))
//                continue;
//            if (input.equals("quit"))
//                break;
//            System.out.println(input);
//        }
//        System.out.println("aha, You are quit now!");

//        do{   //do..while loop至少执行一次命令
//            System.out.print("Input: ");
//            input = input1.next().toLowerCase();
//            System.out.println(input);
//        }while(!input.equals("quit"));





        for (int i = 0; i < 5; i++)//首先运行 i=0，如果i<5判断为true，则运行下面的命令，运行完命令后再运行i++，再判断i<5如此往复,,当i=5时判断为false将会退出for loop
            System.out.println("Hello world" + i);



//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Number: ");
//        int number = scanner.nextInt();
//        if (number % 3 == 0) {
//            if(number % 5 == 0 )
//                System.out.println("fizzbuzz");
//            else
//                System.out.println("buzz");
//        }
//        else if (number % 5 == 0)
//            System.out.println("fizz");
//        else
//            System.out.println(number);



//        Scanner scanner = new Scanner(System.in);
//        System.out.print("role: ");
//        String role = scanner.next();
//        switch (role) {
//            case "admin":
//                System.out.println("You are an admin");
//                break;//跳出大括号
//            case "moderator":
//                System.out.println("You are a moderator");
//                break;
//            default:
//                System.out.println("You are a guest!");
//        }






//        int income;
//        String className;
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("income: ");
//        income = scanner.nextInt();
//        className = income > 1000 ? "first" : "economy";//简化高级版
////        if (income > 10000)
////            className = "first";
////        else
////            className = "economy";
//        System.out.println(className);



//        long income;
//        boolean hasHighIncome;
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("income: ");
//        income = scanner.nextLong();
//        hasHighIncome = income > 10_000;//简化高级版
//        if (income > 10_000)
//            hasHighIncome = true;
//        else
//            hasHighIncome = false;
//        System.out.println("has high income? " + hasHighIncome);



//        Scanner scanner = new Scanner(System.in);0
//        System.out.print("Temperature: ");
//        int temp = scanner.nextInt();
//        if (temp > 30 ) {//braces is only required if we have multiple statements
//            System.out.println("It's a hot day");
//            System.out.println("Drink water");
//        }
//        else if (temp < 30 && temp >20)
//            System.out.println("It's a nice day");
//        else
//            System.out.println("It's cold");




//        boolean hasHighincome = false;
//        boolean hasGoodCredit = true;
//        boolean hasCriminalRecord = false;
//        boolean isEligible = (hasGoodCredit || hasHighincome) && !hasCriminalRecord;
//        System.out.println(isEligible);



//        int tempetature = 22;
//        boolean isWarm = tempetature > 20 &&  tempetature < 30;
//        System.out.println(isWarm);



//        int x = 1;
//        int y = ++x;
//        int y = x++;
//        System.out.println(x);
//        System.out.println(y);





//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Principal: ");//1000-1000000
//        float p = scanner.nextFloat();
//        while(p < 1000 || p > 1000000) {
//            System.out.println("please enter 1000-1000000");
//            System.out.print("Principal: ");
//            p = scanner.nextFloat();
//        }
//        float r;
//        while(true) {
//            System.out.print("Annual Interest Rate: ");//0-30
//            r = scanner.nextFloat() / 100 / 12;
//            float k = r * 100 *12;
//            if (k <= 30 && k > 0)
//                break;
//            else
//                System.out.println("enter 0-30");
//        }
//        System.out.print("Period (Years): ");//1-30
//        int n = scanner.nextInt() * 12;
//        double mortgage =  (r * Math.pow( (1 + r) , n))/(Math.pow( (1 + r) , n) - 1) * p ;
//
//        System.out.println("Mortgage: " + NumberFormat.getCurrencyInstance().format(mortgage));


//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Who are U? Name:");
//        String name = scanner.nextLine();
//        System.out.println("You are " + name);
//        NumberFormat percent  = NumberFormat.getPercentInstance();
//        String result = percent.format(0.199);
//        String result2 = NumberFormat.getPercentInstance().format(0.199);
//        System.out.println(result);
//        System.out.println(result2);
//        byte age =30;
//        Date now = new Date();
//        System.out.println(now);
//        String x = new String("Hello World");
//        String y = x.replace("Hello","fine");
//        String y = "Hello \"May\"@!";
//        int[][] number = new int[2][3];
//        number[1][2] = 1;
//        Arrays.sort(number);
//        String b = Arrays.deepToString(number);
//        float x = 1.4124F;
//        int result = Math.round(x);
//        double y = Double.parseDouble(x) + 2;

//        x /= 2;
//        Point a = new Point(1,2);
//        Point b = a;
//        a.x = 2;
//        int result = (int)(Math.random() * 100);
//        System.out.println(result );
//        System.out.println(y);

    }
} 
