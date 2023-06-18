package com.example.intent;

import static com.example.intent.R.id;
import static com.example.intent.R.layout;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
public class MainActivity extends Activity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(layout.activity_main);
        final EditText et=(EditText)findViewById(id.editText1);
        final EditText et1=(EditText)findViewById(id.editText2);
        Button send=(Button)findViewById(id.button1);
        send.setOnClickListener(new OnClickListener()
        {
            @Override
            public void onClick(View arg0)
            {
                String s=et.getText().toString();
                String s1=et1.getText().toString();
                Intent it=new Intent(MainActivity.this,MainActivity2.class);
                it.putExtra("uname", s);
                it.putExtra("pwd", s1);
                startActivity(it);
            }
        });
    }

}
