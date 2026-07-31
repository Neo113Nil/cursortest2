package yads;

import android.os.Handler;
import android.os.Looper;

/* loaded from: classes6.dex */
public final class hn2 {
    public final c8 a;
    public final kn2 b;
    public final Handler c;
    public boolean d;

    public hn2(c8 c8Var, kn2 kn2Var) {
        Handler handler = new Handler(Looper.getMainLooper());
        this.a = c8Var;
        this.b = kn2Var;
        this.c = handler;
    }
}
