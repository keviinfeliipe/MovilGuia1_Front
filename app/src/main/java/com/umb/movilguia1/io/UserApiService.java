package com.umb.movilguia1.io;



import com.umb.movilguia1.model.dto.UserDto;
import com.umb.movilguia1.model.entity.User;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface UserApiService {

    @POST("user/save")
    Call<User> createUser(@Body UserDto userDto);

}
