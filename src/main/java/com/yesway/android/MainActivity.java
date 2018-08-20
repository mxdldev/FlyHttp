package com.yesway.android;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.yesway.android.net.ApiManager;
import com.yesway.android.net.dto.base.BaseHeader;
import com.yesway.android.net.dto.response.LoginResponse;
import com.yesway.android.net.http.Response;
import com.yesway.android.net.model.IUserModel;

public class MainActivity extends AppCompatActivity {

  @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.btn).setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                IUserModel userModel = ApiManager.getInstance().getUserModel();

                userModel.login("13621310260", "123", new Response<LoginResponse>(MainActivity.this) {
                    @Override
                    public void onSuccess(LoginResponse response) {
                        Log.v("MYTAG","onSuccess...");
                        LoginResponse.Data data = response.getData();
                    }

                    @Override
                    public void onStart() {
                        Log.v("MYTAG","onStart...");
                    }

                    @Override
                    public void onFail() {
                        Log.v("MYTAG","onFail...");
                    }

                    @Override
                    public void onFinish() {
                        Log.v("MYTAG","onFinish...");
                    }
                });        
            }
        });
        
    }
}
