public class Stats {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.err.println("Usage: java Max <numbers>");
            return;
        }
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int numNum = 0;
        int sum = 0;
        for (String arg : args) {
            numNum++;
        }
        for (String arg : args) {
            int value = Integer.parseInt(arg);
            if (value > max)
                max = value;
        }
        for (String arg : args) {
            int value = Integer.parseInt(arg);
            if (value < min)
                min = value;
        }
        for (int i = 0; i < args.length; i++) {
            sum += Integer.parseInt(args[i]);
        }
        double dubNumNum = (double) numNum;
        double average = (sum / dubNumNum);
        System.out.println("The max is " + max);
        System.out.println("The min is " + min);
        System.out.println("There are " + numNum + " numbers");
        System.out.printf("The average is "
                + "%.2f",
            average);
        System.out.println("");
    }
}
