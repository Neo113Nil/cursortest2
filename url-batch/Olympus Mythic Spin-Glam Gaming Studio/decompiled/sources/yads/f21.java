package yads;

import android.content.Context;

/* loaded from: classes5.dex */
public final class f21 {
    public final bg a;
    public final mf b;
    public final Context c;
    public final g21 d;
    public final String e;

    public f21(Context context) {
        String a;
        bg a2 = gf.a(context);
        mf mfVar = new mf(context);
        wi1 wi1Var = new wi1(sg1.a(context, "YadPreferenceFile"));
        this.a = a2;
        this.b = mfVar;
        this.c = context.getApplicationContext();
        this.d = g21.b;
        synchronized (vi1.a) {
            a = wi1Var.a();
            if (a == null) {
                a = ui1.a();
                wi1Var.a(a);
            }
        }
        this.e = a;
    }
}
