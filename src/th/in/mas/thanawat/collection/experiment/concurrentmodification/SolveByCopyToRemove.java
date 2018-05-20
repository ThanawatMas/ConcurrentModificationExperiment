package th.in.mas.thanawat.collection.experiment.concurrentmodification;

import java.util.ArrayList;
import java.util.List;

public class SolveByCopyToRemove extends ConcurrentModificationSolution {

    @Override
    public void addItemAndReIndex(List<String> roundList, String newItem) {
        ArrayList<String> copy = new ArrayList<>();
        for (String item : roundList) {
            if (item.equals(newItem)) {
                copy.add(item);
            }
        }

        roundList.removeAll(copy);

        roundList.add(0, newItem);
    }

    @Override
    public String solutionName() {
        return "CopyToRemove";
    }

    public static void main(String[] args) {
        SolveByCopyToRemove someSense = new SolveByCopyToRemove();
        someSense.solve();
    }
}
