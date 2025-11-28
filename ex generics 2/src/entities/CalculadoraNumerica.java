package entities;

public class CalculadoraNumerica<T extends Number> {
    public double somar(T a, T b){
        return a.doubleValue() + b.doubleValue();
    }
}
