package com.example.administrator.myevent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;

import static android.R.attr.button;
public class MainActivity extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }
    //如果返回为true 不向下分发。如果返回为false 返回上一级处理  super.dispatchTouchEvent(ev)向下分发
    @Override
    public boolean dispatchTouchEvent(MotionEvent ev){
        // TODO Auto-generated method stub
        Log.d("zzz", "Activity-分发事件");
        return super.dispatchTouchEvent(ev);
    }
    //如果返回true自己处理。返回false交给上一级处理。
    @Override
    public boolean onTouchEvent(MotionEvent event){
        switch(event.getAction()){
            case MotionEvent.ACTION_DOWN:
                Log.d("zzz", "按下");
                break;
            case MotionEvent.ACTION_UP:
                Log.d("zzz", "抬起");
                break;
            case MotionEvent.ACTION_MOVE:
                Log.d("zzz", "移动");
                break;
        }
        Log.d("zzz", "Activity-处理事件");
        return super.onTouchEvent(event);
    }
    private void initView(){
        MyButton button= (MyButton) findViewById(R.id.button1);
    }
}
