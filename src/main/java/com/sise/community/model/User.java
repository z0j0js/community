package com.sise.community.model;

import lombok.Data;

@Data
public class User {

    private Integer id;
    private String name;
    private String accountId;
    private String token;
    private String avatarUrl;

}
