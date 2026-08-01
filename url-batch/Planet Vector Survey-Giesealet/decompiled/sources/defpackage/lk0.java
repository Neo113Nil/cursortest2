package defpackage;

import android.app.Activity;
import android.app.FragmentManager;
import android.os.Build;
import defpackage.nk0;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public abstract class lk0 {
    /* JADX WARN: Multi-variable type inference failed */
    public static void a(Activity activity, e20 e20Var) {
        e20Var.getClass();
        if (activity instanceof o20) {
            g20 lifecycle = ((o20) activity).getLifecycle();
            if (lifecycle instanceof q20) {
                ((q20) lifecycle).e(e20Var);
            }
        }
    }

    public static void b(Activity activity) {
        if (Build.VERSION.SDK_INT >= 29) {
            nk0.a.Companion.getClass();
            activity.registerActivityLifecycleCallbacks(new nk0.a());
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new nk0(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }
}
