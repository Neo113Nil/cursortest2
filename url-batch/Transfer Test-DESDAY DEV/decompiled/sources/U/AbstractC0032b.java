package U;

import android.os.Handler;
import android.os.Looper;

/* renamed from: U.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0032b {
    public static Handler a(Looper looper) {
        Handler createAsync;
        createAsync = Handler.createAsync(looper);
        return createAsync;
    }
}
