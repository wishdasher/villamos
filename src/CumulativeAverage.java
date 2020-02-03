
public class CumulativeAverage {
    
    /**
     * Compute cumulative averages for example data.
     * @param args unused
     */
    public static void main(String[] args) {
        
        int[] data = new int[] { 1, 2, 3 };
        
        int n = 0;
        int total = 0;
        double average = 0;
        
        for (int value : data) {
            n += 1;
            total += value;
            average = ((double)total) / n;
            System.out.println("average: " + average);
        }
    }
}
