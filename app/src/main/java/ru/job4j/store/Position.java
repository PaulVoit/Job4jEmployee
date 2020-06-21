package ru.job4j.store;

public class Position {
    private String positionName;
    private String positionImage;
    private int code;

    public Position(String positionName, int code, String positionImage) {
        this.positionName = positionName;
        this.positionImage = positionImage;
        this.code = code;
    }

    public String getPositionImage() {
        return positionImage;
    }

    public void setPositionImage(String positionImage) {
        this.positionImage = positionImage;
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
