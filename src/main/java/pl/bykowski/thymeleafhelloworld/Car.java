package pl.bykowski.thymeleafhelloworld;

public class Car {
    private String mark;
    private String model;

    public Car(String mark, String model) {
        this.mark = mark;
        this.model = model;
    }

    public Car() {
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Car{" +
                "mark='" + mark + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
