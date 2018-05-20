package th.in.mas.thanawat.collection.experiment.concurrentmodification;

import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class SolveByJava8Stream extends ConcurrentModificationSolution {

    @Override
    public void addItemAndReIndex(List<String> roundList, String newItem) {
        roundList = roundList
                .stream()
                .filter(item -> !item.equals(newItem))
                .map(Object::toString)
                .collect(toList());

        System.out.println("roundList : >>>" +  Arrays.toString(roundList.toArray()));

        roundList.add(0, newItem);

        System.out.println("roundList : >>>" +  Arrays.toString(roundList.toArray()));
    }

    @Override
    public String solutionName() {
        return "Java8 Stream";
    }

    public static void main(String[] args) {
        SolveByJava8Stream java8Stream = new SolveByJava8Stream();
        java8Stream.solve();
    }
}
