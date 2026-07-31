package yads;

import android.content.Context;
import kotlin.Unit;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;

/* loaded from: classes13.dex */
public final class zz1 {
    public final yu2 a;
    public final v3 b;
    public final i5 c;
    public final CoroutineScope d;
    public final Context e;
    public final b02 f;
    public final z42 g;

    public zz1(Context context, CoroutineScope coroutineScope, v3 v3Var, i5 i5Var, yu2 yu2Var) {
        Context applicationContext = context.getApplicationContext();
        sz1 sz1Var = new sz1(new n62(context, coroutineScope, v3Var, i5Var, yu2Var));
        b02 b02Var = new b02(v3Var, yu2Var, sz1Var);
        z42 z42Var = new z42(context, yu2Var, i5Var, sz1Var, coroutineScope);
        this.a = yu2Var;
        this.b = v3Var;
        this.c = i5Var;
        this.d = coroutineScope;
        this.e = applicationContext;
        this.f = b02Var;
        this.g = z42Var;
    }

    public final void a() {
        z42 z42Var = this.g;
        u42 u42Var = z42Var.b;
        n62 n62Var = u42Var.c;
        le0 le0Var = n62Var.b;
        synchronized (le0Var.d) {
            le0Var.b.a();
            Unit unit = Unit.INSTANCE;
        }
        n62Var.c.a();
        u42Var.a.getClass();
        u42Var.b.getClass();
        z42Var.c.a();
        CoroutineScopeKt.cancel$default(z42Var.a, null, 1, null);
    }
}
