package k;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.fortuneodd.shadegrid.R;
import java.util.ArrayList;

/* renamed from: k.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0163h extends BaseAdapter {

    /* renamed from: a, reason: collision with root package name */
    public int f2678a = -1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0164i f2679b;

    public C0163h(C0164i c0164i) {
        this.f2679b = c0164i;
        a();
    }

    public final void a() {
        MenuC0168m menuC0168m = this.f2679b.f2682c;
        C0170o c0170o = menuC0168m.f2709v;
        if (c0170o != null) {
            menuC0168m.i();
            ArrayList arrayList = menuC0168m.f2697j;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((C0170o) arrayList.get(i)) == c0170o) {
                    this.f2678a = i;
                    return;
                }
            }
        }
        this.f2678a = -1;
    }

    @Override // android.widget.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C0170o getItem(int i) {
        C0164i c0164i = this.f2679b;
        MenuC0168m menuC0168m = c0164i.f2682c;
        menuC0168m.i();
        ArrayList arrayList = menuC0168m.f2697j;
        c0164i.getClass();
        int i2 = this.f2678a;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return (C0170o) arrayList.get(i);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        C0164i c0164i = this.f2679b;
        MenuC0168m menuC0168m = c0164i.f2682c;
        menuC0168m.i();
        int size = menuC0168m.f2697j.size();
        c0164i.getClass();
        return this.f2678a < 0 ? size : size - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f2679b.f2681b.inflate(R.layout.abc_list_menu_item_layout, viewGroup, false);
        }
        ((InterfaceC0181z) view).a(getItem(i));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
