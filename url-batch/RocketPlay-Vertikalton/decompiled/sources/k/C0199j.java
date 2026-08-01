package k;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.util.ArrayList;

/* renamed from: k.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0199j extends BaseAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final MenuC0202m f3181a;

    /* renamed from: b, reason: collision with root package name */
    public int f3182b = -1;

    /* renamed from: c, reason: collision with root package name */
    public boolean f3183c;
    public final boolean d;

    /* renamed from: e, reason: collision with root package name */
    public final LayoutInflater f3184e;

    /* renamed from: f, reason: collision with root package name */
    public final int f3185f;

    public C0199j(MenuC0202m menuC0202m, LayoutInflater layoutInflater, boolean z2, int i) {
        this.d = z2;
        this.f3184e = layoutInflater;
        this.f3181a = menuC0202m;
        this.f3185f = i;
        a();
    }

    public final void a() {
        MenuC0202m menuC0202m = this.f3181a;
        C0204o c0204o = menuC0202m.f3205v;
        if (c0204o != null) {
            menuC0202m.i();
            ArrayList arrayList = menuC0202m.f3193j;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((C0204o) arrayList.get(i)) == c0204o) {
                    this.f3182b = i;
                    return;
                }
            }
        }
        this.f3182b = -1;
    }

    @Override // android.widget.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C0204o getItem(int i) {
        ArrayList l2;
        MenuC0202m menuC0202m = this.f3181a;
        if (this.d) {
            menuC0202m.i();
            l2 = menuC0202m.f3193j;
        } else {
            l2 = menuC0202m.l();
        }
        int i2 = this.f3182b;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return (C0204o) l2.get(i);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        ArrayList l2;
        MenuC0202m menuC0202m = this.f3181a;
        if (this.d) {
            menuC0202m.i();
            l2 = menuC0202m.f3193j;
        } else {
            l2 = menuC0202m.l();
        }
        return this.f3182b < 0 ? l2.size() : l2.size() - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        boolean z2 = false;
        if (view == null) {
            view = this.f3184e.inflate(this.f3185f, viewGroup, false);
        }
        int i2 = getItem(i).f3215b;
        int i3 = i - 1;
        int i4 = i3 >= 0 ? getItem(i3).f3215b : i2;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        if (this.f3181a.m() && i2 != i4) {
            z2 = true;
        }
        listMenuItemView.setGroupDividerEnabled(z2);
        InterfaceC0215z interfaceC0215z = (InterfaceC0215z) view;
        if (this.f3183c) {
            listMenuItemView.setForceShowIcon(true);
        }
        interfaceC0215z.a(getItem(i));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
