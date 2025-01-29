package com.userservice.models;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class Session extends BaseModel {
    private Long id;
    private String token;
    private User user;
    private Date expiringAt;
}
