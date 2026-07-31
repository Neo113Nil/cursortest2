package yads;

import android.content.Context;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;

/* loaded from: classes13.dex */
public final class o52 {
    public final vt3 a;
    public final m52 b;

    public o52(Context context, wt3 wt3Var) {
        vt3 vt3Var = wt3Var.a.a(context) ? new vt3(context) : null;
        m52 m52Var = new m52();
        this.a = vt3Var;
        this.b = m52Var;
    }

    public final void a() {
        List list;
        vt3 vt3Var = this.a;
        if (vt3Var != null) {
            synchronized (vt3Var.b) {
                list = CollectionsKt.toList(vt3Var.c);
                vt3Var.c.clear();
                Unit unit = Unit.INSTANCE;
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                vt3Var.a.a((wd3) it.next());
            }
        }
    }
}
