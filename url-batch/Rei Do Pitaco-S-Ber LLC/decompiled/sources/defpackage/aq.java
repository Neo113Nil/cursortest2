package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.ionia.reidopitaco.libya.R;
import java.util.ArrayList;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class aq extends BaseAdapter {
    public int a = -1;
    public final /* synthetic */ bq b;

    public aq(bq bqVar) {
        this.b = bqVar;
        a();
    }

    public final void a() {
        ss ssVar = this.b.h;
        vs vsVar = ssVar.v;
        if (vsVar != null) {
            ssVar.i();
            ArrayList arrayList = ssVar.j;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((vs) arrayList.get(i)) == vsVar) {
                    this.a = i;
                    return;
                }
            }
        }
        this.a = -1;
    }

    @Override // android.widget.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final vs getItem(int i) {
        bq bqVar = this.b;
        ss ssVar = bqVar.h;
        ssVar.i();
        ArrayList arrayList = ssVar.j;
        bqVar.getClass();
        int i2 = this.a;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return (vs) arrayList.get(i);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        bq bqVar = this.b;
        ss ssVar = bqVar.h;
        ssVar.i();
        int size = ssVar.j.size();
        bqVar.getClass();
        return this.a < 0 ? size : size - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.b.g.inflate(R.layout.abc_list_menu_item_layout, viewGroup, false);
        }
        ((kt) view).c(getItem(i));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
