package yads;

import android.os.Handler;
import android.os.Looper;

/* loaded from: classes14.dex */
public final class bg3 {
    public final tg3 a;
    public final jg3 b;
    public final Handler c;
    public boolean d;
    public boolean e;

    public bg3(tg3 tg3Var, jg3 jg3Var) {
        Handler handler = new Handler(Looper.getMainLooper());
        this.a = tg3Var;
        this.b = jg3Var;
        this.c = handler;
    }
}
