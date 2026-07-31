package yads;

import java.lang.ref.WeakReference;
import java.util.Map;

/* loaded from: classes6.dex */
public final class yw1 implements tw1 {
    public final WeakReference a;

    public yw1(t01 t01Var) {
        this.a = new WeakReference(t01Var);
    }

    @Override // yads.tw1
    public final void a(xw1 xw1Var, Map map) {
        t01 t01Var = (t01) this.a.get();
        if (t01Var != null) {
            t01Var.a(xw1Var, map);
        }
    }

    @Override // yads.tw1
    public final void a(String str) {
        t01 t01Var = (t01) this.a.get();
        if (t01Var != null) {
            t01Var.a(str);
        }
    }

    @Override // yads.tw1
    public final void a() {
        t01 t01Var = (t01) this.a.get();
        if (t01Var != null) {
            t01Var.a();
        }
    }
}
