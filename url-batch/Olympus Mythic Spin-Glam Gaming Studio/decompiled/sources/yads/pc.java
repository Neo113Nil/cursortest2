package yads;

import android.content.Context;

/* loaded from: classes3.dex */
public final class pc {
    public final kc a;
    public final vw2 b;
    public final Context c;

    public pc(Context context) {
        vw2 vw2Var;
        kc a = lc.a(context);
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
        this.a = a;
        this.b = vw2Var2;
        Context applicationContext = context.getApplicationContext();
        this.c = applicationContext != null ? applicationContext : context;
    }
}
