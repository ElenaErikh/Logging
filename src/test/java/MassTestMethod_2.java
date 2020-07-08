import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)

public class MassTestMethod_2 {
    private int[] arr;
    private int value1;
    private int value2;
    private boolean b;

    WorkWithArrays wwa;

    public MassTestMethod_2(int[] arr, int value1, int value2, boolean b) {
        this.arr = arr;
        this.value1 = value1;
        this.value2 = value2;
        this.b = b;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {new int[]{1, 1, 1, 4, 4, 1, 4, 4}, 1, 4, true},
                {new int[]{1, 1, 1, 1, 1, 1},  1, 4, false},
                {new int[]{4, 4, 4, 4}, 1, 4, false},
                {new int[]{1, 4, 4, 1, 1, 4, 3}, 1, 4, false},
        });
    }

    @Before
    public void init() {
        wwa = new WorkWithArrays();
    }

    @Test
    public void testAdd() {
        Assert.assertEquals(wwa.method_2(arr, value1, value2), b);
    }





}
