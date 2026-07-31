package yads;

import android.content.Context;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes4.dex */
public final class xg {
    public static final AtomicBoolean f = new AtomicBoolean(false);
    public final Context a;
    public final yu2 b;
    public final vw2 c;
    public final mt1 d;
    public final lq0 e;

    public xg(Context context, yu2 yu2Var) {
        vw2 vw2Var;
        vw2 vw2Var2 = vw2.l;
        if (vw2Var2 == null) {
            synchronized (vw2.k) {
                vw2Var = vw2.l;
                if (vw2Var == null) {
                    vw2Var = new vw2();
                    vw2.l = vw2Var;
                }
            }
            vw2Var2 = vw2Var;
        }
        Context context2 = ((nt3) yu2Var).a;
        mt1 a = pr.a(context2, context2);
        lq0 a2 = kq0.a(context);
        this.a = context;
        this.b = yu2Var;
        this.c = vw2Var2;
        this.d = a;
        this.e = a2;
    }
}
