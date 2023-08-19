package com.github.kirvasilchenko.hexagon.apps.hexagon.core.port.output.operation;

import com.github.kirvasilchenko.hexagon.apps.hexagon.core.domain.model.User;

public interface GetUserFromSessionOperation {

    User invoke();

}
