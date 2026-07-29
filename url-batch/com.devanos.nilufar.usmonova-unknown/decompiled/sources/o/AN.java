package o;

import android.app.Activity;
import android.app.FragmentManager;
import android.os.Build;
import o.CN;

/* loaded from: classes.dex */
public abstract class AN {
    /* JADX WARN: Multi-variable type inference failed */
    public static void a(Activity activity, EnumC0054Bz enumC0054Bz) {
        AbstractC0048Bt.n(enumC0054Bz, "event");
        if (activity instanceof InterfaceC0365Nz) {
            AbstractC0106Dz lifecycle = ((InterfaceC0365Nz) activity).getLifecycle();
            if (lifecycle instanceof C0417Pz) {
                ((C0417Pz) lifecycle).e(enumC0054Bz);
            }
        }
    }

    public static void b(Activity activity) {
        if (Build.VERSION.SDK_INT >= 29) {
            CN.a.Companion.getClass();
            activity.registerActivityLifecycleCallbacks(new CN.a());
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new CN(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }
}
