public class energydrinkconsumptiondata {
    public static void main(String[] args) {
      int num = 12467;
      double oneormore_final;
      double citrusconsumers_final;
      final double oneormore = .14;
      final double citrusconsumers = .64;
      
    oneormore_final = num * oneormore;
    citrusconsumers_final = num * citrusconsumers;

    System.out.println("Total sample size: " + num);
    System.out.println("Approximate amount of customers that purchase 1 or more energy drinks: " + oneormore_final);
    System.out.println("Approximate amount of customers that prefer citrus flavored energy drinks: " + citrusconsumers_final);

    }
}
