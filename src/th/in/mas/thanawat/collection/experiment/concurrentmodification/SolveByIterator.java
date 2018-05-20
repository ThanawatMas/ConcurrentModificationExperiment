package th.in.mas.thanawat.collection.experiment.concurrentmodification;

import java.util.Iterator;
import java.util.List;

public class SolveByIterator extends ConcurrentModificationSolution {

    @Override
    public void addItemAndReIndex(List<String> roundItem, String newItem) {
        Iterator iterator = roundItem.iterator();
        while(iterator.hasNext()) {
            String item = (String) iterator.next();
            if(item.equals(newItem)) {
                iterator.remove();
                break;
            }
        }
        roundItem.add(0, newItem);
    }

    @Override
    public String solutionName() {
        return "Iterator";
    }

    public static void main(String[] args) {
        SolveByIterator iterator = new SolveByIterator();
        iterator.solve();
    }
}
