package yads;

import android.os.Trace;

/* loaded from: classes.dex */
public abstract class t73 {
    public static void a(String str) {
        if (sb3.a >= 18) {
            Trace.beginSection(str);
        }
    }

    public static void a() {
        if (sb3.a >= 18) {
            Trace.endSection();
        }
    }
}
