// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.example.android.helloandroid;

import android.view.View;
import android.widget.Toast;
import java.util.Random;

// Referenced classes of package com.example.android.helloandroid:
//            MainActivity

class val.responses
    implements android.view.tener
{

    final MainActivity this$0;
    final String val$responses[];

    public void onClick(View view)
    {
        view = val$responses[(new Random()).nextInt(val$responses.length)];
        Toast.makeText(MainActivity.this, view, 0).show();
    }

    ()
    {
        this$0 = final_mainactivity;
        val$responses = _5B_Ljava.lang.String_3B_.this;
        super();
    }
}
