package com.example.intent;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.TextView;
public class MainActivity2 extends Activity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        TextView tv=(TextView)findViewById(R.id.textView1);
        TextView tv1=(TextView)findViewById(R.id.textView2);
        tv.setText("User Name : "+getIntent().getExtras().getString("uname"));
        tv1.setText("Password : "+getIntent().getExtras().getString("pwd"));
    }


}
