package com.kodilla.spring.calculator;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorTestSuite {

    @Test
    public void testCalculations(){
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        double add = calculator.add(2,2);
        double sub = calculator.sub(6,2);
        double mul = calculator.mul(2,2);
        double div = calculator.div(4,1);

        //Then
        Assert.assertEquals(4.0,add,0.0001);
        Assert.assertEquals(4.0,sub,0.0001);
        Assert.assertEquals(4.0,mul,0.0001);
        Assert.assertEquals(4.0,div,0.0001);
    }

}
