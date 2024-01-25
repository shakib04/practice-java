package practice.myPractice;

import java.util.HashMap;

public class OptimalNoteCalculation {

    public static void main(String[] args) {
        HashMap<Integer, Integer> calculate = calculate(270);
        System.out.println(calculate);
        //System.out.println(calculate(220));
    }

    public static HashMap<Integer, Integer> calculate(int target) {
        int[] notes = new int[]{1, 2, 5, 10, 20, 50, 100};
        int i = notes.length - 1;
        HashMap<Integer, Integer> myChange = new HashMap<>();
        while (target != 0) {
            if (target >= notes[i]) {
                target -= notes[i];
                int frequency = myChange.getOrDefault(notes[i], 0) + 1;
                myChange.put(notes[i], frequency);
            } else {
                i--;
            }
        }
        return myChange;
    }
}
