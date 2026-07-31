package yads;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class ha2 {
    public final Context a;
    public final la2 b;
    public final zo2 c;
    public final vw2 d;

    public ha2(Context context) {
        zo2 zo2Var;
        this.a = context.getApplicationContext();
        this.b = ma2.a(context);
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
        this.c = zo2Var2;
        this.d = uw2.a();
    }

    public final void a(ja2 ja2Var) {
        bu2 a = this.d.a(this.a);
        String str = a != null ? a.T : null;
        String c = ((qg1) this.b.a).c("YmadOmSdkJsUrl");
        if (str == null || str.length() <= 0 || Intrinsics.areEqual(str, c)) {
            ja2Var.a();
            return;
        }
        ga2 ga2Var = new ga2(this, str, ja2Var);
        s43 s43Var = new s43(str, ga2Var, ga2Var);
        s43Var.q = "om_sdk_js_request_tag";
        zo2 zo2Var = this.c;
        Context context = this.a;
        synchronized (zo2Var) {
            g92.a(context).a(s43Var);
        }
    }
}
