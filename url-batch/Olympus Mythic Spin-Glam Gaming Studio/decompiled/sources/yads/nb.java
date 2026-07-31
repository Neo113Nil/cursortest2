package yads;

import android.app.Dialog;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class nb {
    public static final long f = TimeUnit.SECONDS.toMillis(5);
    public final Dialog a;
    public final ac b;
    public final wm0 c;
    public final cb2 d;
    public final Handler e;

    public nb(Dialog dialog, ac acVar, wm0 wm0Var, cb2 cb2Var) {
        Handler handler = new Handler(Looper.getMainLooper());
        this.a = dialog;
        this.b = acVar;
        this.c = wm0Var;
        this.d = cb2Var;
        this.e = handler;
    }
}
