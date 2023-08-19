package com.github.kirvasilchenko.hexagon.app.user.core.service.operation;

import com.github.kirvasilchenko.hexagon.app.user.core.domain.model.User;
import com.github.kirvasilchenko.hexagon.app.user.core.port.input.GetUserOperation;
import com.github.kirvasilchenko.hexagon.app.user.core.port.output.connector.UserSessionGateway;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service("getUserFromSession")
@RequiredArgsConstructor
public class GetUserFromSession implements GetUserOperation {

    private final UserSessionGateway userGateway;

    @Override
    public User invoke(String bearer) {
        return userGateway.getUser(bearer);
    }

}
