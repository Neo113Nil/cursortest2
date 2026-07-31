package yads;

import android.content.Context;
import kotlin.Unit;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class o02 implements e4 {
    public final Context a;
    public final v3 b;
    public final yu2 c;
    public final p12 d;
    public final xm e;
    public final lm2 f;
    public final ab2 g;

    public o02(Context context, v3 v3Var, yu2 yu2Var, p12 p12Var, i5 i5Var) {
        xm xmVar = new xm(i5Var);
        lm2 a = lm2.b.a();
        ab2 ab2Var = new ab2();
        this.a = context;
        this.b = v3Var;
        this.c = yu2Var;
        this.d = p12Var;
        this.e = xmVar;
        this.f = a;
        this.g = ab2Var;
    }

    @Override // yads.e4
    public final jm a(String str, String str2, wm wmVar) {
        JSONObject a;
        Context context = this.a;
        q12 q12Var = this.d.c;
        v3 v3Var = this.b;
        Context context2 = ((nt3) this.c).a;
        n02 n02Var = new n02(context, q12Var, v3Var, pr.a(context2, context2), str, str2, this.e, wmVar);
        String str3 = this.d.a.h;
        this.g.getClass();
        String optString = (str3 == null || (a = ad1.a(str3)) == null || !a.has("response")) ? null : a.optString("response");
        String str4 = optString != null ? optString : null;
        if (str4 != null) {
            lm2 lm2Var = this.f;
            lm2Var.getClass();
            synchronized (lm2.c) {
                lm2Var.a.put(n02Var, str4);
                Unit unit = Unit.INSTANCE;
            }
        }
        return n02Var;
    }
}
