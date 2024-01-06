package seminar6.hw;

import java.util.List;

public class ListComparer {
    private List<Integer> list1;
    private List<Integer> list2;

    public ListComparer(List<Integer> list1, List<Integer> list2) {
        this.list1 = list1;
        this.list2 = list2;
    }

    public double calculateAverage(List<Integer> lst) {
        if (lst.isEmpty()) {
            return 0;
        }

        int sum = 0;
        for (int num : lst) {
            sum += num;
        }

        return (double) sum / lst.size();
    }

    public String compareLists() {
        double avgList1 = calculateAverage(list1);
        double avgList2 = calculateAverage(list2);

        if (avgList1 > avgList2) {
            return "Первый список имеет большее среднее значение";
        } else if (avgList2 > avgList1) {
            return "Второй список имеет большее среднее значение";
        } else {
            return "Средние значения равны";
        }
    }
}
