package com.github.kirvasilchenko.hexagon.app.api.core.port.output;

public interface VerifyClientOperation {

    void invoke(String clientId, String clientSecret);

}
