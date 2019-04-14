package com.kodilla.testing.shape;

public class Square implements Shape {

    private String shapeName;
    private Double field;

    public Square(String shapeName, Double field) {
        this.shapeName = shapeName;
        this.field = field;
    }
    public String getShapeName(){
        return shapeName;
    }
    public Double getField(){
        return field;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Square square = (Square) o;

        if (!shapeName.equals(square.shapeName)) return false;
        return field.equals(square.field);

    }

    @Override
    public int hashCode() {
        int result = shapeName.hashCode();
        result = 31 * result + field.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return  "shape = '" + shapeName + '\'' +
                ", field = " + field;
    }
}
