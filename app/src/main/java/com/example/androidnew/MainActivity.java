package com.example.androidnew;

import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.ImageView;

import com.example.androidnew.login.EditTextClearTools;
import com.example.androidnew.utils.SystemBarTintManager;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //-----------------去掉标题栏--------------------------//
        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }
        //-----------------去掉标题栏--------------------------//
        initWindow();
    }
    //初始化窗体布局,沉浸式顶部标题栏实现
    private void initWindow(){
        SystemBarTintManager tintManager;
        //由于沉浸式状态栏需要在Android4.4.4以上才能使用
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
            getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_NAVIGATION);
            tintManager = new SystemBarTintManager(this);
            tintManager.setStatusBarTintColor(getResources().getColor(R.color.lightskyblue));
            tintManager.setStatusBarTintEnabled(true);
        }
    }
}
