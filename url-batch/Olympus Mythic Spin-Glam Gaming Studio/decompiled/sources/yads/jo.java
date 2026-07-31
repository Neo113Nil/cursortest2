package yads;

import android.content.Context;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes3.dex */
public final class jo implements gr2 {
    public final Context a;
    public final qh1 b;
    public final lh1 c;
    public final fr2 d;
    public final CopyOnWriteArrayList e;

    public jo(Context context, nt3 nt3Var) {
        qh1 qh1Var = new qh1(context);
        au2.a.getClass();
        lh1 a = n51.a();
        fr2 fr2Var = new fr2(nt3Var);
        this.a = context;
        this.b = qh1Var;
        this.c = a;
        this.d = fr2Var;
        this.e = new CopyOnWriteArrayList();
    }

    @Override // yads.e5
    public final void a(Object obj) {
        er2 er2Var = (er2) obj;
        er2Var.a((o10) null);
        this.e.remove(er2Var);
    }

    @Override // yads.gr2
    public final void a(final d8 d8Var, final mt3 mt3Var) {
        this.b.a();
        this.c.a(new Runnable() { // from class: yads.jo$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                jo.a(jo.this, d8Var, mt3Var);
            }
        });
    }

    public static final void a(jo joVar, d8 d8Var, o10 o10Var) {
        er2 er2Var = new er2(joVar.a, joVar.d.a, joVar, null, d8Var);
        joVar.e.add(er2Var);
        String str = d8Var.a;
        er2Var.c.a(str);
        er2Var.F.d = str;
        er2Var.a(o10Var);
        er2Var.b(d8Var);
    }
}
