package yads;

import android.os.Looper;

/* loaded from: classes3.dex */
public final class al0 implements cl0 {
    @Override // yads.cl0
    public final void a(Looper looper, ff2 ff2Var) {
    }

    @Override // yads.cl0
    public final um0 a(yk0 yk0Var, jw0 jw0Var) {
        if (jw0Var.p == null) {
            return null;
        }
        return new um0(new wk0(new ya3(), 6001));
    }

    @Override // yads.cl0
    public final int a(jw0 jw0Var) {
        return jw0Var.p != null ? 1 : 0;
    }
}
