package com.example.androidnew.login;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import com.example.androidnew.MainActivity;
import com.example.androidnew.R;
import com.example.androidnew.utils.MoveUtils;

import butterknife.BindView;
import butterknife.ButterKnife;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener{

    @BindView(R.id.phonenumber)
    EditText phonenumber;
    @BindView(R.id.del_phonenumber)
    ImageView delPhonenumber;
    @BindView(R.id.password)
    EditText password;
    @BindView(R.id.del_password)
    ImageView delPassword;
    @BindView(R.id.loginButton)
    Button loginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);
        //-----------------去掉标题栏--------------------------//
        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }
        //-----------------去掉标题栏--------------------------//
        init();
        initEventClick();
    }
    private void initEventClick(){
        loginButton.setOnClickListener(this);
    }
    public void init() {
        EditTextClearTools.addclerListener(phonenumber, delPhonenumber);
        EditTextClearTools.addclerListener(password, delPassword);
    }

    /**
     * 界面点击事件的写法，首先要实现接口View.OnClickListener,然后通过switch() case 方法判断点击的哪个控件
     * @param v
     */
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.loginButton:
                MoveUtils.go(LoginActivity.this,MainActivity.class);
        }
    }
}
