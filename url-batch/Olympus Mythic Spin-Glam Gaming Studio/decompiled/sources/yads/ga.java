package yads;

import java.lang.ref.WeakReference;
import kotlin.reflect.KProperty;

/* loaded from: classes5.dex */
public final class ga implements v32 {
    public final gw0 a;

    public ga(gw0 gw0Var) {
        this.a = gw0Var;
    }

    @Override // yads.v32
    public final void a(t41 t41Var) {
        qm2 qm2Var = this.a.a;
        KProperty kProperty = gw0.b[0];
        qm2Var.getClass();
        qm2Var.a = new WeakReference(t41Var);
    }
}
