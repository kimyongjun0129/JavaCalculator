package lv3;

import java.util.ArrayDeque;
import java.util.Optional;
import java.util.Queue;

public class Data {
    // 속성
    final private Queue<Optional<Double>> resultList = new ArrayDeque<>();

    // 생성자

    // 기능
    public void setData(Optional<Double> data) {
        if (data.isEmpty()) return;
        resultList.add(data);
    }

    public void getData() {
        System.out.println(resultList);
    }

    public void deleteFirstData() {
        resultList.remove();
    }

    public void getFormatData(int data) {
        System.out.println(resultList.stream()
                .filter(num -> num.isPresent() && num.get() >= data)
                .map(num -> num.get())
                .toList());
    }
}
