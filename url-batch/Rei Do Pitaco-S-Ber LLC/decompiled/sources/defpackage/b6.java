package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Insets;
import android.os.Trace;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public abstract class b6 {
    public static String a(Context context) {
        return context.getOpPackageName();
    }

    public static boolean b() {
        return Trace.isEnabled();
    }

    public static Insets c(int i, int i2, int i3, int i4) {
        return Insets.of(i, i2, i3, i4);
    }

    public static void d(Resources.Theme theme) {
        theme.rebase();
    }
}
