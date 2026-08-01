package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public abstract class o3 {
    public static final m3 f = new m3(new n3());
    public static final int g = -100;
    public static oq h = null;
    public static oq i = null;
    public static Boolean j = null;
    public static boolean k = false;
    public static final n6 l = new n6();
    public static final Object m = new Object();
    public static final Object n = new Object();

    public static boolean b(Context context) {
        if (j == null) {
            try {
                int i2 = a6.f;
                Bundle bundle = context.getPackageManager().getServiceInfo(new ComponentName(context, (Class<?>) a6.class), z5.a() | 128).metaData;
                if (bundle != null) {
                    j = Boolean.valueOf(bundle.getBoolean("autoStoreLocales"));
                }
            } catch (PackageManager.NameNotFoundException unused) {
                Log.d("AppCompatDelegate", "Checking for metadata for AppLocalesMetadataHolderService : Service not found");
                j = Boolean.FALSE;
            }
        }
        return j.booleanValue();
    }

    public static void e(c4 c4Var) {
        synchronized (m) {
            try {
                n6 n6Var = l;
                n6Var.getClass();
                h6 h6Var = new h6(n6Var);
                while (h6Var.hasNext()) {
                    o3 o3Var = (o3) ((WeakReference) h6Var.next()).get();
                    if (o3Var == c4Var || o3Var == null) {
                        h6Var.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract void a();

    public abstract void c();

    public abstract void d();

    public abstract boolean g(int i2);

    public abstract void h(int i2);

    public abstract void i(View view);

    public abstract void j(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void k(CharSequence charSequence);
}
