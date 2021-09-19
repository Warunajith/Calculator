package com.kelani.uni.v5.operation;


import org.junit.Test;


import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class DivOperationTest {

    @Test
    public void should_divide_positive_values(){
        DivOperation divOperation= new DivOperation();
        Double result=divOperation.execute(new Double[]{6.0,2.0});

        assertThat(result, is(3.0));
    }

    @Test
    public void should_not_divide_by_zero() throws InvalidCalOperationExeption {
        DivOperation divOperation= new DivOperation();
        Double result=divOperation.execute(new Double[]{6.0,0.0});

    }

}