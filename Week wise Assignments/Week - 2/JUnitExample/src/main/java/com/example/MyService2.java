//Verifying Interactions

package com.example;
public class MyService2 {
    private ExternalApi2 externalApi;

    public MyService2(ExternalApi2 externalApi) {
        this.externalApi = externalApi;
    }

    public String fetchData() {
        return externalApi.getData();
    }
}
