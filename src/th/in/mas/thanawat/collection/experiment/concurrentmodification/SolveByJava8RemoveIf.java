package th.in.mas.thanawat.collection.experiment.concurrentmodification;

import java.util.List;

public class SolveByJava8RemoveIf extends ConcurrentModificationSolution {

    @Override
    public void addItemAndReIndex(List<String> roundList, String newItem) {
        roundList.removeIf(item -> item.equals(newItem));
        roundList.add(0, newItem);
    }

    @Override
    public String solutionName() {
        return "Java8 RemoveIf";
    }

    public static void main(String[] args) {
        SolveByJava8RemoveIf java8RemoveIf = new SolveByJava8RemoveIf();
        java8RemoveIf.solve();
    }
}
