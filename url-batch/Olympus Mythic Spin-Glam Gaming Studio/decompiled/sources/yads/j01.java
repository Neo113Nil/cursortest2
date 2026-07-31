package yads;

import android.content.Context;
import kotlin.Unit;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class j01 implements e4 {
    public final Context a;
    public final v3 b;
    public final yu2 c;
    public final xm d;
    public final ab2 e;
    public final lm2 f;

    public j01(Context context, v3 v3Var, i5 i5Var, yu2 yu2Var) {
        xm xmVar = new xm(i5Var);
        ab2 ab2Var = new ab2();
        lm2 a = lm2.b.a();
        this.a = context;
        this.b = v3Var;
        this.c = yu2Var;
        this.d = xmVar;
        this.e = ab2Var;
        this.f = a;
    }

    @Override // yads.e4
    public final jm a(String str, String str2, wm wmVar) {
        JSONObject a;
        Context context = this.a;
        v3 v3Var = this.b;
        Context context2 = ((nt3) this.c).a;
        b4 b4Var = new b4(context, v3Var, pr.a(context2, context2), str, str2, this.d, wmVar);
        d8 d8Var = this.b.e;
        String str3 = d8Var != null ? d8Var.h : null;
        this.e.getClass();
        String optString = (str3 == null || (a = ad1.a(str3)) == null || !a.has("response")) ? null : a.optString("response");
        d8 d8Var2 = this.b.e;
        String str4 = optString != null ? optString : null;
        if (str4 != null) {
            lm2 lm2Var = this.f;
            lm2Var.getClass();
            synchronized (lm2.c) {
                lm2Var.a.put(b4Var, str4);
                Unit unit = Unit.INSTANCE;
            }
        }
        return b4Var;
    }
}
