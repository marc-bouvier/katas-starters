package fr.davidson.kata.fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class FizzBuzzerSuiteTest {
    @Test
    void fizzbuzz_1() {
        assertThat("Le fizzbuzz de 1 devrait être 1", FizzBuzzer.fizzbuzz(1), is(equalTo("1")));
    }
}
