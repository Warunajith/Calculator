package com.kelani.uni.v5.operation;

import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class OperationFactoryTest {

    //test cases
    //1.if the operator is add ->should return an object of AddOperation class
@Test
    public void should_return_AddOperation_object_when_operator_is_add()
    {
        OperationFactory operationFactory=new OperationFactory();
        Operation operation=operationFactory.getInstance("add");

        //verify that the operation object is an instance of AddOperation class
        assertThat(operation, instanceOf(AddOperation.class));
    }
        //2.
        public void should_return_SubOperation_object_when_operator_is_sub()
        {
            OperationFactory operationFactory=new OperationFactory();
            Operation operation=operationFactory.getInstance("sub");

            //verify that the operation object is an instance of AddOperation class
            assertThat(operation, instanceOf(SubOperation.class));
        }

}