package o;

import android.content.Context;
import android.content.ContextWrapper;

/* loaded from: classes.dex */
public abstract class RV extends ContextWrapper {
    public static final Object a = null;

    public static void a(Context context) {
        if (context.getResources() instanceof SV) {
            return;
        }
        context.getResources();
        int i = XY.a;
    }
}
