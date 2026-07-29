package o;

import android.content.Context;

/* loaded from: classes.dex */
public final class Z10 {
    public static final Z10 b;
    public C0985ef a;

    static {
        Z10 z10 = new Z10();
        z10.a = null;
        b = z10;
    }

    public static C0985ef a(Context context) {
        C0985ef c0985ef;
        Z10 z10 = b;
        synchronized (z10) {
            try {
                if (z10.a == null) {
                    if (context.getApplicationContext() != null) {
                        context = context.getApplicationContext();
                    }
                    z10.a = new C0985ef(context, 2);
                }
                c0985ef = z10.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c0985ef;
    }
}
