import java.util.Scanner;
import java.util.regex.Pattern;

public class PaisaHiPaisaHoga {
    private double principalMoney;
    private double rate;

    public PaisaHiPaisaHoga(double principalMoney, double rate) {
        this.principalMoney = principalMoney;
        this.rate = rate;
    }

    public double getPrincipalMoney() {
        return principalMoney;
    }

    public void setPrincipalMoney(double principalMoney) {
        this.principalMoney = principalMoney;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;

    }

    public void time() {
        double time = 100/rate;
        System.out.println("Amount of time it would take to double your money is:" + time + "years");
    }
}

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double principalMoney;
        double rate;
        principalMoney=scanner.nextDouble();
        rate=scanner.nextDouble();
        PaisaHiPaisaHoga paisaHiPaisaHoga = new PaisaHiPaisaHoga(principalMoney,rate);
        paisaHiPaisaHoga.time();
    }
}
