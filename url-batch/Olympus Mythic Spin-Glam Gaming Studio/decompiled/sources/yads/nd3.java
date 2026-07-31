package yads;

import android.content.Context;

/* loaded from: classes11.dex */
public final class nd3 {
    public final so a;
    public final m23 b;
    public final b5 c;
    public final y9 d;
    public final bu2 e;

    public nd3(Context context) {
        vw2 vw2Var;
        so soVar = new so(context);
        m23 m23Var = new m23();
        b5 b5Var = new b5();
        y9 y9Var = new y9();
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
        bu2 a = vw2Var2.a(context);
        this.a = soVar;
        this.b = m23Var;
        this.c = b5Var;
        this.d = y9Var;
        this.e = a;
    }
}
