package P0;

import android.view.View;
import android.widget.AdapterView;
import l.C0234N;
import l.C0237Q;
import l.G0;

/* loaded from: classes.dex */
public final class u implements AdapterView.OnItemClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1012a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1013b;

    public /* synthetic */ u(int i, Object obj) {
        this.f1012a = i;
        this.f1013b = obj;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j2) {
        Object item;
        switch (this.f1012a) {
            case 0:
                w wVar = (w) this.f1013b;
                if (i < 0) {
                    G0 g02 = wVar.f1017e;
                    item = !g02.f3321z.isShowing() ? null : g02.f3301c.getSelectedItem();
                } else {
                    item = wVar.getAdapter().getItem(i);
                }
                w.a(wVar, item);
                AdapterView.OnItemClickListener onItemClickListener = wVar.getOnItemClickListener();
                G0 g03 = wVar.f1017e;
                if (onItemClickListener != null) {
                    if (view == null || i < 0) {
                        view = g03.f3321z.isShowing() ? g03.f3301c.getSelectedView() : null;
                        i = !g03.f3321z.isShowing() ? -1 : g03.f3301c.getSelectedItemPosition();
                        j2 = !g03.f3321z.isShowing() ? Long.MIN_VALUE : g03.f3301c.getSelectedItemId();
                    }
                    onItemClickListener.onItemClick(g03.f3301c, view, i, j2);
                }
                g03.dismiss();
                break;
            default:
                C0234N c0234n = (C0234N) this.f1013b;
                c0234n.f3344G.setSelection(i);
                C0237Q c0237q = c0234n.f3344G;
                if (c0237q.getOnItemClickListener() != null) {
                    c0237q.performItemClick(view, i, c0234n.f3342D.getItemId(i));
                }
                c0234n.dismiss();
                break;
        }
    }
}
