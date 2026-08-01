package defpackage;

import android.app.Activity;
import android.app.FragmentManager;
import android.os.Build;
import androidx.lifecycle.a;
import defpackage.mz;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public abstract class kz {
    /* JADX WARN: Multi-variable type inference failed */
    public static void a(Activity activity, fp fpVar) {
        a e;
        fpVar.getClass();
        if (!(activity instanceof lp) || (e = ((lp) activity).e()) == null) {
            return;
        }
        e.d(fpVar);
    }

    public static void b(Activity activity) {
        if (Build.VERSION.SDK_INT >= 29) {
            mz.a.Companion.getClass();
            activity.registerActivityLifecycleCallbacks(new mz.a());
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new mz(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }
}
