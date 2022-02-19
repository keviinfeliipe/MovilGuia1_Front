package com.umb.movilguia1.io.response;

import com.umb.movilguia1.model.entity.User;

public class UserResponse {
    User user;
    Boolean error;

    public User getUserDto() {
        return user;
    }

    public void setUserDto(User user) {
        this.user = user;
    }

    public Boolean getError() {
        return error;
    }

    public void setError(Boolean error) {
        this.error = error;
    }
}
