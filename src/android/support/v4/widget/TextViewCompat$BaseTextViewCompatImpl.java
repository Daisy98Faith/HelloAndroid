// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;

import android.graphics.drawable.Drawable;
import android.widget.TextView;

// Referenced classes of package android.support.v4.widget:
//            TextViewCompat, TextViewCompatGingerbread

static class 
    implements 
{

    public Drawable[] getCompoundDrawablesRelative(TextView textview)
    {
        return TextViewCompatGingerbread.getCompoundDrawablesRelative(textview);
    }

    public int getMaxLines(TextView textview)
    {
        return TextViewCompatGingerbread.getMaxLines(textview);
    }

    public int getMinLines(TextView textview)
    {
        return TextViewCompatGingerbread.getMinLines(textview);
    }

    public void setCompoundDrawablesRelative(TextView textview, Drawable drawable, Drawable drawable1, Drawable drawable2, Drawable drawable3)
    {
        textview.setCompoundDrawables(drawable, drawable1, drawable2, drawable3);
    }

    public void setCompoundDrawablesRelativeWithIntrinsicBounds(TextView textview, int i, int j, int k, int l)
    {
        textview.setCompoundDrawablesWithIntrinsicBounds(i, j, k, l);
    }

    public void setCompoundDrawablesRelativeWithIntrinsicBounds(TextView textview, Drawable drawable, Drawable drawable1, Drawable drawable2, Drawable drawable3)
    {
        textview.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable1, drawable2, drawable3);
    }

    public void setTextAppearance(TextView textview, int i)
    {
        TextViewCompatGingerbread.setTextAppearance(textview, i);
    }

    ()
    {
    }
}
