package g;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class n {

    /* renamed from: a, reason: collision with root package name */
    public static final androidx.room.A f2680a = new androidx.room.A(new m());

    /* renamed from: b, reason: collision with root package name */
    public static final int f2681b = -100;

    /* renamed from: c, reason: collision with root package name */
    public static G.f f2682c = null;
    public static G.f d = null;

    /* renamed from: e, reason: collision with root package name */
    public static Boolean f2683e = null;

    /* renamed from: f, reason: collision with root package name */
    public static boolean f2684f = false;

    /* renamed from: g, reason: collision with root package name */
    public static final o.c f2685g = new o.c();
    public static final Object h = new Object();
    public static final Object i = new Object();

    public static boolean b(Context context) {
        if (f2683e == null) {
            try {
                int i2 = AbstractServiceC0117E.f2593a;
                Bundle bundle = context.getPackageManager().getServiceInfo(new ComponentName(context, (Class<?>) AbstractServiceC0117E.class), AbstractC0116D.a() | 128).metaData;
                if (bundle != null) {
                    f2683e = Boolean.valueOf(bundle.getBoolean("autoStoreLocales"));
                }
            } catch (PackageManager.NameNotFoundException unused) {
                Log.d("AppCompatDelegate", "Checking for metadata for AppLocalesMetadataHolderService : Service not found");
                f2683e = Boolean.FALSE;
            }
        }
        return f2683e.booleanValue();
    }

    public static void g(z zVar) {
        synchronized (h) {
            try {
                Iterator it = f2685g.iterator();
                while (true) {
                    o.g gVar = (o.g) it;
                    if (gVar.hasNext()) {
                        n nVar = (n) ((WeakReference) gVar.next()).get();
                        if (nVar == zVar || nVar == null) {
                            gVar.remove();
                        }
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

    public abstract boolean h(int i2);

    public abstract void i(int i2);

    public abstract void j(View view);

    public abstract void k(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void l(CharSequence charSequence);
}
