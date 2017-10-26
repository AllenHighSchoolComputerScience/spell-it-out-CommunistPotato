public class Main {


    public static void main(String[] args) {
        final long startTime = System.currentTimeMillis();
        Level_1 Level1 = new Level_1();
        System.out.println(Level1.Accc(1000));
        long time = System.currentTimeMillis() - startTime;
        System.out.println("Time : " + time);

    }

}
