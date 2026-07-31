package yads;

import android.content.Context;

/* loaded from: classes5.dex */
public final class fd {
    public final vw2 a;
    public final Context b;

    public fd(Context context) {
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
        this.a = vw2Var2;
        Context applicationContext = context.getApplicationContext();
        this.b = applicationContext != null ? applicationContext : context;
    }
}
