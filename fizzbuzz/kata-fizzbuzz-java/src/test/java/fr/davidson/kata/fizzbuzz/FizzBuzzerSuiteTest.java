package fr.davidson.kata.fizzbuzz;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

public class FizzBuzzerSuiteTest {
    @Test
    public void fizzbuzz_1() {
        assertThat("Le fizzbuzz de 1 devrait être 1", FizzBuzzer.fizzbuzz(1), is(equalTo("1")));
    }
}
