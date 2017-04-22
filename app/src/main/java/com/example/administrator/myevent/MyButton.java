package com.example.administrator.myevent;
import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
/**
 * date:${DATA}
 * author:孟淑英
 * function:
 */

public class MyButton extends android.support.v7.widget.AppCompatButton{
    public MyButton(Context context, AttributeSet attrs) {
        super(context, attrs);
    }
    @Override
    public boolean dispatchTouchEvent(MotionEvent event) {
        Log.d("zzz", "Button分发事件");
        return super.dispatchTouchEvent(event);
    }


    //true:自己消费此事件  false:自己不处理此事件，向上一层传递
    @Override
    public boolean onTouchEvent(MotionEvent event) {
        // TODO Auto-generated method stub
        Log.d("zzz", "Button处理事件"+"true");
        switch (event.getAction()){

        }
        return true;
    }
}
