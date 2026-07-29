package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class ZB extends BaseAdapter {
    public final MenuC0825cC a;
    public int b = -1;
    public boolean c;
    public final boolean d;
    public final LayoutInflater e;
    public final int f;

    public ZB(MenuC0825cC menuC0825cC, LayoutInflater layoutInflater, boolean z, int i) {
        this.d = z;
        this.e = layoutInflater;
        this.a = menuC0825cC;
        this.f = i;
        a();
    }

    public final void a() {
        MenuC0825cC menuC0825cC = this.a;
        C1284jC c1284jC = menuC0825cC.v;
        if (c1284jC != null) {
            menuC0825cC.i();
            ArrayList arrayList = menuC0825cC.j;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((C1284jC) arrayList.get(i)) == c1284jC) {
                    this.b = i;
                    return;
                }
            }
        }
        this.b = -1;
    }

    @Override // android.widget.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C1284jC getItem(int i) {
        ArrayList l;
        boolean z = this.d;
        MenuC0825cC menuC0825cC = this.a;
        if (z) {
            menuC0825cC.i();
            l = menuC0825cC.j;
        } else {
            l = menuC0825cC.l();
        }
        int i2 = this.b;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return (C1284jC) l.get(i);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        ArrayList l;
        boolean z = this.d;
        MenuC0825cC menuC0825cC = this.a;
        if (z) {
            menuC0825cC.i();
            l = menuC0825cC.j;
        } else {
            l = menuC0825cC.l();
        }
        return this.b < 0 ? l.size() : l.size() - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        boolean z = false;
        if (view == null) {
            view = this.e.inflate(this.f, viewGroup, false);
        }
        int i2 = getItem(i).b;
        int i3 = i - 1;
        int i4 = i3 >= 0 ? getItem(i3).b : i2;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        if (this.a.m() && i2 != i4) {
            z = true;
        }
        listMenuItemView.setGroupDividerEnabled(z);
        InterfaceC2273yC interfaceC2273yC = (InterfaceC2273yC) view;
        if (this.c) {
            listMenuItemView.setForceShowIcon(true);
        }
        interfaceC2273yC.a(getItem(i));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
