package com.github.kirvasilchenko.hexagon.app.user.core.port.input;

import com.github.kirvasilchenko.hexagon.app.user.core.domain.model.User;

public interface GetUserOperation {

    User invoke(String bearer);

}
