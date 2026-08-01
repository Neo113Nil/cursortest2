package k;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.util.ArrayList;

/* renamed from: k.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0155j extends BaseAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final MenuC0158m f2682a;

    /* renamed from: b, reason: collision with root package name */
    public int f2683b = -1;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2684c;
    public final boolean d;

    /* renamed from: e, reason: collision with root package name */
    public final LayoutInflater f2685e;

    /* renamed from: f, reason: collision with root package name */
    public final int f2686f;

    public C0155j(MenuC0158m menuC0158m, LayoutInflater layoutInflater, boolean z2, int i) {
        this.d = z2;
        this.f2685e = layoutInflater;
        this.f2682a = menuC0158m;
        this.f2686f = i;
        a();
    }

    public final void a() {
        MenuC0158m menuC0158m = this.f2682a;
        C0160o c0160o = menuC0158m.f2706v;
        if (c0160o != null) {
            menuC0158m.i();
            ArrayList arrayList = menuC0158m.f2694j;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((C0160o) arrayList.get(i)) == c0160o) {
                    this.f2683b = i;
                    return;
                }
            }
        }
        this.f2683b = -1;
    }

    @Override // android.widget.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C0160o getItem(int i) {
        ArrayList l2;
        MenuC0158m menuC0158m = this.f2682a;
        if (this.d) {
            menuC0158m.i();
            l2 = menuC0158m.f2694j;
        } else {
            l2 = menuC0158m.l();
        }
        int i2 = this.f2683b;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return (C0160o) l2.get(i);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        ArrayList l2;
        MenuC0158m menuC0158m = this.f2682a;
        if (this.d) {
            menuC0158m.i();
            l2 = menuC0158m.f2694j;
        } else {
            l2 = menuC0158m.l();
        }
        return this.f2683b < 0 ? l2.size() : l2.size() - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        boolean z2 = false;
        if (view == null) {
            view = this.f2685e.inflate(this.f2686f, viewGroup, false);
        }
        int i2 = getItem(i).f2716b;
        int i3 = i - 1;
        int i4 = i3 >= 0 ? getItem(i3).f2716b : i2;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        if (this.f2682a.m() && i2 != i4) {
            z2 = true;
        }
        listMenuItemView.setGroupDividerEnabled(z2);
        InterfaceC0171z interfaceC0171z = (InterfaceC0171z) view;
        if (this.f2684c) {
            listMenuItemView.setForceShowIcon(true);
        }
        interfaceC0171z.a(getItem(i));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
