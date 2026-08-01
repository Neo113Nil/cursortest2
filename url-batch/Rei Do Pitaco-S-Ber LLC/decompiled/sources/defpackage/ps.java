package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.util.ArrayList;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class ps extends BaseAdapter {
    public final ss a;
    public int b = -1;
    public boolean c;
    public final boolean d;
    public final LayoutInflater e;
    public final int f;

    public ps(ss ssVar, LayoutInflater layoutInflater, boolean z, int i) {
        this.d = z;
        this.e = layoutInflater;
        this.a = ssVar;
        this.f = i;
        a();
    }

    public final void a() {
        ss ssVar = this.a;
        vs vsVar = ssVar.v;
        if (vsVar != null) {
            ssVar.i();
            ArrayList arrayList = ssVar.j;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((vs) arrayList.get(i)) == vsVar) {
                    this.b = i;
                    return;
                }
            }
        }
        this.b = -1;
    }

    @Override // android.widget.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final vs getItem(int i) {
        ArrayList l;
        boolean z = this.d;
        ss ssVar = this.a;
        if (z) {
            ssVar.i();
            l = ssVar.j;
        } else {
            l = ssVar.l();
        }
        int i2 = this.b;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return (vs) l.get(i);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        ArrayList l;
        boolean z = this.d;
        ss ssVar = this.a;
        if (z) {
            ssVar.i();
            l = ssVar.j;
        } else {
            l = ssVar.l();
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
        kt ktVar = (kt) view;
        if (this.c) {
            listMenuItemView.setForceShowIcon(true);
        }
        ktVar.c(getItem(i));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
