package com.github.kirvasilchenko.hexagon.app.user.core.port.output.gateway;

import com.github.kirvasilchenko.hexagon.app.user.core.domain.model.User;

public interface UserPersistenceGateway {
    User getUser(String bearer);

}
