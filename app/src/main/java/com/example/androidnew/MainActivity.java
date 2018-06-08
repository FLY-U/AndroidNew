package com.example.androidnew;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;
import android.widget.ImageView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.phonenumber)
    EditText phonenumber;
    @BindView(R.id.del_phonenumber)
    ImageView delPhonenumber;
    @BindView(R.id.password)
    EditText password;
    @BindView(R.id.del_password)
    ImageView delPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        //-----------------去掉标题栏--------------------------//
        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }
        //-----------------去掉标题栏--------------------------//
    }
}
