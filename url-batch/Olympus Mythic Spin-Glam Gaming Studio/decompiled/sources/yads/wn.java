package yads;

import android.content.Context;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes4.dex */
public final class wn implements vb1 {
    public final Context a;
    public final qh1 b;
    public final lh1 c;
    public final ub1 d;
    public final CopyOnWriteArrayList e;

    public wn(Context context, nt3 nt3Var) {
        qh1 qh1Var = new qh1(context);
        au2.a.getClass();
        lh1 a = n51.a();
        ub1 ub1Var = new ub1(nt3Var);
        this.a = context;
        this.b = qh1Var;
        this.c = a;
        this.d = ub1Var;
        this.e = new CopyOnWriteArrayList();
    }

    @Override // yads.e5
    public final void a(Object obj) {
        tb1 tb1Var = (tb1) obj;
        tb1Var.a((u00) null);
        this.e.remove(tb1Var);
    }

    @Override // yads.vb1
    public final void a(final d8 d8Var, final js3 js3Var) {
        this.b.a();
        this.c.a(new Runnable() { // from class: yads.wn$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                wn.a(wn.this, d8Var, js3Var);
            }
        });
    }

    public static final void a(wn wnVar, d8 d8Var, u00 u00Var) {
        tb1 tb1Var = new tb1(wnVar.a, wnVar.d.a, wnVar, null, d8Var);
        wnVar.e.add(tb1Var);
        String str = d8Var.a;
        tb1Var.c.a(str);
        tb1Var.F.f = str;
        tb1Var.a(u00Var);
        tb1Var.b(d8Var);
    }
}
