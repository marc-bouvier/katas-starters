import org.hamcrest.CoreMatchers
import org.junit.Assert
import org.junit.Test


class FizzBuzzTest {

    @Test
    fun test_fizzbuzz_1() {
        Assert.assertThat("Le fizzbuzz de 1 devrait être 1",
                fizzbuzz(1), CoreMatchers.`is`(CoreMatchers.equalTo("1")))
    }
}