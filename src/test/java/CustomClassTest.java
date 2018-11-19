import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

/**
 * Created by mtumilowicz on 2018-11-19.
 */
public class CustomClassTest {

    private CustomClass cc = new CustomClass();

    @Test
    public void get() {
        assertThat(cc.get(), is("CustomClass"));
    }

    @Test
    public void getI1() {
        assertThat(cc.getI1(), is("Interface1"));
    }

    @Test
    public void getI2() {
        assertThat(cc.getI2(), is("Interface2"));
    }
}