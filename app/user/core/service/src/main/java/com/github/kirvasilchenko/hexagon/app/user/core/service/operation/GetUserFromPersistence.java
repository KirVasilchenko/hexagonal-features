package com.github.kirvasilchenko.hexagon.app.user.core.service.operation;

import com.github.kirvasilchenko.hexagon.app.user.core.domain.model.User;
import com.github.kirvasilchenko.hexagon.app.user.core.port.input.GetUserOperation;
import com.github.kirvasilchenko.hexagon.app.user.core.port.output.gateway.UserPersistenceGateway;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service("getUserFromPersistence")
@RequiredArgsConstructor
public class GetUserFromPersistence implements GetUserOperation {

    private final UserPersistenceGateway userGateway;

    @Override
    public User invoke(String bearer) {
        return userGateway.getUser(bearer);
    }

}
