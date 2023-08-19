package com.github.kirvasilchenko.hexagon.app.user.core.port.output.connector;

import com.github.kirvasilchenko.hexagon.app.user.core.domain.model.User;

public interface UserSessionGateway {
    User getUser(String bearer);

}
