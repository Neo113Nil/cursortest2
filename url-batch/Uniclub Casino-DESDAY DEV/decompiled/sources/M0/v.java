package M0;

import android.view.View;
import android.widget.AdapterView;
import l.C0208O;
import l.C0211S;
import l.G0;

/* loaded from: classes.dex */
public final class v implements AdapterView.OnItemClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f594a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f595b;

    public /* synthetic */ v(int i, Object obj) {
        this.f594a = i;
        this.f595b = obj;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j2) {
        Object item;
        switch (this.f594a) {
            case 0:
                x xVar = (x) this.f595b;
                if (i < 0) {
                    G0 g02 = xVar.f599e;
                    item = !g02.f2888z.isShowing() ? null : g02.f2868c.getSelectedItem();
                } else {
                    item = xVar.getAdapter().getItem(i);
                }
                x.a(xVar, item);
                AdapterView.OnItemClickListener onItemClickListener = xVar.getOnItemClickListener();
                G0 g03 = xVar.f599e;
                if (onItemClickListener != null) {
                    if (view == null || i < 0) {
                        view = g03.f2888z.isShowing() ? g03.f2868c.getSelectedView() : null;
                        i = !g03.f2888z.isShowing() ? -1 : g03.f2868c.getSelectedItemPosition();
                        j2 = !g03.f2888z.isShowing() ? Long.MIN_VALUE : g03.f2868c.getSelectedItemId();
                    }
                    onItemClickListener.onItemClick(g03.f2868c, view, i, j2);
                }
                g03.dismiss();
                break;
            default:
                C0208O c0208o = (C0208O) this.f595b;
                c0208o.f2918G.setSelection(i);
                C0211S c0211s = c0208o.f2918G;
                if (c0211s.getOnItemClickListener() != null) {
                    c0211s.performItemClick(view, i, c0208o.f2916D.getItemId(i));
                }
                c0208o.dismiss();
                break;
        }
    }
}
