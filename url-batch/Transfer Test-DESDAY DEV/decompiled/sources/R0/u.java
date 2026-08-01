package R0;

import android.view.View;
import android.widget.AdapterView;
import l.C0191M;
import l.C0194P;
import l.E0;

/* loaded from: classes.dex */
public final class u implements AdapterView.OnItemClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f746a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f747b;

    public /* synthetic */ u(int i, Object obj) {
        this.f746a = i;
        this.f747b = obj;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j2) {
        Object item;
        switch (this.f746a) {
            case 0:
                w wVar = (w) this.f747b;
                if (i < 0) {
                    E0 e02 = wVar.f751e;
                    item = !e02.f2889z.isShowing() ? null : e02.f2869c.getSelectedItem();
                } else {
                    item = wVar.getAdapter().getItem(i);
                }
                w.a(wVar, item);
                AdapterView.OnItemClickListener onItemClickListener = wVar.getOnItemClickListener();
                E0 e03 = wVar.f751e;
                if (onItemClickListener != null) {
                    if (view == null || i < 0) {
                        view = e03.f2889z.isShowing() ? e03.f2869c.getSelectedView() : null;
                        i = !e03.f2889z.isShowing() ? -1 : e03.f2869c.getSelectedItemPosition();
                        j2 = !e03.f2889z.isShowing() ? Long.MIN_VALUE : e03.f2869c.getSelectedItemId();
                    }
                    onItemClickListener.onItemClick(e03.f2869c, view, i, j2);
                }
                e03.dismiss();
                break;
            default:
                C0191M c0191m = (C0191M) this.f747b;
                c0191m.f2919G.setSelection(i);
                C0194P c0194p = c0191m.f2919G;
                if (c0194p.getOnItemClickListener() != null) {
                    c0194p.performItemClick(view, i, c0191m.f2917D.getItemId(i));
                }
                c0191m.dismiss();
                break;
        }
    }
}
