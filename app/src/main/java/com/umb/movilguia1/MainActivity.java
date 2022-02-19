package com.umb.movilguia1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.umb.movilguia1.io.UserApiAdapter;
import com.umb.movilguia1.model.dto.UserDto;
import com.umb.movilguia1.model.entity.User;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    EditText fullName;
    EditText email;
    EditText password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fullName = findViewById(R.id.create_user_et_full_name);
        email=findViewById(R.id.create_user_et_email);
        password=findViewById(R.id.create_user_et_password);
    }

    public void clean(){
        fullName.setText("");
        email.setText("");
        password.setText("");
    }

    public void saveUser(View view){
        StringBuffer message = new StringBuffer(50);

        Call<User> call = UserApiAdapter.saveUser().createUser(
                new UserDto(
                        fullName.getText().toString(),
                        email.getText().toString(),
                        password.getText().toString()
                )
        );
        call.enqueue(new Callback<User>() {

            @Override
            public void onResponse(Call<User> call, Response<User> response) {
                if (response.isSuccessful()){
                    User user = response.body();
                    Toast.makeText(MainActivity.this, "USUARIO GUARDADO", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(MainActivity.this, "EMAIL DUPLICADO", Toast.LENGTH_SHORT).show();
                }
            }
            @Override
            public void onFailure(Call<User> call, Throwable t) {
                Toast.makeText(MainActivity.this, "ERROR AL GUARDAR EL USUARIO", Toast.LENGTH_SHORT).show();
            }
        });


    }
}