public class MonteCarloSimulation {
    public static void main(String[] args) {

        final int TOTAL_THROWS = 1_000_000;
        int oddCount = 0;

        for (int i = 0; i < TOTAL_THROWS; i++) {

            
            double x = Math.random() * 2 - 1;    
            double y = Math.random() * 2 - 1;

            
            if ((x > 0 && y > 0) || (x < 0 && y < 0)) {
                oddCount++;
            }
        }

        double probability = (double) oddCount / TOTAL_THROWS;

        System.out.println("Probability of landing in an odd-numbered region: " + probability);
    }
}
