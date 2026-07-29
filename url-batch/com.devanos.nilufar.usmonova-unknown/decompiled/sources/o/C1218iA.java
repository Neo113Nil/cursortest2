package o;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.devanos.nilufar.usmonova.R;
import java.util.ArrayList;

/* renamed from: o.iA, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1218iA extends BaseAdapter {
    public int a = -1;
    public final /* synthetic */ C1282jA b;

    public C1218iA(C1282jA c1282jA) {
        this.b = c1282jA;
        a();
    }

    public final void a() {
        MenuC0825cC menuC0825cC = this.b.j;
        C1284jC c1284jC = menuC0825cC.v;
        if (c1284jC != null) {
            menuC0825cC.i();
            ArrayList arrayList = menuC0825cC.j;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((C1284jC) arrayList.get(i)) == c1284jC) {
                    this.a = i;
                    return;
                }
            }
        }
        this.a = -1;
    }

    @Override // android.widget.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C1284jC getItem(int i) {
        C1282jA c1282jA = this.b;
        MenuC0825cC menuC0825cC = c1282jA.j;
        menuC0825cC.i();
        ArrayList arrayList = menuC0825cC.j;
        c1282jA.getClass();
        int i2 = this.a;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return (C1284jC) arrayList.get(i);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        C1282jA c1282jA = this.b;
        MenuC0825cC menuC0825cC = c1282jA.j;
        menuC0825cC.i();
        int size = menuC0825cC.j.size();
        c1282jA.getClass();
        return this.a < 0 ? size : size - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.b.i.inflate(R.layout.abc_list_menu_item_layout, viewGroup, false);
        }
        ((InterfaceC2273yC) view).a(getItem(i));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
