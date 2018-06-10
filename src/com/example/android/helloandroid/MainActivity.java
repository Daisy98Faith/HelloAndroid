// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.example.android.helloandroid;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;
import java.util.Random;

public class MainActivity extends AppCompatActivity
{

    public MainActivity()
    {
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(0x7f04001b);
        ((ImageView)findViewById(0x7f0b005e)).setOnClickListener(new android.view.View.OnClickListener() {

            final MainActivity this$0;
            final String val$responses[];

            public void onClick(View view)
            {
                view = responses[(new Random()).nextInt(responses.length)];
                Toast.makeText(MainActivity.this, view, 0).show();
            }

            
            {
                this$0 = MainActivity.this;
                responses = as;
                super();
            }
        });
    }
}
