package o;

import android.os.Handler;
import android.os.Looper;

/* renamed from: o.Cd, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0058Cd {
    public static Handler a(Looper looper) {
        Handler createAsync;
        createAsync = Handler.createAsync(looper);
        return createAsync;
    }
}
