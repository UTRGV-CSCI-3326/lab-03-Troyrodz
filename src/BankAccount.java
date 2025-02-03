public class BankAccount{
    public static void main(String[] args){
        double money = 2175.37;
        
        //Bob withdrew $302.50
        money -= 302.50;
        money = round(money, 2);
        System.out.println("Balance: " + money);

        //Bob deposited $50.03
        money += 50.03;
        money = round(money, 2);
        System.out.println("Balance: " + money);

        //Bob withdrew half his balance, then deposited $20
        money /= 2;
        money = round(money, 2);
        money += 20;
        money = round(money, 2);
        System.out.println("Balance: " + money);

        //Bob withdrew $1
        money -= 1;
        money = round(money, 2);
        System.out.println("Balance: " + money);

        //Bob depsits, making his account double
        money *= 2;
        money = round(money, 2);
        System.out.println("Balance: " + money);

        //Deposits one dollar
        money += 1;
        money = round(money, 2);
        System.out.println("Balance: " + money);



    }
    public static double round(double value, int places) {
        if (places < 0) throw new IllegalArgumentException("Places must be greater than or equal to 0");
        long fac = (long) Math.pow(10, places);
        value = value * fac;
        long temp = Math.round(value);
        return (double) temp / fac;
    }
}
