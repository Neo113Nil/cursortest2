package o;

import android.os.Trace;

/* renamed from: o.lW, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1436lW {
    public static void a(int i, String str) {
        Trace.beginAsyncSection(str, i);
    }

    public static void b(int i, String str) {
        Trace.endAsyncSection(str, i);
    }

    public static boolean c() {
        return Trace.isEnabled();
    }
}
