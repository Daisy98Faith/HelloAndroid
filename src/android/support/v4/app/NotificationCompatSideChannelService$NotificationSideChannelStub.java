// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.app.Notification;
import android.os.RemoteException;

// Referenced classes of package android.support.v4.app:
//            NotificationCompatSideChannelService

private class this._cls0 extends this._cls0
{

    final NotificationCompatSideChannelService this$0;

    public void cancel(String s, int i, String s1)
        throws RemoteException
    {
        long l;
        checkPermission(getCallingUid(), s);
        l = clearCallingIdentity();
        NotificationCompatSideChannelService.this.cancel(s, i, s1);
        restoreCallingIdentity(l);
        return;
        s;
        restoreCallingIdentity(l);
        throw s;
    }

    public void cancelAll(String s)
    {
        long l;
        checkPermission(getCallingUid(), s);
        l = clearCallingIdentity();
        NotificationCompatSideChannelService.this.cancelAll(s);
        restoreCallingIdentity(l);
        return;
        s;
        restoreCallingIdentity(l);
        throw s;
    }

    public void notify(String s, int i, String s1, Notification notification)
        throws RemoteException
    {
        long l;
        checkPermission(getCallingUid(), s);
        l = clearCallingIdentity();
        NotificationCompatSideChannelService.this.notify(s, i, s1, notification);
        restoreCallingIdentity(l);
        return;
        s;
        restoreCallingIdentity(l);
        throw s;
    }

    ()
    {
        this$0 = NotificationCompatSideChannelService.this;
        super();
    }
}
