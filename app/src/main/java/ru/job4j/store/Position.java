package ru.job4j.store;

public class Position {
    private String positionName;
    private int code;

    public Position(String positionName, int code) {
        this.positionName = positionName;
        this.code = code;
    }

    public String getPositionName() {
        return positionName;
    }

    public void setPositionName(String positionName) {
        this.positionName = positionName;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
