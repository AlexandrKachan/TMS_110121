public class Test {

    public static void main(String[] args) {
        int sum = 2000;
        System.out.println(sum);


        int sumRemove = 1000;
        System.out.println(sumRemove);
        sum = sum - sumRemove;


        int tHandred = (sumRemove / 100);
        sumRemove = (sumRemove % 100);
        System.out.println(tHandred + "  " + sumRemove);
        int tFifty = (sumRemove / 50);
        sumRemove = (sumRemove % 50);
        System.out.println(tFifty + "  " + sumRemove);
        int tTwenty = (sumRemove / 20);
        sumRemove = (sumRemove % 20);
        System.out.println(tTwenty + "  " + sumRemove);

        System.out.println(sum);

        sumRemove = 980;

        System.out.println(sumRemove);
        sum = sum - sumRemove;


        tHandred = (sumRemove / 100);
        sumRemove = (sumRemove % 100);
        System.out.println(tHandred + "  " + sumRemove);
        tFifty = (sumRemove / 50);
        sumRemove = (sumRemove % 50);
        System.out.println(tFifty + "  " + sumRemove);
        tTwenty = (sumRemove / 20);
        sumRemove = (sumRemove % 20);
        System.out.println(tTwenty + "  " + sumRemove);

        System.out.println(sum);


    }
}
