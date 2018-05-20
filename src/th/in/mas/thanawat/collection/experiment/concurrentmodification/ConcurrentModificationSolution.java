package th.in.mas.thanawat.collection.experiment.concurrentmodification;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;

public abstract class ConcurrentModificationSolution extends ConcurrentModificationProblem {

    final void solve() {
        ArrayList<String> roundList = experimentData();
        String newItem = "C";

        System.out.println("**************************   Solve by " + solutionName());
        System.out.println("Before : " + roundList);
        try {
            long start = System.currentTimeMillis();
            addItemAndReIndex(roundList, newItem);
            long finish = System.currentTimeMillis() - start;
            System.out.println("After : " +roundList + " times: " + finish + " ms");
        } catch (ConcurrentModificationException ex) {
            System.out.println("Not Solve!!!! >>>>>>>>>>>>>>> found  " + ex);
            ex.printStackTrace();
        }
    }

    public abstract String solutionName();

    public static void main(String[] args) {
        ConcurrentModificationSolution[] solutions = {
                new SolveByCopyOnWriteArrayList(),
                new SolveByCopyToRemove(),
                new SolveByInnosense(),
                new SolveByIterator(),
                new SolveByJava8RemoveIf(),
                new SolveByJava8Stream(),
                new SolveBySomeSense()
        };

        for (ConcurrentModificationSolution solution :
                solutions) {
            solution.solve();
        }
    }
}

