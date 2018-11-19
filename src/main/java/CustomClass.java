/**
 * Created by mtumilowicz on 2018-11-19.
 */
public class CustomClass implements Interface1, Interface2 {
    public String get() {
        return "CustomClass";
    }

    String getI1() {
        return Interface1.super.get();
    }

    String getI2() {
        return Interface2.super.get();
    }
}
