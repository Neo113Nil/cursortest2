package yads;

import android.os.Handler;
import android.os.Looper;

/* loaded from: classes15.dex */
public final class og3 {
    public final aj3 a;
    public final jg3 b;
    public final Handler c;
    public boolean d;
    public boolean e;

    public og3(aj3 aj3Var, jg3 jg3Var) {
        Handler handler = new Handler(Looper.getMainLooper());
        this.a = aj3Var;
        this.b = jg3Var;
        this.c = handler;
    }
}
