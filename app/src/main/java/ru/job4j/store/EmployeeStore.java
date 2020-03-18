package ru.job4j.store;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import static ru.job4j.store.PositionStore.POSITIONS;

public class EmployeeStore {
    public static final List<Employee> EMPLOYEES = Arrays.asList(
            new Employee("Ivan", "Sidorov", POSITIONS.get(0), new Date(4578457865213L), "http://photo.png"),
            new Employee("Petr", "Savosto", POSITIONS.get(1), new Date(4578457865213L), "http://photo2.png"),
            new Employee("Pavel", "Petrov", POSITIONS.get(1), new Date(4578452365213L), "http://photo3.png"),
            new Employee("Alexander", "Biba", POSITIONS.get(2), new Date(4578412865213L), "http://photo4.png"),
            new Employee("Denis", "Mohov", POSITIONS.get(3), new Date(4578412865213L), "http://photo5.png"),
            new Employee("Vladimir", "Putin", POSITIONS.get(4), new Date(4578412865213L), "http://photo6.png"),
            new Employee("Dmitriy", "Dindirkin", POSITIONS.get(2), new Date(4578412865213L), "http://photo7.png"));
}
