public class TestAlgorithm {

    // Finds if any two numbers in the array add up to the target
    public boolean hasPairWithSum(int[] data, int target) {
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data.length; j++) {
                if (i != j && data[i] + data[j] == target) {
                    return true;
                }
            }
        }
        return false;
    }
}
