package fr.davidson.kata;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class KataSuiteTest {
    @Test
    void hello_world() {
        assertThat("Le fizzbuzz de 1 devrait être 1", Hello.hello("World!"), is(equalTo("Hello World!")));
    }
}
