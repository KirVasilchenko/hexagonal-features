package com.github.kirvasilchenko.hexagon.apps.hexagon.core.domain.model;

import lombok.Builder;
import lombok.Data;

import java.util.List;
import java.util.UUID;

@Data
@Builder
public class User {

    UUID id;
    String username;
    String fullName;
    String email;
    Boolean active;
    List<String> roles;

}
