package yads;

import android.content.Context;
import java.util.Map;

/* loaded from: classes4.dex */
public final class pd2 {
    public final a93 a;
    public final v83 b;
    public final zo2 c;
    public final kh1 d;
    public final Context e;

    public pd2(Context context, v3 v3Var, yu2 yu2Var, a93 a93Var) {
        zo2 zo2Var;
        v83 v83Var = new v83(context, v3Var, yu2Var);
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
        kh1 kh1Var = new kh1();
        this.a = a93Var;
        this.b = v83Var;
        this.c = zo2Var2;
        this.d = kh1Var;
        this.e = context.getApplicationContext();
    }

    public final void a(String str, Map map, io2 io2Var) {
        nd2 nd2Var = new nd2(this.e, this.d.a(str, map), new od2(str, uw2.a().a(this.e), this.b, this.a, io2Var));
        zo2 zo2Var = this.c;
        Context context = this.e;
        synchronized (zo2Var) {
            g92.a(context).a(nd2Var);
        }
    }
}
