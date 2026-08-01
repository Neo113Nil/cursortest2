package defpackage;

import android.os.Bundle;
import java.util.Map;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class an0 implements xm0, ln0 {
    public final /* synthetic */ ym0 d;
    public final jn0 e;
    public final q20 f;
    public final in0 g;

    public an0(ym0 ym0Var) {
        this.d = ym0Var;
        jn0 jn0Var = new jn0(new kn0(this, new ab0(5, this)));
        this.e = jn0Var;
        this.f = new q20(this, false);
        this.g = jn0Var.b;
        Object d = ym0Var.d("androidx.savedstate.SavedStateRegistry");
        jn0Var.a(d instanceof Bundle ? (Bundle) d : null);
        ym0Var.a("androidx.savedstate.SavedStateRegistry", new ab0(3, this));
    }

    @Override // defpackage.xm0
    public final t7 a(String str, bu buVar) {
        return this.d.a(str, buVar);
    }

    @Override // defpackage.xm0
    public final boolean b(Object obj) {
        return this.d.b(obj);
    }

    @Override // defpackage.xm0
    public final Map c() {
        return this.d.c();
    }

    @Override // defpackage.xm0
    public final Object d(String str) {
        return this.d.d(str);
    }

    @Override // defpackage.o20
    public final g20 getLifecycle() {
        return this.f;
    }

    @Override // defpackage.ln0
    public final in0 getSavedStateRegistry() {
        return this.g;
    }
}
