package org.example.Task03;

import java.util.List;
public class Calc {
    public Double sum(List<? extends Number> items) { //<?> - любой тип данных
        double sum = 0;
        for (Number i : items)
            sum += i.doubleValue();
        return sum;
    }

    public Double multiply(List<? extends Number> items) {
        double mul = 1;
        for (Number i : items)
            mul *= i.doubleValue();
        return mul;
    }

    public Double division(List<? extends Number> items) {
        double div = items.get(0).doubleValue();
        for (Number i : items.subList(1, items.size()))
            div /= i.doubleValue();
        return div;
    }
}




