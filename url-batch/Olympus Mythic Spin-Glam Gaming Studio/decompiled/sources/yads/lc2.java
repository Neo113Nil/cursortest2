package yads;

import android.os.Handler;
import android.os.Looper;

/* loaded from: classes3.dex */
public abstract class lc2 {
    public static oc2 a(boolean z) {
        return new oc2(z, new Handler(Looper.getMainLooper()));
    }
}
