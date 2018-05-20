package th.in.mas.thanawat.collection.experiment.concurrentmodification;

import java.util.List;

public interface ConcurrentModificationSolvable {
    void addItemAndReIndex(List<String> roundItem, String newItem);
}
