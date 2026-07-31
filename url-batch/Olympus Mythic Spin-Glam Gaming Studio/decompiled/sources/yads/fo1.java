package yads;

import android.app.Activity;
import android.os.Build;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;

/* loaded from: classes14.dex */
public final class fo1 {
    public static final /* synthetic */ KProperty[] d = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(fo1.class, "activityRef", "getActivityRef()Landroid/app/Activity;", 0))};
    public final qm2 a = new qm2(null);
    public int b = -1;
    public boolean c;

    public final void a(Activity activity) {
        try {
            if (this.c) {
                return;
            }
            if (Build.VERSION.SDK_INT == 26) {
                boolean z = ob1.a;
                return;
            }
            b(activity);
            this.b = activity.getRequestedOrientation();
            activity.setRequestedOrientation(activity.getResources().getConfiguration().orientation == 1 ? 7 : 6);
            this.c = true;
        } catch (Exception e) {
            e.getMessage();
            boolean z2 = ob1.a;
        }
    }

    public final void b(Activity activity) {
        qm2 qm2Var = this.a;
        KProperty kProperty = d[0];
        qm2Var.getClass();
        qm2Var.a = new WeakReference(activity);
    }

    public final void a() {
        if (this.c) {
            try {
                qm2 qm2Var = this.a;
                KProperty kProperty = d[0];
                Activity activity = (Activity) qm2Var.a.get();
                if (activity != null && !activity.isFinishing() && Build.VERSION.SDK_INT != 26) {
                    activity.setRequestedOrientation(this.b);
                }
            } catch (Exception e) {
                e.getMessage();
                boolean z = ob1.a;
            } finally {
                this.c = false;
                this.b = -1;
                b(null);
            }
        }
    }
}
