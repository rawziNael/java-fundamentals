import java.time.LocalDateTime;

public class Main {

    public static void main(String[] args) {
        System.out.println(pluralize("dog", 3));
        flipNHeads(1);
        clock();
    }



    public static String pluralize(String name, int count) {
        if (name == "") {
            return "I own no animals";
        }
        if (count <= 0) {
            return "I own " + count + " " + name + "s";
        }
        if (count == 1) {
            return "I own " + count + " " + name;
        }
        if (count > 1) {
            return "I own " + count + " " + name + "s";
        }
        return "I own no animals";
    }
    public static void flipNHeads(int n){

        int consectuiveHeadFlips = 0;

        //counts flips
        int flips = 0;

        //counts heads
        int headsCounter = 0;

        if(n <= 0){
            System.out.println("no flips possible");
            return;
        }

        while(consectuiveHeadFlips !=n) {
            double random = Math.random();
            if (random < .5) {
                System.out.println("TAILS");
                consectuiveHeadFlips = 0;
                flips++;
            }
            if (random >=.5) {
                System.out.println("HEADS");
                consectuiveHeadFlips++;
                flips++;
            }
        }
        System.out.println("It tooks " + flips + " flips to get " + n + " heads in a row.");
    }
    public static void clock() {
        LocalDateTime time = LocalDateTime.now();
        int hour = time.getHour();
        int minute = time.getMinute();
        int second = time.getSecond();
        String oclock = hour + ":" + minute + ":" + second;
        System.out.println(oclock);

        while (true) {
            time = LocalDateTime.now();
            if (time.getSecond() != second) {
                hour = time.getHour();
                minute = time.getMinute();
                second = time.getSecond();

                oclock = hour + ":" + minute + ":" + second;
                System.out.println(oclock);
            }
        }
    }
}