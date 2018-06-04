package com.personal.domain;

import com.fasterxml.jackson.annotation.JsonCreator;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Setter
@Getter
@Builder
@AllArgsConstructor(onConstructor = @__(@JsonCreator))
public class User implements Serializable {
    private Integer id;
    private String name;
    private String fullName;
    private String nickName;
    private String password;
}
