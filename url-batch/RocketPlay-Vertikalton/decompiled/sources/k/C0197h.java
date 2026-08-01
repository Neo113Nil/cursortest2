package k;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.luckycounter.drinkwater.R;
import java.util.ArrayList;

/* renamed from: k.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0197h extends BaseAdapter {

    /* renamed from: a, reason: collision with root package name */
    public int f3174a = -1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0198i f3175b;

    public C0197h(C0198i c0198i) {
        this.f3175b = c0198i;
        a();
    }

    public final void a() {
        MenuC0202m menuC0202m = this.f3175b.f3178c;
        C0204o c0204o = menuC0202m.f3205v;
        if (c0204o != null) {
            menuC0202m.i();
            ArrayList arrayList = menuC0202m.f3193j;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((C0204o) arrayList.get(i)) == c0204o) {
                    this.f3174a = i;
                    return;
                }
            }
        }
        this.f3174a = -1;
    }

    @Override // android.widget.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C0204o getItem(int i) {
        C0198i c0198i = this.f3175b;
        MenuC0202m menuC0202m = c0198i.f3178c;
        menuC0202m.i();
        ArrayList arrayList = menuC0202m.f3193j;
        c0198i.getClass();
        int i2 = this.f3174a;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return (C0204o) arrayList.get(i);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        C0198i c0198i = this.f3175b;
        MenuC0202m menuC0202m = c0198i.f3178c;
        menuC0202m.i();
        int size = menuC0202m.f3193j.size();
        c0198i.getClass();
        return this.f3174a < 0 ? size : size - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f3175b.f3177b.inflate(R.layout.abc_list_menu_item_layout, viewGroup, false);
        }
        ((InterfaceC0215z) view).a(getItem(i));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
