// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.view.menu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;

// Referenced classes of package android.support.v7.view.menu:
//            MenuBuilder, MenuItemImpl, ListMenuItemView

public class MenuAdapter extends BaseAdapter
{

    static final int ITEM_LAYOUT;
    MenuBuilder mAdapterMenu;
    private int mExpandedIndex;
    private boolean mForceShowIcon;
    private final LayoutInflater mInflater;
    private final boolean mOverflowOnly;

    public MenuAdapter(MenuBuilder menubuilder, LayoutInflater layoutinflater, boolean flag)
    {
        mExpandedIndex = -1;
        mOverflowOnly = flag;
        mInflater = layoutinflater;
        mAdapterMenu = menubuilder;
        findExpandedIndex();
    }

    void findExpandedIndex()
    {
        MenuItemImpl menuitemimpl = mAdapterMenu.getExpandedItem();
        if (menuitemimpl != null)
        {
            ArrayList arraylist = mAdapterMenu.getNonActionItems();
            int j = arraylist.size();
            for (int i = 0; i < j; i++)
            {
                if ((MenuItemImpl)arraylist.get(i) == menuitemimpl)
                {
                    mExpandedIndex = i;
                    return;
                }
            }

        }
        mExpandedIndex = -1;
    }

    public MenuBuilder getAdapterMenu()
    {
        return mAdapterMenu;
    }

    public int getCount()
    {
        ArrayList arraylist;
        if (mOverflowOnly)
        {
            arraylist = mAdapterMenu.getNonActionItems();
        } else
        {
            arraylist = mAdapterMenu.getVisibleItems();
        }
        if (mExpandedIndex < 0)
        {
            return arraylist.size();
        } else
        {
            return arraylist.size() - 1;
        }
    }

    public boolean getForceShowIcon()
    {
        return mForceShowIcon;
    }

    public MenuItemImpl getItem(int i)
    {
        ArrayList arraylist;
        int j;
        if (mOverflowOnly)
        {
            arraylist = mAdapterMenu.getNonActionItems();
        } else
        {
            arraylist = mAdapterMenu.getVisibleItems();
        }
        j = i;
        if (mExpandedIndex >= 0)
        {
            j = i;
            if (i >= mExpandedIndex)
            {
                j = i + 1;
            }
        }
        return (MenuItemImpl)arraylist.get(j);
    }

    public volatile Object getItem(int i)
    {
        return getItem(i);
    }

    public long getItemId(int i)
    {
        return (long)i;
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        View view1 = view;
        if (view == null)
        {
            view1 = mInflater.inflate(ITEM_LAYOUT, viewgroup, false);
        }
        view = (MenuView.ItemView)view1;
        if (mForceShowIcon)
        {
            ((ListMenuItemView)view1).setForceShowIcon(true);
        }
        view.initialize(getItem(i), 0);
        return view1;
    }

    public void notifyDataSetChanged()
    {
        findExpandedIndex();
        super.notifyDataSetChanged();
    }

    public void setForceShowIcon(boolean flag)
    {
        mForceShowIcon = flag;
    }

    static 
    {
        ITEM_LAYOUT = android.support.v7.appcompat.R.layout.abc_popup_menu_item_layout;
    }
}
