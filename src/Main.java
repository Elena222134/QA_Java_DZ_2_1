public class Main {
    public static void main(String[] args) {
        double ticketPrice = 100.7;
        int oneMileInBonusRubles = 20;
        int bonusMile = (int)ticketPrice / oneMileInBonusRubles;
        System.out.println(bonusMile + " зачислится бонусных миль");
    }
}
