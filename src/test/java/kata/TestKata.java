package kata;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

public class TestKata {

    @Test
    public void testSomething() {
        assertThat("Nein", equalTo("Ja"));
    }
}
