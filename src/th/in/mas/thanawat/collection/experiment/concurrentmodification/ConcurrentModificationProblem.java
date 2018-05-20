package th.in.mas.thanawat.collection.experiment.concurrentmodification;

import java.util.ArrayList;

public abstract class ConcurrentModificationProblem implements ConcurrentModificationSolvable {

    public final ArrayList<String> experimentData() {
        ArrayList<String> roundList = new ArrayList<>();
        roundList.add("A");
        roundList.add("B");
        roundList.add("C");
        roundList.add("D");
        return roundList;
    }
}
