package th.in.mas.thanawat.collection.experiment.concurrentmodification;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class SolveByCopyOnWriteArrayList extends ConcurrentModificationSolution {

    @Override
    public void addItemAndReIndex(List<String> roundItem, String newItem) {
        List<String> copyRoundItem = new CopyOnWriteArrayList<>(roundItem);
        for(String item: copyRoundItem) {
            if(item.equals(newItem)) {
                roundItem.remove(item);
            }
        }
        roundItem.add(0, newItem);
    }

    @Override
    public String solutionName() {
        return "CopyOnWriteArrayList";
    }

    public static void main(String[] args) {
        SolveByCopyOnWriteArrayList copyOnWriteArrayList = new SolveByCopyOnWriteArrayList();
        copyOnWriteArrayList.solve();
    }
}
