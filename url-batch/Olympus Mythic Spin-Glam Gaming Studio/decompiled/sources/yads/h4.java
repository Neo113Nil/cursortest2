package yads;

import android.content.Context;

/* loaded from: classes5.dex */
public final class h4 {
    public final zo2 a;
    public final String b;
    public final Context c;

    public h4(Context context) {
        zo2 zo2Var;
        zo2 zo2Var2 = zo2.b;
        if (zo2Var2 == null) {
            synchronized (zo2.a) {
                zo2Var = zo2.b;
                if (zo2Var == null) {
                    zo2Var = new zo2();
                    zo2.b = zo2Var;
                }
            }
            zo2Var2 = zo2Var;
        }
        this.a = zo2Var2;
        int i = oa.$r8$clinit;
        String obj = toString();
        this.b = obj == null ? "" : obj;
        this.c = context.getApplicationContext();
    }

    public final void a(jm jmVar) {
        jmVar.q = this.b;
        zo2 zo2Var = this.a;
        Context context = this.c;
        synchronized (zo2Var) {
            g92.a(context).a(jmVar);
        }
    }
}
