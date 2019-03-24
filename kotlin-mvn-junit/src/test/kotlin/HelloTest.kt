
import org.junit.Test
import kotlin.test.assertEquals

class HelloTest {

    @Test
    fun test_hello_world_function() {
        assertEquals(hello("World!"),"Hello World!")
    }


    @Test
    fun test_hello_world_class() {
        assertEquals(Hello("World!").hello(),"Hello World!")
    }
}