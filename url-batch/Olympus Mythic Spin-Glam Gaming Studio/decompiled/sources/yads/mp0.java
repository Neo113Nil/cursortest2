package yads;

import android.os.Handler;
import android.os.Looper;

/* loaded from: classes13.dex */
public final class mp0 {
    public final vb2 a;
    public final jp0 b;
    public final lw1 c;
    public final Handler d;
    public lp0 e;

    public mp0(vb2 vb2Var, jp0 jp0Var, lw1 lw1Var) {
        Handler handler = new Handler(Looper.getMainLooper());
        this.a = vb2Var;
        this.b = jp0Var;
        this.c = lw1Var;
        this.d = handler;
    }
}
