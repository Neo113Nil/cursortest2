package yads;

import android.content.Context;
import java.util.ArrayList;

/* loaded from: classes5.dex */
public final class kn2 {
    public final v4 a;
    public final t41 b;
    public final mn2 c;
    public final jn2 d;
    public final hn2 e;
    public boolean f;

    public kn2(Context context, c8 c8Var, t8 t8Var, v3 v3Var, yu2 yu2Var, r9 r9Var, v4 v4Var, t41 t41Var, mn2 mn2Var, ArrayList arrayList) {
        jn2 jn2Var = new jn2(context, t8Var, v3Var, yu2Var, r9Var, arrayList);
        this.a = v4Var;
        this.b = t41Var;
        this.c = mn2Var;
        this.d = jn2Var;
        this.e = new hn2(c8Var, this);
    }
}
