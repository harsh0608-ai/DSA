class Solution {
    public int[] scoreValidator(String[] events) {

        int score = 0;
        int counter = 0;

        for (String e : events) {
            if (counter == 10) {
                break;
            }
            if (e.equals("W")) {
                counter++;
            } else if (e.equals("WD") || e.equals("NB")) {
                score++;
            } else {
                score += Integer.parseInt(e);
            }
        }

        return new int[]{score, counter};
    }
}