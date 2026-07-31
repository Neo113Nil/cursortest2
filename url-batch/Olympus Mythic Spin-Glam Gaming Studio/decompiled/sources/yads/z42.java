package yads;

import android.content.Context;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes5.dex */
public final class z42 {
    public final CoroutineScope a;
    public final u42 b;
    public final o52 c;

    public z42(Context context, yu2 yu2Var, i5 i5Var, sz1 sz1Var, CoroutineScope coroutineScope) {
        u42 u42Var = new u42(context, coroutineScope, i5Var, sz1Var);
        ((nt3) yu2Var).getClass();
        o52 o52Var = new o52(context, new wt3());
        this.a = coroutineScope;
        this.b = u42Var;
        this.c = o52Var;
    }
}
