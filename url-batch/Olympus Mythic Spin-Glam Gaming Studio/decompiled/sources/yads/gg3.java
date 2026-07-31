package yads;

import android.os.Handler;
import android.os.Looper;

/* loaded from: classes4.dex */
public final class gg3 {
    public final uf3 a;
    public final dg3 b;
    public final Handler c;
    public boolean d;

    public gg3(uf3 uf3Var, dg3 dg3Var) {
        Handler handler = new Handler(Looper.getMainLooper());
        this.a = uf3Var;
        this.b = dg3Var;
        this.c = handler;
    }

    public final void a() {
        if (this.d) {
            this.b.b();
            this.c.removeCallbacksAndMessages(null);
            this.d = false;
        }
    }
}
