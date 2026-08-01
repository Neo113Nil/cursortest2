package k;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.util.ArrayList;

/* renamed from: k.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0165j extends BaseAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final MenuC0168m f2685a;

    /* renamed from: b, reason: collision with root package name */
    public int f2686b = -1;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2687c;
    public final boolean d;

    /* renamed from: e, reason: collision with root package name */
    public final LayoutInflater f2688e;

    /* renamed from: f, reason: collision with root package name */
    public final int f2689f;

    public C0165j(MenuC0168m menuC0168m, LayoutInflater layoutInflater, boolean z2, int i) {
        this.d = z2;
        this.f2688e = layoutInflater;
        this.f2685a = menuC0168m;
        this.f2689f = i;
        a();
    }

    public final void a() {
        MenuC0168m menuC0168m = this.f2685a;
        C0170o c0170o = menuC0168m.f2709v;
        if (c0170o != null) {
            menuC0168m.i();
            ArrayList arrayList = menuC0168m.f2697j;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((C0170o) arrayList.get(i)) == c0170o) {
                    this.f2686b = i;
                    return;
                }
            }
        }
        this.f2686b = -1;
    }

    @Override // android.widget.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C0170o getItem(int i) {
        ArrayList l2;
        MenuC0168m menuC0168m = this.f2685a;
        if (this.d) {
            menuC0168m.i();
            l2 = menuC0168m.f2697j;
        } else {
            l2 = menuC0168m.l();
        }
        int i2 = this.f2686b;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return (C0170o) l2.get(i);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        ArrayList l2;
        MenuC0168m menuC0168m = this.f2685a;
        if (this.d) {
            menuC0168m.i();
            l2 = menuC0168m.f2697j;
        } else {
            l2 = menuC0168m.l();
        }
        return this.f2686b < 0 ? l2.size() : l2.size() - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        boolean z2 = false;
        if (view == null) {
            view = this.f2688e.inflate(this.f2689f, viewGroup, false);
        }
        int i2 = getItem(i).f2719b;
        int i3 = i - 1;
        int i4 = i3 >= 0 ? getItem(i3).f2719b : i2;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        if (this.f2685a.m() && i2 != i4) {
            z2 = true;
        }
        listMenuItemView.setGroupDividerEnabled(z2);
        InterfaceC0181z interfaceC0181z = (InterfaceC0181z) view;
        if (this.f2687c) {
            listMenuItemView.setForceShowIcon(true);
        }
        interfaceC0181z.a(getItem(i));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
