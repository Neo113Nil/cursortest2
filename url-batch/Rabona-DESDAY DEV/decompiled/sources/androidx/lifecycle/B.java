package androidx.lifecycle;

import android.app.Activity;
import android.app.FragmentManager;
import android.os.Build;
import androidx.lifecycle.D;

/* loaded from: classes.dex */
public abstract class B {
    /* JADX WARN: Multi-variable type inference failed */
    public static void a(Activity activity, EnumC0069l enumC0069l) {
        t d;
        X0.d.e(activity, "activity");
        X0.d.e(enumC0069l, "event");
        if (!(activity instanceof r) || (d = ((r) activity).d()) == null) {
            return;
        }
        d.d(enumC0069l);
    }

    public static void b(Activity activity) {
        X0.d.e(activity, "activity");
        if (Build.VERSION.SDK_INT >= 29) {
            D.a.Companion.getClass();
            activity.registerActivityLifecycleCallbacks(new D.a());
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new D(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }
}
