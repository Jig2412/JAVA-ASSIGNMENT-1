class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int n = operations.length;
       int X = 0;
        for (int i = 0; i<n; i++) {
            if (operations[i].equals("++X") || operations[i].equals("X++")){
                X++;
            }
            else {
                X--;
            }
        }
        return X;
    }
}