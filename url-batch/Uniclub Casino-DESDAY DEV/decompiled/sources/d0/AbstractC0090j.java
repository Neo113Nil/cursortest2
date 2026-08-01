package d0;

import android.os.Handler;
import android.os.Looper;

/* renamed from: d0.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0090j {
    public static Handler a(Looper looper) {
        Handler createAsync;
        createAsync = Handler.createAsync(looper);
        return createAsync;
    }
}
