package com.example.user.qrcode;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;

public class CodeViewActivity extends AppCompatActivity {

    @BindView(R.id.codeInfo)
    TextView codeInfo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.code_review);
        ButterKnife.bind(this);
        Intent intent=getIntent();
        if(intent.getExtras()!=null){
            codeInfo.setText(intent.getExtras().getString("qrCode"));
        }
        else{
            Toast.makeText(this,"No QrCode Scanned",Toast.LENGTH_LONG).show();
        }
    }
}
