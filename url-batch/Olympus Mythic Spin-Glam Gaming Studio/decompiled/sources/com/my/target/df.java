package com.my.target;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.my.target.ba;
import com.my.target.da;
import com.my.target.ff;
import com.my.target.ja;
import com.my.target.mf;
import com.my.target.wh;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes6.dex */
public class df {
    private final lf a;
    private final fe b;
    private final Context c;
    private final gg d;
    private boolean e = true;

    private df(lf lfVar, fe feVar, Context context) {
        this.a = lfVar;
        this.b = feVar;
        this.c = context;
        this.d = gg.a(context);
    }

    public static df a(lf lfVar, fe feVar, Context context) {
        return new df(lfVar, feVar, context);
    }

    public e0 b() {
        return new e0(this.c);
    }

    public com.my.target.core.ui.views.promo.style2.cards.b c() {
        return new com.my.target.core.ui.views.promo.style2.cards.b(this.c);
    }

    public Handler d() {
        return new Handler(Looper.getMainLooper());
    }

    public hf e() {
        return new jf(this.c);
    }

    public void a(boolean z) {
        this.e = z;
    }

    public mf a(d9 d9Var, View view, View view2, View view3, mf.a aVar) {
        if (!d9Var.g0().isEmpty()) {
            return new of(((k8) d9Var.g0().get(0)).X(), view, view2, aVar, view3, this.d, this.c);
        }
        if (d9Var.j0() != null) {
            return new qf(view, view2, aVar, view3, this.d, this.c);
        }
        return new pf(view, view2, aVar, view3, this.d, this.c);
    }

    public ff a(ff.a aVar) {
        return new gf(this.d, this.c, aVar);
    }

    public t9 a(eb ebVar, e0 e0Var, da.a aVar, d0 d0Var, wh.c cVar) {
        return da.a(ebVar, e0Var, aVar, d0Var, this, ib.a(this.e, e0Var.getContext()), cVar);
    }

    public ja a(com.my.target.core.ui.views.promo.style2.cards.b bVar, List list, ja.a aVar) {
        ja a = ga.a(bVar, list, aVar);
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(a((k8) it.next(), a));
        }
        bVar.setAdapter(new o1(arrayList, this));
        return a;
    }

    public ba a(k8 k8Var, ba.a aVar) {
        return ca.a(k8Var, aVar);
    }

    public q1 a() {
        return new r1(this.c, this.a, this.d);
    }

    public oe a(eb ebVar, wh.c cVar) {
        return oe.a(ebVar, this.b, cVar, this.c);
    }
}
