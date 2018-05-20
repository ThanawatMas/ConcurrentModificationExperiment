package th.in.mas.thanawat.collection.experiment.concurrentmodification;

import java.util.List;

public class SolveByInnosense extends ConcurrentModificationSolution {

    @Override
    public void addItemAndReIndex(List<String> roundList, String newItem) {
        for (String item : roundList) {
            if (item.equals(newItem)) {
                roundList.remove(item);
                roundList.add(0, newItem);
            }
        }
    }

    @Override
    public String solutionName() {
        return "Innosense";
    }

    public static void main(String[] args) {
        SolveByInnosense innosense = new SolveByInnosense();
        innosense.solve();
    }
}
