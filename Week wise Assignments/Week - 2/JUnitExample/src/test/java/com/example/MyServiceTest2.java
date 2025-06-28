//Verifying Interactions

package com.example;

import org.junit.Test;
import static org.mockito.Mockito.*;

public class MyServiceTest2 {

    @Test
    public void testVerifyInteraction() {
        ExternalApi mockApi = mock(ExternalApi.class);
        MyService service = new MyService(mockApi);

        service.fetchData();

        verify(mockApi).getData();
    }
}
