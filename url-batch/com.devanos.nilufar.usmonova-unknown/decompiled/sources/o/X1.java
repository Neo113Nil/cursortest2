package o;

import android.os.Looper;

/* loaded from: classes.dex */
public abstract class X1 {
    public static final long a;
    public static final /* synthetic */ int b = 0;

    static {
        long j;
        EB.D(T1.j);
        try {
            j = Looper.getMainLooper().getThread().getId();
        } catch (Exception unused) {
            j = -1;
        }
        a = j;
    }
}
