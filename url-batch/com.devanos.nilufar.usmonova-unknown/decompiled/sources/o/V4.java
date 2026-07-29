package o;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public abstract class V4 {
    public static final U4 h = new U4(new ExecutorC2239xi(3));
    public static final int i = -100;
    public static IA j = null;
    public static IA k = null;
    public static Boolean l = null;
    public static boolean m = false;
    public static final N6 n = new N6(0);

    /* renamed from: o, reason: collision with root package name */
    public static final Object f118o = new Object();
    public static final Object p = new Object();

    public static boolean c(Context context) {
        if (l == null) {
            try {
                int i2 = AbstractServiceC1082g6.h;
                Bundle bundle = context.getPackageManager().getServiceInfo(new ComponentName(context, (Class<?>) AbstractServiceC1082g6.class), AbstractC1016f6.a() | 128).metaData;
                if (bundle != null) {
                    l = Boolean.valueOf(bundle.getBoolean("autoStoreLocales"));
                }
            } catch (PackageManager.NameNotFoundException unused) {
                Log.d("AppCompatDelegate", "Checking for metadata for AppLocalesMetadataHolderService : Service not found");
                l = Boolean.FALSE;
            }
        }
        return l.booleanValue();
    }

    public static void f(LayoutInflaterFactory2C1213i5 layoutInflaterFactory2C1213i5) {
        synchronized (f118o) {
            try {
                N6 n6 = n;
                n6.getClass();
                F6 f6 = new F6(n6);
                while (f6.hasNext()) {
                    V4 v4 = (V4) ((WeakReference) f6.next()).get();
                    if (v4 == layoutInflaterFactory2C1213i5 || v4 == null) {
                        f6.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract void a();

    public abstract void b();

    public abstract void d();

    public abstract void e();

    public abstract boolean g(int i2);

    public abstract void h(int i2);

    public abstract void i(View view);

    public abstract void j(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void k(CharSequence charSequence);

    public abstract B1 l(A1 a1);
}
