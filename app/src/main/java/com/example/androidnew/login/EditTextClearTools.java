package com.example.androidnew.login;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

/**
 * 监听输入框的输入事件，如果输入的内容大于0的话则显示删除图标
 */
public class EditTextClearTools {
    public static void addclerListener(final EditText e1, final ImageView m1){
        e1.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                // 监听如果输入串长度大于0那么就显示clear按钮。
                String s1 = s+"";
                if(s.length()>0){
                    m1.setVisibility(View.VISIBLE);
                }else{
                    m1.setVisibility(View.INVISIBLE);
                }
            }
        });
        m1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                e1.setText("");
            }
        });
    }
}
