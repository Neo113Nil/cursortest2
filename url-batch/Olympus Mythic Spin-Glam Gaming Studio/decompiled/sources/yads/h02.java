package yads;

import android.os.SystemClock;
import android.view.View;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.SupervisorKt;

/* loaded from: classes15.dex */
public final class h02 implements View.OnClickListener {
    public final ph a;
    public final r3 b;
    public final a22 c;
    public final mn2 d;
    public final kf1 e;
    public final t41 f;
    public final CoroutineScope g = CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default(null, 1, null).plus(Dispatchers.getMain().getImmediate()).plus(new a20()));

    public h02(ph phVar, r3 r3Var, a22 a22Var, mn2 mn2Var, kf1 kf1Var, t41 t41Var) {
        this.a = phVar;
        this.b = r3Var;
        this.c = a22Var;
        this.d = mn2Var;
        this.e = kf1Var;
        this.f = t41Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        long j;
        Long l = this.d.a;
        if (l != null) {
            j = SystemClock.elapsedRealtime() - l.longValue();
        } else {
            j = 0;
        }
        kf1 kf1Var = this.e;
        if (kf1Var == null || j < kf1Var.e || !this.a.e) {
            return;
        }
        z10.a(this.g, f02.b, new g02(this, view, null));
    }
}
