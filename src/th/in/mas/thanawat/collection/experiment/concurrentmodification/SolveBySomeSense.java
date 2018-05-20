package th.in.mas.thanawat.collection.experiment.concurrentmodification;

import java.util.List;

public class SolveBySomeSense extends ConcurrentModificationSolution {

    @Override
    public void addItemAndReIndex(List<String> roundList, String newItem) {
        for (String item : roundList) {
            if (item.equals(newItem)) {
                roundList.remove(item);
                roundList.add(0, newItem);
                break;
            }
        }
    }

    @Override
    public String solutionName() {
        return "SomeSense";
    }

    public static void main(String[] args) {
        SolveBySomeSense someSense = new SolveBySomeSense();
        someSense.solve();
    }
}
