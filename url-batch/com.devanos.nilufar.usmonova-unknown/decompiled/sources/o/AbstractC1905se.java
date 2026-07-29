package o;

import android.content.Context;
import java.io.File;

/* renamed from: o.se, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1905se {
    public static Context a(Context context) {
        return context.createDeviceProtectedStorageContext();
    }

    public static File b(Context context) {
        return context.getDataDir();
    }

    public static boolean c(Context context) {
        return context.isDeviceProtectedStorage();
    }
}
