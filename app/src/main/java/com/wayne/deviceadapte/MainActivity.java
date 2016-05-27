package com.wayne.deviceadapte;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("Main", "onCreate( " + savedInstanceState + ")");

        setContentView(R.layout.activity_main);

      TextView textInfo= (TextView) findViewById(R.id.device_info);
        if (textInfo != null) {
            //显示屏幕信息
            //获取手机硬件屏幕的各种参数
            DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            //获取屏幕的密度，dpi，用于检测手机
            //根据不同的密度来设置不同的图片
            int dpi=displayMetrics.densityDpi;
            //获取屏幕的宽度和高度 ,单位像素
            int width=displayMetrics.widthPixels;

            int height= displayMetrics.heightPixels;

            int wdp=width/(dpi/160);//当前屏幕方向 宽度的dp
            int hdp=height/(dpi /160);
            textInfo.setText("dpi="+dpi+"---wdp="+wdp+"---hdp="+hdp);
        }
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("Main", "onRestart");
    }

    @Override
    protected void onDestroy() {
        Log.d("Main", "onDestroy ");
        super.onDestroy();
    }
}
