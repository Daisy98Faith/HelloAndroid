// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.content;

import android.util.Log;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

// Referenced classes of package android.support.v4.content:
//            ModernAsyncTask

class this._cls0 extends FutureTask
{

    final ModernAsyncTask this$0;

    protected void done()
    {
        try
        {
            Object obj = get();
            postResultIfNotInvoked(obj);
            return;
        }
        catch (InterruptedException interruptedexception)
        {
            Log.w("AsyncTask", interruptedexception);
            return;
        }
        catch (ExecutionException executionexception)
        {
            throw new RuntimeException("An error occurred while executing doInBackground()", executionexception.getCause());
        }
        catch (CancellationException cancellationexception)
        {
            postResultIfNotInvoked(null);
        }
        catch (Throwable throwable)
        {
            throw new RuntimeException("An error occurred while executing doInBackground()", throwable);
        }
    }

    (Callable callable)
    {
        this$0 = ModernAsyncTask.this;
        super(callable);
    }
}
