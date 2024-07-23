package tester;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class TestClass {
    @Mock
    Squarer squarer;

    @Test
    public void testDemo() {
        assertEquals(25, new SquarerImpl().square(5));
    }

    @BeforeEach
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testSquarerService() {
//        Squarer squarer = Mockito.mock(Squarer.class);

        when(squarer.square(10)).thenReturn(100);
        int actualNum = squarer.square(10);
        assertEquals(100, actualNum);
    }

}
