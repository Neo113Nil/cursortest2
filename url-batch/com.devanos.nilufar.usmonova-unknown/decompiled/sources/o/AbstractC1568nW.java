package o;

import android.os.Trace;

/* renamed from: o.nW, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1568nW implements AutoCloseable {
    public static String b(String str) {
        if (str.length() < 124) {
            return str;
        }
        return str.substring(0, 124) + "...";
    }

    public static void c(String str) {
        Trace.beginSection(ZM.l(b(str)));
    }
}
