package ru.job4j.store;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import static ru.job4j.store.PositionStore.POSITIONS;

public class EmployeeStore {
    public static final List<Employee> EMPLOYEES = Arrays.asList(
            new Employee("Ivan", "Sidorov", POSITIONS.get(0), new Date(4578457865213L), "http://pngimg.com/uploads/thinking_man/thinking_man_PNG11610.png"),
            new Employee("Petr", "Savosto", POSITIONS.get(1), new Date(4578457865213L), "http://pngimg.com/uploads/thinking_man/thinking_man_PNG11612.png"),
            new Employee("Pavel", "Petrov", POSITIONS.get(1), new Date(4578452365213L), "http://pngimg.com/uploads/thinking_man/thinking_man_PNG11607.png"),
            new Employee("Alexander", "Biba", POSITIONS.get(2), new Date(4578412865213L), "http://pngimg.com/uploads/thinking_man/thinking_man_PNG11586.png"),
            new Employee("Denis", "Mohov", POSITIONS.get(3), new Date(4578412865213L), "http://pngimg.com/uploads/man/man_PNG6533.png"),
            new Employee("Vladimir", "Putin", POSITIONS.get(4), new Date(4578412865213L), "http://pngimg.com/uploads/man/man_PNG6534.png"),
            new Employee("Dmitriy", "Dindirkin", POSITIONS.get(2), new Date(4578412865213L), "http://pngimg.com/uploads/man/man_PNG6526.png"));
}
